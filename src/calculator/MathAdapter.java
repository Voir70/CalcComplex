package calculator;

public class MathAdapter {
    private double real;
    private double imaginary;

    public MathAdapter(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public MathAdapter add(MathAdapter complexNumber) {
        double realResult = this.real + complexNumber.real;
        double imaginaryResult = this.imaginary + complexNumber.imaginary;
        return new MathAdapter(realResult, imaginaryResult);
    }

    public MathAdapter subtract(MathAdapter complexNumber) {
        double realResult = this.real - complexNumber.real;
        double imaginaryResult = this.imaginary - complexNumber.imaginary;
        return new MathAdapter(realResult, imaginaryResult);
    }

    public MathAdapter multiply(MathAdapter complexNumber) {
        double realResult = this.real * complexNumber.real - this.imaginary * complexNumber.imaginary;
        double imaginaryResult = this.real * complexNumber.imaginary + this.imaginary * complexNumber.real;
        return new MathAdapter(realResult, imaginaryResult);
    }

    public MathAdapter divide(MathAdapter complexNumber) {
        double factor = Math.pow(complexNumber.real, 2) + Math.pow(complexNumber.imaginary, 2);
        double realResult = (this.real * complexNumber.real + this.imaginary * complexNumber.imaginary) / factor;
        double imaginaryResult = (this.imaginary * complexNumber.real - this.real * complexNumber.imaginary) / factor;
        return new MathAdapter(realResult, imaginaryResult);
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

    public double getArgument() {
        return Math.atan2(this.imaginary, this.real);
    }
}