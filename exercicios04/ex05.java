package exercicios.lista4;
import java.util.Scanner;
/*
 * DESENVOLVA UM PROGRAMA PARA LER 10 NÚMEROS E ESCREVA QUANTOS DESSES NÚMEROS LIDOS SÃO
NEGATIVOS.
 */
public class ex05 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 10 números: ");

        int x = 0 , i = 0;

        for( i = 0; i <10; i++){
        double numero = teclado.nextDouble();
        teclado.close();
        
            if(numero < 0){
                x++;
            }
        }
        System.out.println("Quantidade de numeros negativos: " + x);
    
}
}