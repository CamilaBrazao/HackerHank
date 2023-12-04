import java.util.Scanner;

public class intToString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=-100 && n<=100){
            String x = String.valueOf(n);
            if(x instanceof String){
                System.out.println("Good job");
            }
            else {
                System.out.println("Wrong job");
            }
        }
        sc.close();
    }
}
