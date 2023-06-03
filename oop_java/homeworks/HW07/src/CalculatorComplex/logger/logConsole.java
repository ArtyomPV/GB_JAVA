package CalculatorComplex.logger;

import java.time.LocalDateTime;

public class logConsole implements Logger{
    @Override
    public void login(String message) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time + " " + message);
    }
}
