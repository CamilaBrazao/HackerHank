import java.util.HashSet;
import java.util.Scanner;

public class Hashset{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int t =  sc.nextInt();
        
        HashSet<String> set = new HashSet<>();
        String[] left = new String[t];
        String[] right = new String[t];

        for(int i = 0;i<t;i++){
            left[i] = sc.next();
            right[i] = sc.next();
            if(!set.contains(left[i]) && !set.contains(right[i])){
                set.add(left[i] + " " +right[i]);
                System.out.println(set.size());
            }
            else{
                System.out.println(set.size());
            }
        }   
    }
}