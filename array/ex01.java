
package array;
import java.util.Scanner; 
/*
DESENVOLVA UM  PROGRAMA  QUE  LEIA E ARMAZENE 10 NOMES EM  UM ARRAY.
APRESENTE  OS NOMES NA ORDEM DE LEITURA E DEPOIS NA ORDEM INVERSA DA LEITURA
*/
        //lenght = 4
        // indice = 3
        //OS ELEMENTOS DE UM ARRAY SÃO SEPARADOS POR VIRGULA

        //System.out.println("Digite: " );
        //double valor = teclado.nextDouble();

public class ex01 {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String[] vetor = new String[10];
        
        // entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um nome:");
            vetor[i] = teclado.nextLine();
        }

        System.out.println();

        // saída de dados em ordem de leitura
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+ " ");

        }

        System.out.println();

        // saída de dados em ordem decrescente de leitura
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.print(vetor[i] + " ");

        }
        teclado.close();
    }
}


    
