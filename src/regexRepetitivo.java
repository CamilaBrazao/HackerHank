import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexRepetitivo {
    public static void main(String[] args){
        Pattern padrao = Pattern.compile("\\b(\\w+)\\b\\s+(\\1\\b\\s*)+", Pattern.CASE_INSENSITIVE);
        //inserir o padrão e colocar opção de case insensitive
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.nextLine();
        while(x-->0){
            String sentenca = sc.nextLine();
            Matcher m = padrao.matcher(sentenca);//encontrar as correspondencias que podem ter na sentença
            sentenca = m.replaceAll("$1 ");// substituição das palavras repetidas
            System.out.println(sentenca);
        }
        sc.close();
    }
}
