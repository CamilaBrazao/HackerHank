import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;


//nao consegui
//precisava fazer com os numeros fosse impressos do jeito que foram inseridos
public class bigDecimal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<String> numbersString = new ArrayList<>();

        for(int i =0;i<x;i++){
            String numberString = sc.next();
            numbersString.add(numberString);
        }


        for (String numberString : numbersString) {
            BigDecimal number = new BigDecimal(numberString);
            Collections.reverse(numbersString);
            System.out.println(number);
        }

        sc.close();
    }
}
