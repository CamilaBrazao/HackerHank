import java.util.Scanner;

public class somaDeStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.next();
        int soma = a.length() + b.length();
        int compare = a.compareTo(b);

        System.out.println(soma);
        if(compare>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(a.substring(0,1).toUpperCase() +a.substring(1).toLowerCase() + " " +
                b.substring(0,1).toUpperCase() + b.substring(1).toLowerCase());

        sc.close();
    }
}
