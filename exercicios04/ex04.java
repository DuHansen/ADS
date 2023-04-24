package exercicios.lista4;
import java.util.Scanner;
/*
 * DESENVOLVA UM PROGRAMA PARA LER 10 NÚMEROS E ESCREVA A MÉDIA DESSES NÚMEROS LIDOS.
 */

public class ex04 {
    
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 10 números: ");
        double resultadototal = 0;
        System.out.println();

        for(double x = 0; x < 10; x++){ 
        double numero = teclado.nextDouble();
        resultadototal += numero;
        }

        double media = resultadototal/ 10.0;

        System.out.println("Resultado: " + media); 
        teclado.close();
    }
}

