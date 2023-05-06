import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task03 {

    public static String[] readFile(String path) {
        String[] lineArray;
        String str;
        int sizeArray = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((str = bufferedReader.readLine()) != null) {
                sizeArray++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }

        lineArray = new String[sizeArray];
        try {
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path));
            int i = 0;
            while ((str = bufferedReader1.readLine()) != null) {
                lineArray[i++] = str;
            }
            bufferedReader1.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
        return lineArray;
    }

    public static StringBuilder ParsingText(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String newString = string.replace("[","").replace("]","")
                .replace("{","").replace("}","").replace("\"", "");
        System.out.println(newString);
        String[] text = newString.split(",");
        String[] answer = {"Студент ", " получил ", " по предмету "};
        for (int i = 0; i < text.length; i++) {
            String[] value = text[i].split(":");
            stringBuilder.append(answer[i]);
            stringBuilder.append(value[1]);
        }
        return stringBuilder;
    }
}
