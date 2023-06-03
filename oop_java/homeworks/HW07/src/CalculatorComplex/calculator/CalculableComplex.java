package CalculatorComplex.calculator;

public interface CalculableComplex {
    CalculableComplex sum(int realArg, int imagArg);
    CalculableComplex multi(int realArg, int imagArg);
    String getResult();
}
