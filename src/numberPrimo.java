import java.math.BigInteger;
import java.util.Scanner;

public class numberPrimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int certainty = 11;
        BigInteger number = sc.nextBigInteger();

        Boolean isPrime = number.isProbablePrime(certainty);

        if(isPrime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
