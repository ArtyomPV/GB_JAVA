import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task4 {
    public StringBuilder generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public void writer() throws IOException {
        String path = System.getProperty("user.dir");
        String pathFile = path.concat("\\ru.geekbrains.javaAPI\\seminarsAPI\\seminarAPI_02\\src\\TEST.txt");
//        File file = new File(pathFile);
        FileOutputStream fos = new FileOutputStream(pathFile, true);
            fos.write(generateString().toString().getBytes());
            fos.close();


    }
}
