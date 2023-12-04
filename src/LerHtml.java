import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LerHtml {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("<.*?>(.*?)</.*?>");

        int x = sc.nextInt();
        sc.nextLine();

         String html = sc.nextLine();
         Matcher m = pattern.matcher(html);

         while (m.find()) {
             String tag = m.group(1);
             String content = m.group(2);
             System.out.println(content);
         }
        sc.close();
    }
}
