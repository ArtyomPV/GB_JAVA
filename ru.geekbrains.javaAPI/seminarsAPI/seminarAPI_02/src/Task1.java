import java.util.Scanner;

public class Task1 {
    int n;
    char c1;
    char c2;
        Task1(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите четное число: ");
             n = sc.nextInt();
            System.out.println("Введите первый символ: ");
             c1 = sc.next().charAt(0);
            System.out.println("Введите второй символ: ");
             c2 = sc.next().charAt(0);
            sc.close();
        }
        private boolean isOdd(int n){
            return n % 2 == 0;
//            if(n%2 == 0) return true;
//            return false;
        }

        public void getResult(){
            if(isOdd(n)){
                StringBuilder result = new StringBuilder();
                for (int i = 0; i <= n/2; i++) {
                    result.append(c1);
                    result.append(c2);
                }
                System.out.println(result);
            } else {
                System.out.println("Введенное число не четное");
            }

        }
}
