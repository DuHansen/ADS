package funcao;

import java.util.Arrays;
import java.util.Scanner;

public class exer11 {
    public static void main(final String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Informe um número: ");
            numeros[i] = teclado.nextInt();
        }



        System.out.println("Escolha o tipo de ordenação: ");
        System.out.println("1 - Ordenação Crescente ");
        System.out.println("2 - Ordenação Decrescente ");
        System.out.println("Digite a sua opção: ");

        int opcao = teclado.nextInt();

        if(opcao == 1){
            ordenarArrayCrescente(numeros);
        }else{
            ordenarArrayDescresnte(numeros);
        }
        teclado.close();


    }

    static void ordenarArrayCrescente(int[] numeros){
        Arrays.sort(numeros);

        for(int i = 0; i < numeros.length; i++){

            System.out.println(numeros[i] + " ");
        }
    }

    static void ordenarArrayDescresnte(int[] numeros){

        for(int i = numeros.length -1; i >=0 ; i++){
            System.out.println( numeros[i] + " ");
        }

    }
}