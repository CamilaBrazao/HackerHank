import java.util.Scanner;

public class staticInitialization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        try {
            if (b >= 0 && b <= 100 && h >= 0 && h <= 100) {
                int parelo = b * h;
                System.out.println(parelo);
            }
            else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
        catch (Exception e){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }
}
