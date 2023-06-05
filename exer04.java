package funcao;

import java.util.Random;
import java.util.Scanner;

public class exer04 {
    public static void main(final String[] args) {
        final Scanner teclado = new Scanner(System.in);

        final int[][] matriza = new int[3][4];
        prencher(matriza);
        imprimirMatriz(matriza);
        final int quantidadedepares = contabilizadorPares(matriza);
        System.out.println("A matriz possui " + quantidadedepares + "números pares.");

        teclado.close();
        }
        
    static void prencher(final int[][] matriz){
        final Random gerador = new Random();

        for(int i =0; i < matriz.length; i ++){
            for(int j =0; i < matriz[i].length; j ++){

                matriz[i][j] = gerador.nextInt(10);

    }}}


    static int contabilizadorPares(int[][] matriz){
        int quantidadedepares = 0;

        for(int i =0; i < matriz.length; i ++){
            for(int j =0; i < matriz[i].length; j ++){
                if(matriz[i][j] % 2 == 0){
                    quantidadedepares ++;
                }
            }
        }
         return quantidadedepares;
        }



    static void imprimirMatriz(final int[][] matriz){

        for(int i =0; i < matriz.length; i ++){
            for(int j =0; i < matriz[i].length; j ++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }

        
    }

}