import java.util.Scanner;

public class substring {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(s.substring(start,end));

        sc.close();
    }
}
