import java.util.Arrays;
import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String palavra = sc.next();

        if (isPolindromo(palavra)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        sc.close();
    }

    public static boolean isPolindromo(String palavra){
        palavra = palavra.replaceAll("[^a-zA-Z]","");

        int esquerdo = 0;
        int direito = palavra.length()-1;

        while(esquerdo<direito){
            if(palavra.charAt(esquerdo) != palavra.charAt(direito)){
                return false;
            }
            else {
                esquerdo++;
                direito--;
            }
        }
        return true;
    }
}
