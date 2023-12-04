import java.util.Scanner;

public class EOF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line;
        int i = 1;
        while(sc.hasNext()){
            if(sc.hasNext()){
                line = sc.nextLine();
                System.out.printf("%d %s\n",i,line);
                i++;
            }
            else{
                break;
            }
        }
        sc.close();
    }
}