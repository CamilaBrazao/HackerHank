import java.util.Scanner;

public class javaLopp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();

            for(int i=1; i<=10;i++){
                int res = x * i;
                System.out.printf("%d x %d = %d\n",x,i,res);
            }
        sc.close();
    }
}
