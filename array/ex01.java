
package array;
import java.util.Scanner;


public class ex01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String[] vetor = new String[10];
        
        // entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número");
            vetor[i] = teclado.nextLine();
        }
        
        // saída de dados
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.println(vetor[i]);

        }
        teclado.close();
    
    }}

    