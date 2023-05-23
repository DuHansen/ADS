package exercicios05;
import java.util.Scanner;
/*
ESCREVA UM PROGRAMA QUE LEIA A ALTURA OBTIDA POR 10ATLETAS EMUMA PROVA DE SALTO EM ALTURA.
EM SEGUIDA,EXIBA AS ALTURAS DOS SALTOS QUE FICARAM ABAIXO DA MÉDIA.
*/
public class ex16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
    
        double[] alturas = new double[10];
        double acumuladordealturas = 0;

        for(int i = 0;i<alturas.length; i++) {
            System.out.println("Informe a altura: ");
            alturas[i] = teclado.nextDouble();
            acumuladordealturas += alturas[i];
        }
       
        double mediaAlturasSaltos = acumuladordealturas / alturas.length;

        System.out.println("Média de alturas dos saltos: " + mediaAlturasSaltos);
        System.out.println("Lista dos saltos onde a altura ficou abaixo da média:  ");

        for(int i = 0;i<alturas.length; i++) {
           if(alturas[i]< mediaAlturasSaltos){
            System.out.println(alturas[i]);
           }

    teclado.close();
    }
}
}