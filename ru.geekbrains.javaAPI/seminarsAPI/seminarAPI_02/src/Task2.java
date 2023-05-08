import java.util.Scanner;

public class Task2 {
    String string;
    boolean repeated;

    public Task2() {
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
        sc.close();
    }

    public void compressLine() {
        StringBuilder sb = new StringBuilder();
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            repeated = false;
            for (int j = i+1; j < chars.length; j++) {
                if(chars[i] == chars[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                sb.append(chars[i]);
            }
        }
        System.out.println(sb);
    }
}
