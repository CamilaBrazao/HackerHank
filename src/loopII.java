import java.util.Scanner;

public class loopII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            double res = a+(b*Math.pow(2,0));
            System.out.print("");
            for(double j=1;j<=n;j++){
                System.out.printf("%.0f ",res);
                res = res + (b*Math.pow(2,j));
            }
    }
    sc.close();
}}