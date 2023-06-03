package CalculatorComplex;

import CalculatorComplex.factory.CalculableFactoryComplex;
import CalculatorComplex.factory.CalculableFactoryComplexLogger;
import CalculatorComplex.factory.ICalculableFactoryComplex;
import CalculatorComplex.logger.Logger;
import CalculatorComplex.logger.logConsole;
import CalculatorComplex.view.ViewCalculatorComplex;

public class MainApp {
    public static void main(String[] args) {
        CalculableFactoryComplex calculableFactoryComplex = new CalculableFactoryComplex();
        Logger logger = new logConsole();
        ICalculableFactoryComplex complex = new CalculableFactoryComplexLogger(new logConsole(), calculableFactoryComplex );
        ViewCalculatorComplex view = new ViewCalculatorComplex(complex);
        view.run();

    }
}
