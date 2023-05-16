import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    public static int firstNumber;
    public static int secondNumber;
    public static String arithmeticAction;

    public static void run() throws IOException {
        Logger logger = pointLog();
        FileHandler fh = fileHandler(logger);
        logger.info("Программа запущена.");
        do {
            firstNumber = Integer.parseInt(inputValue("Input first number: "));
            logger.info(String.format("Введено первое число: %d", firstNumber));
            arithmeticAction = inputValue("Input action: ");
            logger.info(String.format("Введено арифметическое действие: %s", arithmeticAction));
            secondNumber = Integer.parseInt(inputValue("Input second number: "));
            logger.info(String.format("Введено второе число: %d", secondNumber));
            closeFileHandler(fh);
            action(firstNumber, secondNumber, arithmeticAction);
        } while (inputValue("\nContinue... y/n").equals("y"));

        System.out.println("Exit");

        Logger logger1 = pointLog();
        FileHandler fh1 = fileHandler(logger1);
        logger.info("Программа завершена.");
        closeFileHandler(fh1);
    }

    private static String inputValue(String text) {
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void action(int firstNumber, int secondNumber, String arithmeticAction) throws IOException {
        Logger logger = pointLog();
        FileHandler fh = fileHandler(logger);
        switch (arithmeticAction) {
            case "+":
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
                logger.info(String.format("результат сложения %d", firstNumber + secondNumber ));
                break;
            case "-":
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
                logger.info(String.format("результат вычитания %d", firstNumber - secondNumber ));
                break;
            case "*":
                System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
                logger.info(String.format("результат умножения %d", firstNumber * secondNumber ));
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.printf("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber);
                    logger.info(String.format("результат деления %d", firstNumber / secondNumber ));
                    break;
                } else {
                    logger.log(Level.WARNING, "деление на ноль");
                    System.out.println("Division by zero is not possible");
                }
        }
        closeFileHandler(fh);
    }
    private static Logger pointLog() throws IOException {
        Logger logger = Logger.getLogger(Task4.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        return logger;
    }
    private static FileHandler fileHandler(Logger logger) throws IOException {
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("ru.geekbrains.javaAPI\\homeWorksAPI\\homeWorkAPI_02\\src\\logCalculator.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        return  fh;
    }
    private static void closeFileHandler(FileHandler file){
        file.close();
    }

}
