import java.io.*;

public class Task1 {

    public static String[] readText(String path) throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fr);
        String str;
        int sizeTextArray = 0;
        while((str = bufferedReader.readLine()) != null){
            sizeTextArray ++;
        }
        bufferedReader.close();

        String[] textArray = new String[sizeTextArray];
        int i = 0;
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path));
        while((str = bufferedReader1.readLine()) != null){
            textArray[i] = str;
            i++;
        }
        bufferedReader1.close();

        return textArray;
    }

    static void saveText(String string, String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        fileOutputStream.write(string.getBytes());
        fileOutputStream.close();


    }

    static StringBuilder parseText(String text){
        String line;
        line = text.replace("{", "").replace("}", "").replace("\"", "");

        System.out.println(line);
        System.out.println();
        StringBuilder stringBuilder = new StringBuilder("select * from students where: \n");
        String[] lineArray = line.split(",\\s");
        for(int i = 0; i < lineArray.length; i ++){
            String[] lineArr = lineArray[i].split(":");
                if(!lineArr[1].equals("null")){
                    if(i != 0){
                        stringBuilder.append(", ");
                        stringBuilder.append(lineArray[i]);
                    } else {
                        stringBuilder.append(lineArray[i]);
                    }
                }
            }

        return stringBuilder;
    }
}
