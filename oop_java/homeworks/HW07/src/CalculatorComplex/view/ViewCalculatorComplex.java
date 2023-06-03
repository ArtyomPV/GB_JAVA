package CalculatorComplex.view;

import CalculatorComplex.calculator.CalculableComplex;
import CalculatorComplex.factory.ICalculableFactoryComplex;

import java.util.Scanner;

public class ViewCalculatorComplex {
    private ICalculableFactoryComplex calculableFactoryComplex;

    public ViewCalculatorComplex(ICalculableFactoryComplex calculableFactoryComplex) {
        this.calculableFactoryComplex = calculableFactoryComplex;
    }

    public void run() {
        while (true) {
            int primaryTrueArg = promptInt("Введите вещественную часть комплексного первого числа: ");
            int primaryImagArg = promptInt("Введите мнимую часть комплексного первого числа: ");

            CalculableComplex calculatorComplex = calculableFactoryComplex.create(primaryTrueArg, primaryImagArg);

//            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int realArg = promptInt("Введите вещественную часть комплексного второго числа: ");
                    int imagArg = promptInt("Введите мнимую часть комплексного второго числа: ");
                    calculatorComplex.multi(realArg, imagArg);
//                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int realArg = promptInt("Введите вещественную часть комплексного второго числа: ");
                    int imagArg = promptInt("Введите мнимую часть комплексного второго числа: ");
                    calculatorComplex.sum(realArg, imagArg);
//                    int arg = promptInt("Введите второй аргумент: ");
//                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {

                    String result = calculatorComplex.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
