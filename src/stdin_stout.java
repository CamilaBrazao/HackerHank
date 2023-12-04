import java.util.Locale;
import java.util.Scanner;

public class stdin_stout {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        String vazio = sc.nextLine();
        String z = sc.nextLine();

        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
    }
}
