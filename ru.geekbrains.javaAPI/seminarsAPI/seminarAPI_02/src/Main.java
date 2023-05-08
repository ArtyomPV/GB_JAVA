import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String str = "asd fgh ffd dfgdf dd";
        String str2 = "dsa";
        System.out.println(str2.equals(str));
        String regex = "\\s";
        String[] list = str.split(regex);
        for (String item : list) {
            System.out.println(item);
        }


        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        //region Description
//        Task1 task1 = new Task1();
//        task1.getResult();
        //endregion

        //<editor-fold desc="Description">
//        Task2 task2 = new Task2();
//        task2.compressLine();
        //</editor-fold>

        //region Description
//        Task3 task3 = new Task3();
//        task3.printResult();
//
//        System.out.println(isPolinDromAnaotherMethod("asdfdsa"));
        //endregion
        Task4 task4 = new Task4();
        try {
            task4.writer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isPolinDromAnaotherMethod(String string){
        return string.equals((new StringBuilder(string).reverse().toString()));
    }
}