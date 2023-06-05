package funcao;

public class exer05 {
    public static void main(final String[] args) {

        int[][] matrizA = new int[4][4];
        exer04.prencher(matrizA);
        exer04.imprimirMatriz(matrizA);

        int totalDiagonal = somarDiagonal(matrizA);
        System.out.println("A soma da diagonal é " + totalDiagonal);

    }

    static int somarDiagonal(final int[][] matriz) {
        int soma = 0;

        for(int i =0; i < matriz.length; i ++){
            for(int j =0; i < matriz[i].length; j ++){

                if(i == j){

                    soma += matriz[i][j];
                }
            }
        }
        return soma;
        }
}