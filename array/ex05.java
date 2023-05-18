import java.util.Scanner;

/*
ESCREVA UM PROGRAMAQUE PERMITA A LEITURA DAS NOTAS DE UMA TURMA DE 10ALUNOS.
ARMAZENE AS NOTAS  EM  UM  ARRAY.OPROGRAMA  DEVE  CALCULAR  A  MÉDIA  DA  TURMA 
E  CONTAR  QUANTOS  ALUNOS OBTIVERAM NOTA ACIMA DESTA MÉDIA CALCULADA.ESCREVAA MÉDIA 
DA TURMA E O RESULTADO DA CONTAGEM.
*/

public class ex05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double acumulador = 0;
        double[] vetor = new double[10];

        for(int i = 0; i < vetor.length ; i ++ ){
            vetor[i] = teclado.nextDouble();
            acumulador = acumulador + vetor[i];
        }
        int contador = 0;
        double media = acumulador/ vetor.length;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > media){
                contador ++;
            }
        }

        System.out.println("A Média:  "+ media);
        System.out.println("Quantidade de alunos acima da média: " + contador);



        teclado.close();

    }
}
