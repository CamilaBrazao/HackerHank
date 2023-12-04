import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contador = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<contador;i++){
            String pattern = sc.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
