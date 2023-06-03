package CalculatorComplex.factory;

import CalculatorComplex.calculator.CalculableComplex;
import CalculatorComplex.calculator.CalculatorComplexLogger;
import CalculatorComplex.logger.Logger;

public class CalculableFactoryComplexLogger implements ICalculableFactoryComplex{
    Logger logger;
    ICalculableFactoryComplex iCalculableComplex;

    public CalculableFactoryComplexLogger(Logger logger, ICalculableFactoryComplex iCalculableComplex) {
        this.logger = logger;
        this.iCalculableComplex = iCalculableComplex;
    }

    @Override
    public CalculableComplex create(int primaryRealArg, int primaryImagArg) {
        return new CalculatorComplexLogger(logger, iCalculableComplex.create(primaryRealArg, primaryImagArg));
    }
}
