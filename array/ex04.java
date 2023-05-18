import java.util.Scanner;

/*
DESENVOLVA   UM   PROGRAMA   QUE LEIA 10 NÚMEROS 
(ACEITAR   SOMENTE   NÚMEROS   POSITIVOS) E ARMAZENE EM  UM ARRAY.
O PROGRAMA  DEVE  INFORMAR O VALOR DO MAIOR E DO MENOR NÚMEROE AS SUAS RESPECTIVAS 
POSIÇÕESNO ARRAY.

*/

// melhor usar while


public class ex04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[10];
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();
            if(numero >= 0){
                vetor[i] = numero;
            }else{
                i--;
            }
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]+"");
        }

        int maiornumero = vetor[0];
        int menornumero = vetor[0];
        int indicemaior = 0;
        int indicemenor = 0;

        for(int i = 0; i < vetor.length; i++){
           if(vetor[i] < menornumero){
               menornumero = vetor[i];
               indicemenor = i;
           }
           if(vetor[i] > maiornumero){
               maiornumero = vetor[i];
               indicemaior = i;
           }
        }
        System.out.println("O menor numero é " + menornumero + " e está no indice  " + indicemenor);
        System.out.println("O maior numero é " + maiornumero + " e está no indice  " + indicemaior);



        teclado.close();

}}
