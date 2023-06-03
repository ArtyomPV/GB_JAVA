package CalculatorComplex.calculator;

import CalculatorComplex.logger.Logger;

public class CalculatorComplexLogger implements CalculableComplex{
    private Logger logger;
    private CalculableComplex calculableComplex;

    public CalculatorComplexLogger(Logger logger, CalculableComplex calculableComplex) {
        this.logger = logger;
        this.calculableComplex = calculableComplex;
        logger.login("Первое число - " + calculableComplex.getResult() + "\n");
    }

    @Override
    public CalculableComplex sum(int realArg, int imagArg) {
        logger.login("Суммируем со вторым числом " + realArg + " + " + imagArg + "j");
        return calculableComplex.sum(realArg, imagArg);
    }

    @Override
    public CalculableComplex multi(int realArg, int imagArg) {
        logger.login("Умножаем на второе число " + realArg + " + " + imagArg + "j");
        return calculableComplex.multi(realArg, imagArg);
    }

    @Override
    public String getResult() {
        String result = calculableComplex.getResult();
        logger.login("Результат " + result);
        return result;
    }
}

