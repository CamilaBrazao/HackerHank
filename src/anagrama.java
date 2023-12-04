import java.util.Arrays;
import java.util.Scanner;

public class anagrama {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String palavra1 = sc.next();
        String palavra2 = sc.next();

        if(isAnagrama(palavra1,palavra2)){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
        sc.close();
    }
    public static boolean isAnagrama(String palavra1, String palavra2){

        //tirar todos os espaços
        palavra1 = palavra1.replaceAll("\\s","").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s","").toLowerCase();

        //ver se tem os tamanhos iguais
        if(palavra1.length() != palavra2.length()){
            return false;
        }

        // colocar em um array de caracteres
        char[] charPalavra1 = palavra1.toCharArray();
        char[] charPalavra2 = palavra2.toCharArray();

        //colocar em ordem
        Arrays.sort(charPalavra1);
        Arrays.sort(charPalavra2);

        //verificar igualdade
        return Arrays.equals(charPalavra1,charPalavra2);
    }
}
