import java.util.HashMap;
import java.util.Scanner;

public class javaMap {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> hash = new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            hash.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(hash.containsKey(s)){
                int out = hash.get(s);
                System.out.println(s+"="+out);
            }
            else{
                System.out.println("Not found");
            }
        }  
    }
}