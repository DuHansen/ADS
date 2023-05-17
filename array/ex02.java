package array;
import java.util.Scanner;
/*
ESCREVA  UM PROGRAMA  QUE LEIA10NÚMEROSE  ARMAZENE-OS EM  UM ARRAY.APÓS AS  LEITURAS  O PROGRAMA DEVE SOLICITAR AOUSUÁRIO UM NOVO NÚMERO.
OPROGRAMA DEVEFAZER UMA BUSCA NO ARRAY E ESCREVER  A  MENSAGEM “ACHEI”,SE  O NÚMEROESTIVER  ENTRE  OS 10ARMAZENADOS,OU “NÃO ACHEI”CASO CONTRÁRIO.
*/
public class ex02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){

            System.out.println("Digite: ");
            vetor[i] = teclado.nextInt();

            if(vetor[i] == vetor[i]){

                System.out.println("Achou");

            }
        }

        teclado.close();
}}