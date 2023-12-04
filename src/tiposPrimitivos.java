import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tiposPrimitivos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try{
                Long x = sc.nextLong();
                System.out.printf("%d can be fitted in:\n",x);
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                } if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                } if (x >= Integer.MIN_VALUE && x<= Integer.MAX_VALUE) {
                    System.out.println("* int");
                } if (x>= Long.MIN_VALUE && x<=Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
            catch (InputMismatchException e){
                System.out.println(sc.next()+" can't be fitted.");
            }
        }
        sc.close();
}}
