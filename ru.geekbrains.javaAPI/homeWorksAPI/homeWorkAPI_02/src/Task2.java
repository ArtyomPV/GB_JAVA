import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {

    public Task2() throws IOException {
    }

    public static int[] bubbleSort(int[] array) throws IOException {
        Logger log = startLogger();
        int tempValue;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i]>array[j]){
                    log.info(String.format("Замена элемента %d " +
                            "с индексом %d на элемент %d с индексом %d ",array[i], i,array[j],j ));
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }

        }

        log.log(Level.WARNING, "Сортировка завершена");
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                System.out.print(array[i]);
            } else  System.out.print(array[i] +  ", ");
        }{

        }
    }

    private static Logger startLogger() throws IOException {
        Logger logger = Logger.getLogger((Task2.class.getName()));
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("ru.geekbrains.javaAPI\\homeWorksAPI\\homeWorkAPI_02\\src\\log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        return logger;
    }


}
