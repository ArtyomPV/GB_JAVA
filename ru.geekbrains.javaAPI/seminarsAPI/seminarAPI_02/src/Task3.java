import java.util.Scanner;

public class Task3 {
    String string;

    Task3(){
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
        sc.close();
    }

    public String reverse(String string){
        String reverseString = "";
        for (int i = string.length()-1; i>= 0; --i) {
            reverseString += string.charAt(i);
        }
        return reverseString;
    }
    public boolean isPolimdrom(String string){
        return string.equals(reverse(string));
    }

    public void printResult(){
        if(isPolimdrom(string)){
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
    }
}











