import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listDeQueries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int item = 0;
        List<Integer> list = new ArrayList<>();
        int x = sc.nextInt();

        for(int i = 0;i<x;i++){
            item = sc.nextInt();
            list.add(item);
        }

        int y = sc.nextInt();
        String action;
        int index;
        for(int i = 0;i<y;i++) {
            action = sc.next().toLowerCase();
            if (action.equals("insert")) {
                index = sc.nextInt();
                list.add(index, sc.nextInt());
            }
            if (action.equals("delete")) {
                index = sc.nextInt();
                list.remove(index);
            }
        }

        for(int number:list){
            System.out.print(number + " ");
        }
        sc.close();
    }
}
