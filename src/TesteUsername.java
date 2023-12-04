import subclasse.UsernameValidator;

import java.util.Scanner;

public class TesteUsername {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.nextLine();
        while(x--!=0){
            String userName = sc.nextLine();
            if(userName.matches(UsernameValidator.regularExpression)){
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}
