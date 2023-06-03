package CalculatorComplex;

import CalculatorComplex.factory.CalculableFactoryComplex;
import CalculatorComplex.view.ViewCalculatorComplex;

public class MainApp {
    public static void main(String[] args) {
        CalculableFactoryComplex calculableFactoryComplex = new CalculableFactoryComplex();
        ViewCalculatorComplex view = new ViewCalculatorComplex(calculableFactoryComplex);
        view.run();

    }
}
