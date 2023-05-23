package exercicios05;
import java.util.Scanner;

/*FAÇA  UM  PROGRAMA  QUE  LEIA  A  QUANTIDADE  DE  MEDALHAS  DE 10PAÍSES  EM  UMA  COMPETIÇÃO ESPORTIVA.
EM SEGUIDA,EXIBA NA TELA O NOME DO PAÍS COM A MAIOR QUANTIDADE DE MEDALHAS.
*/
public class ex15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] medalhas = new int[10];
        String[] paises= new String[10];

        for(int i =0; i<medalhas.length; i++){
            System.out.println("Informe o nome do país: ");
            paises[i] = teclado.nextLine();
            System.out.println("Informe o nome do país: ");
            medalhas[i] = teclado.nextInt();
            teclado.nextLine();
        }

        int indice = 0;

        int maiormedalhas = medalhas[0];
        
        for(int i = 0; i < medalhas.length;i++){
            if(maiormedalhas<medalhas[i]){
                indice = i;
            }
        }
        System.out.println("O país com mais medalhas é: " + paises[indice]);
        teclado.close();
    }
}