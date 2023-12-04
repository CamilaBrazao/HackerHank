import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lexicografica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentenca = sc.next();
        int tamanho = sc.nextInt();

        List<String> listaDeSubString = obterSubStrings(sentenca,tamanho);
        System.out.println(listaDeSubString.get(0));
        System.out.println(listaDeSubString.get(listaDeSubString.size()-1));

        sc.close();
    }

    public static List<String> obterSubStrings(String sentenca, int tamanho){
        List<String> listaDeSubString = new ArrayList<>();

        for(int i = 0; i<= sentenca.length()-tamanho;i++){
            String substrings = sentenca.substring(i,tamanho + i);
            listaDeSubString.add(substrings);
        }
        Collections.sort(listaDeSubString);
        return listaDeSubString;
    }
}
