import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        FileReader fr = null;
        try {
             fr = new FileReader("test");
             fr.read();
        } catch (RuntimeException |IOException e) {
            System.out.println("catch Exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if(fr != null){
                try{
                    fr.close();
                } catch (IOException e){
                    System.out.println("Exception while close");
                }
            }
            System.out.println("Finally finished");

        }


        //region Description
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());
        //endregion


        //region Description
        //        String number = "1234d";
        //        int num = Integer.parseInt(number);
        //        System.out.println(num);
        //endregion

        //region Description
        //        Object object1 = new String("123");
        //        File file = (File) object1;
        //        System.out.println(file );
        //endregion


        //region Description
        //        String name = null;
        //        System.out.println(name.length());
        //endregion
    }
}