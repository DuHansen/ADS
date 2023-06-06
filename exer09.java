package funcao;

import java.util.Arrays;
import java.util.Scanner;

public class exer09 {
    public static void main(final String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int [10];

        for(int i =0; i < numeros.length; i++){
            System.out.println("Informe um numero: ");
            numeros[i] = teclado.nextInt();

        }
        imprimiArray(numeros);
        System.out.println("---------------------------");
        numeros = ordenararrayparimpar(numeros);
        imprimiArray(numeros);
        teclado.close();
    }

    

    static void imprimiArray(int[] numeros) {
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] +" ");
        }
}
    static int[] ordenararrayparimpar(int[] numeros) {
        Arrays.sort(numeros);
        int indice = 0;
        int[] ajustado = new int[numeros.length];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                ajustado[indice]  = numeros[i];
                indice ++;

            }
        }
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 != 0){
                ajustado[indice]  = numeros[i];
                indice ++;

            }
        }
        
        
        
        return ajustado;
    }

}