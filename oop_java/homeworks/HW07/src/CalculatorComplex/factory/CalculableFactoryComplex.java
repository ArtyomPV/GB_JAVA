package CalculatorComplex.factory;

import CalculatorComplex.calculator.CalculableComplex;
import CalculatorComplex.calculator.CalculatorComplex;


public class CalculableFactoryComplex implements ICalculableFactoryComplex {
    public CalculableComplex create(int primaryRealArg, int primaryImagArg){
        return new CalculatorComplex(primaryRealArg, primaryImagArg);
    }

}
