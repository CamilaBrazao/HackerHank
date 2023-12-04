import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class numeracaoToken {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String sentenca = sc.nextLine();
        sentenca = sentenca.replaceAll("[^a-zA-Z] "," ");
        sentenca = sentenca.replace("   "," ");

        String[] separacao = sentenca.split(" ");
        int contador = 0;
        for(String x : separacao){
            if (!x.trim().isEmpty()){
                contador++;
            }
        }
        System.out.println(contador);

        for(String x : separacao){
            if (!x.trim().isEmpty()){
            System.out.println(x);
        }}

        sc.close();
    }
}
