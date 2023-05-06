import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03_tryDemo {
    public static void main(String[] args) {
        String text = "empty";
        String pathDir = System.getProperty("user.dir");
        String pathFile = pathDir.concat("\\ru.geekbrains.javaAPI\\lecturesAPI\\lessonAPI_02\\src\\tryDemo.txt");
        File file = new File(pathFile);
        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File existed");
                FileWriter fileWriter = new FileWriter(file, true );
                fileWriter.write("text");
                fileWriter.write("\n");
                fileWriter.append(text);
                fileWriter.append("\n");
                fileWriter.close();
            }
        } catch (Exception e) {

        } finally {
            System.out.println("------------------------");
        }
    }
}
