import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int [][] matrizA = new int [3][3];

        for(int linha = 0; linha < matrizA.length; linha ++){
            for(int coluna = 0; coluna < matrizA[linha].length; coluna ++){
                System.out.println("Informe o numero da posicao [" + linha + "][" + coluna + "]: " );
                matrizA[linha][coluna] = teclado.nextInt();
            }
        }

        int linhaMenorelemento = 0;
        int colunaMenorelemento = 0;
        int menorelemento = matrizA[0][0];

        for(int linha = 0; linha<matrizA.length; linha++){
            for(int coluna = 0; coluna < matrizA[linha].length; coluna++){
                if(matrizA[linha][coluna]< menorelemento){
                    menorelemento = matrizA[linha][coluna];
                    linhaMenorelemento = linha;
                    colunaMenorelemento = coluna;
                }
            }
        }
        System.out.println("O menor elemento da matriz: " + menorelemento );
        System.out.println("Linha: " + linhaMenorelemento + " coluna: " + colunaMenorelemento);

        System.out.println("" );
    }
}
