import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //region Решение первой задачи
//        String path = System.getProperty("user.dir");
//        String pathFileToRead = path.concat("\\ru.geekbrains.javaAPI\\homeWorksAPI\\homeWorkAPI_02\\src\\data.json");
//        String pathFileToSave = path.concat("\\ru.geekbrains.javaAPI\\homeWorksAPI\\homeWorkAPI_02\\src\\data.txt");
//
//        String[] data = Task1.readText(pathFileToRead);
//        for(String line: data){
//            System.out.println(line);
//        }
//        StringBuilder sb = Task1.parseText(data[0]);
//        System.out.println();
//        System.out.println(sb);
//        System.out.println("Запись в файл:");
//        Task1.saveText(sb.toString(), pathFileToSave);
        //endregion

        //region Решение второй задачи
//        int[] array = {1, 5, 6, 3, 7, 2};
//        Task2.printArray(array);
//        int[] sortedArray = Task2.bubbleSort(array);
//        System.out.println();
//        Task2.printArray(sortedArray);
        //endregion


        //region Решение третьей задачи
//        String path = System.getProperty("user.dir");
//        String pathReadFile = path.concat("\\ru.geekbrains.javaAPI\\homeWorksAPI\\homeWorkAPI_02\\src\\task3.txt");
//        String[] data;
//        data = Task03.readFile(pathReadFile);
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(Task03.ParsingText(data[i]));
//        }
        //endregion

        Task4.run();
    }
}