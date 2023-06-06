package funcao;
import java.util.Scanner;

public class exer06 {
    public static void main(final String[] args) {
    Scanner teclado = new Scanner(System.in);

    int[][] matriza = new int[3][3];
    identificarmenorelemento(matriza);

    for(int i =0; i < matriza.length; i ++){
        for(int j =0; i < matriza[i].length; j ++){

            System.out.println("Matriz " + i + "linha" + j + "coluna");
            matriza[i][j] = teclado.nextInt();

        }
    }
    teclado.close();
}

    static void identificarmenorelemento( int[][] matriz){
        int menorelemento = matriz [0][0];
        int coluna = 0;
        int linha = 0;

        for(int i =0; i < matriz.length; i ++){
            for(int j =0; i < matriz[i].length; j ++){
                if(matriz[i][j] < menorelemento){
                    menorelemento = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Menorelemento" + menorelemento);
        System.out.println("Linha" + linha + "coluna " + coluna);


    }
}