package calculator;

public class ComplexNumberImpl implements ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumberImpl(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumberImpl add(ComplexNumberImpl num) {
        double real = this.real + num.getReal();
        double imaginary = this.imaginary + num.getImaginary();
        return new ComplexNumberImpl(real, imaginary);
    }

    public ComplexNumberImpl subtract(ComplexNumberImpl num) {
        double real = this.real - num.getReal();
        double imaginary = this.imaginary - num.getImaginary();
        return new ComplexNumberImpl(real, imaginary);
    }

    public ComplexNumberImpl multiply(ComplexNumberImpl num) {
        double real = this.real * num.getReal() - this.imaginary * num.getImaginary();
        double imaginary = this.real * num.getImaginary() + this.imaginary * num.getReal();
        return new ComplexNumberImpl(real, imaginary);
    }

    public ComplexNumberImpl divide(ComplexNumberImpl num) {
        double denominator = num.getReal() * num.getReal() + num.getImaginary() * num.getImaginary();
        double real = (this.real * num.getReal() + this.imaginary * num.getImaginary()) / denominator;
        double imaginary = (this.imaginary * num.getReal() - this.real * num.getImaginary()) / denominator;
        return new ComplexNumberImpl(real, imaginary);
    }

    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}
