package CalculatorComplex.factory;

import CalculatorComplex.calculator.CalculableComplex;

public interface ICalculableFactoryComplex {
    CalculableComplex create(int primaryRealArg, int primaryImagArg);
}
