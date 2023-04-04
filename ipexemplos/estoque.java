package app;
import java.util.Scanner;

public class estoque {

    public static void main(String[] args){
        System.out.println("Escreva a quantidade presente no estoque: ");
        Scanner tecladoo = new Scanner(System.in);
        int estoque = tecladoo.nextInt();

        System.out.println("Escreva a quantidade maxima: ");
        Scanner teclado = new Scanner(System.in);
        int max = teclado.nextInt();

        System.out.println("Escreva a quantidade min: ");
        Scanner tecla = new Scanner(System.in);
        int min = tecla.nextInt();

        tecla.close();
        teclado.close();
        tecladoo.close();

        double media = min + max /2;

        if(estoque >= media){
            System.out.println("Não realizar a compra do produto: ");
        }else{
            System.out.println("Realizar a compra do produto");

        }











    }

}
