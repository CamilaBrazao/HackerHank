import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexMyIp {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String ip = sc.nextLine();
        if(MyRegex(ip)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        sc.close();
    }

    private static boolean MyRegex(String ip){

        String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$|^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";
        Pattern compiler = Pattern.compile(pattern);
        Matcher matcher = compiler.matcher(ip);

        return matcher.matches();
    }
}
