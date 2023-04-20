package calculator;
public class CalculatorFacade extends Calculator {
    public CalculatorFacade(double r, double i) {
        super(r, i);
    }

//    private Calculator calculator;
//
//
//    public CalculatorFacade(firstOperand, secondOperand) {
//
//        this.calculator = new Calculator();
//
//    }
//
//
//
//
//    public void add(double firstOperand, double secondOperand) {
//
//        return calculator.add(firstOperand, secondOperand);
//
//    }
//
//
//    public double subtract(double firstOperand, double secondOperand) {
//
//        return calculator.subtract(firstOperand, secondOperand);
//
//    }
//
//
//    public double multiply(double firstOperand, double secondOperand) {
//
//        return calculator.multiply(firstOperand, secondOperand);
//
//    }
//
//
//    public double divide(double dividend, double divisor) {
//
//        if (divisor == 0) {
//
//            throw new ArithmeticException("Division by zero");
//
//        }
//
//        return calculator.divide(dividend, divisor);
//
//    }
//
//}


    public class Calculator {

        public double add(double firstOperand, double secondOperand) {

            return firstOperand + secondOperand;

        }


        public double subtract(double firstOperand, double secondOperand) {

            return firstOperand - secondOperand;

        }


        public double multiply(double firstOperand, double secondOperand) {

            return firstOperand * secondOperand;

        }


        public double divide(double dividend, double divisor) {

            return dividend / divisor;

        }

    }
}