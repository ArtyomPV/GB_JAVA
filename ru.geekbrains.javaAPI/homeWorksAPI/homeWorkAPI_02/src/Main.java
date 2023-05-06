import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir");
        String pathFileToRead = path.concat("\\ru.geekbrains.javaAPI\\homeWorksAPI\\homeWorkAPI_02\\src\\data.json");
        String pathFileToSave = path.concat("\\ru.geekbrains.javaAPI\\homeWorksAPI\\homeWorkAPI_02\\src\\data.txt");

        String[] data = Task1.readText(pathFileToRead);
        for(String line: data){
            System.out.println(line);
        }
        StringBuilder sb = Task1.parseText(data[0]);
        System.out.println();
        System.out.println(sb);
        System.out.println("Запись в файл:");
        Task1.saveText(sb.toString(), pathFileToSave);

    }
}