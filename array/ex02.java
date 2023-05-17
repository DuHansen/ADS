package array;
import java.util.Scanner;

/* 
ESCREVA  UM PROGRAMA  QUE LEIA 10 NÚMEROS E ARMAZENE-OS EM  
UM ARRAY. APÓS AS  LEITURAS  O PROGRAMA DEVE SOLICITAR AO
USUÁRIO UM NOVO NÚMERO. O PROGRAMA DEVE FAZER UMA BUSCA NO 
ARRAY E ESCREVER  A  MENSAGEM “ACHEI”, SE  O NÚMERO ESTIVER 
ENTRE  OS 10 ARMAZENADOS, OU “NÃO ACHEI” CASO CONTRÁRIO.
*/

public class ex02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[10];
        
        // entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número");
            vetor[i] = teclado.nextInt();
        }


        System.out.println("Informe o número da pesquisa: ");
        int numero = teclado.nextInt();
        boolean achei = false;


        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
            if(numero == vetor[i]){
                achei = true;
                System.out.println("Achei");
                break;
            }
    }
    if(!achei){
        System.out.println("Achei");

    }
    teclado.close();
}
}
