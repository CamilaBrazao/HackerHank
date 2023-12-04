import java.util.Arrays;
import java.util.Scanner;

public class somaDeMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] array = new int[x];
        int soma = 0;
        int negatives = 0;

        for(int i = 0; i < x; i++){
            array[i] = sc.nextInt();
        }

        //calcular as somas negativas
        for(int i = 0; i < x; i++){
            //o subarray é um unico elemento então j = i
            for(int j = 0; j < x; j++){
                //aqui k vai somar os elementos que estiverem dentro do espaço de j
                for( int k = i; k <= j; k++){
                    soma += array[k];
                }
                //depois do loop k acabar a soma vai verificar se é menor que 0
                if(soma<0){
                    negatives++;
                }
            }
        }
        System.out.println(negatives);
        sc.close();
    }
}