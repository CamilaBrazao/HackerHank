import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UmDArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int item = sc.nextInt();
            lista.add(item);
        }
        for(int item:lista){
            System.out.println(item);
        }

        sc.close();
    }
}
