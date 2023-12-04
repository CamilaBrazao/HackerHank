import java.util.ArrayList;
import java.util.Scanner;

public class listaDeMatrizesJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        ArrayList[] lista = new ArrayList[20001];
        int numerador = 0;
        int numero = 0;


        for(int i = 1; i <= x; i++){
            numerador = sc.nextInt();
            lista[i] = new ArrayList<>();
            for (int j = 1; j <= numerador;j++){
                numero = sc.nextInt();
                lista[i].add(numero);
            }
        }

        int numberador2 = sc.nextInt();
        int z;
        int y;
        for(int i = 0; i < numberador2;i++){
            z = sc.nextInt();
            y = sc.nextInt();
            try {
                System.out.println(lista[z].get(y-1));// -1 porque o indice começa com 0 o menos é pra igualar
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}