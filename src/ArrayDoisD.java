import java.util.Scanner;

public class ArrayDoisD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[6][6];  // Inicialização correta da matriz
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int soma = matriz[i][j] + matriz[i][j + 1] + matriz[i][j + 2]
                        + matriz[i + 1][j + 1]
                        + matriz[i + 2][j] + matriz[i + 2][j + 1] + matriz[i + 2][j + 2];

                if (soma > maxValue) {
                    maxValue = soma;
                }
            }
        }
        System.out.println("");
        System.out.println(maxValue);
        sc.close();
    }
}
