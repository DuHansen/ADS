package exercicios.lista4;
import java.util.Scanner;
/*
 * DESENVOLVA UM PROGRAMA PARA LER 10 NÚMEROS E ESCREVA QUANTOS DESSES NÚMEROS LIDOS SÃO
PARES.
 */
public class ex06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite dez números:");
         int x = 0; 
        for(int i = 0; i <10; i++){
          
        int pares = teclado.nextInt();

        if(pares%2 == 0 )
            x ++;
        }
        System.out.println("Números pares:  "+ x);
        teclado.close();
}
    }
