import java.util.ArrayList;

public class ArrayListExample {
    public static void start(){

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("Hello");
        String s6 = new String(new char[]{'h' + 'e' + 'l' + 'l' + 'o'});

        ArrayList<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i != j){
                    boolean flag = list.get(i) == list.get(j);
                    System.out.println((i+1) + " " + (j +1) + " == " + flag);
                    System.out.println((i+1) + " " + (j +1) + " equals " + list.get(i).equals(list.get(j)));
                    System.out.println("+++++++++++++++++++++++++++++++++");
                }
            }

        }
    }
    /*
    Даны следующие строки, сравнить их с помощью == и метода equals() класса Object
     */

}
