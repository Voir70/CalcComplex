package calculator;
public interface ComplexNumber {
    ComplexNumberImpl add(ComplexNumberImpl num);

    ComplexNumberImpl subtract(ComplexNumberImpl num);

    ComplexNumberImpl multiply(ComplexNumberImpl num);

    ComplexNumberImpl divide(ComplexNumberImpl num);

    String toString();
}