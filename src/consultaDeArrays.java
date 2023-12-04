import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class consultaDeArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        int x = sc.nextInt();
        for (int i = 0;i<x;i++){
            int numeroDeItens = sc.nextInt();
            for(int j=0;j<numeroDeItens;j++){
                int item = sc.nextInt();
                array.add(item);
            }
        }

        int y = sc.nextInt();
        for (int i=0;i<y;i++){
            int c = sc.nextInt();
            int l = sc.nextInt();
        }


        sc.close();
    }
}
