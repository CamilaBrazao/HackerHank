import java.util.Scanner;

public class printF {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for(int i = 0; i<3; i++){
            String x = sc.next();
            int y = sc.nextInt();
            System.out.printf("%-15s %03d \n",x,y);
        }
        System.out.println("================================");

        sc.close();
    }
}
