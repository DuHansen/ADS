import java.util.Scanner;

/*ESCREVA UM PROGRAMA QUE LEIA E ARMAZENE 10 NÚMEROSEM UM ARRAY.
APÓS ISSO O PROGRAMA DEVE SOLICITAR  QUE  O  USUÁRIO  INFORME  MAIS  UM NÚMERO.
O PROGRAMA  DEVE  INFORMAR  QUANTAS VEZES  ESSE NÚMERO APARECE NO ARRAY.
*/

public class ex03 {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
    
            int[] vetor = new int[10];
            
            // entrada de dados
            for(int i = 0; i < vetor.length; i++){
                System.out.println("Digite um número");
                vetor[i] = teclado.nextInt();
            }
    
            System.out.println();
            System.out.println("Informe o número da pesquisa: ");
            int numero = teclado.nextInt();
            
            int contador = 0;
    
            for(int i = 0; i < vetor.length; i++){
                
                if(numero == vetor[i]){
                   contador ++;
                }
        }

            System.out.println("A quantidade de vezes em que repetiu: " + contador );
            teclado.close();
    }
}
