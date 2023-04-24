package exercicios.lista4;
import java.util.Scanner;
/*
 * FAÇA UM PROGRAMA PARA O MESMO EXERCÍCIO ANTERIOR, MAS AGORA NÃO SERÁ INFORMADO O NÚMERO
DE MERCADORIAS EM ESTOQUE. O PROGRAMA DEVE PERGUNTAR SE O USUÁRIO DESEJA INFORMAR MAIS UMA
MERCADORIA. (“DESEJA INFORMAR MAIS UMA MERCADORIA? S – SIM N – NÃO”). AO FINAL O PROGRAMA DEVE
IMPRIMIR O VALOR TOTAL EM ESTOQUE E A MÉDIA DO VALOR DAS MERCADORIAS
 */
public class ex08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double resultadototal = 0;

        System.out.println();
        System.out.println("Digite o total de mercadorias em estoque:  ");
        int x = teclado.nextInt();

        System.out.println();
        System.out.println("Digite o valor de cada mercadoria: ");

        for(int i = 0; i < x; i++){
        System.out.println("Digite o valor de "+(i+1)+":");    

        double vlr = teclado.nextDouble();
        
        resultadototal += vlr;

        }
        double total = resultadototal;
        System.out.println("Resultado: " + total); 
        
        System.out.println();
        System.out.println("Deseja inserir mais mercadorias em estoque, 1 - SIM, 2 - NÃO:  ");
        int add = teclado.nextInt();
        
        switch(add){
            case 1:
            
            System.out.println("Digite o total de mercadorias para adicionar:  ");
            double totall = total;
            int z = teclado.nextInt();

            int y = z + x;

            System.out.println("Digite o valor da mercadoria: ");

            for(int i = 0; i < z; i++){
            double valor = teclado.nextDouble();
            totall += valor;
            }
            double media = totall/y; 

            System.out.println("O total em estoque:  " + totall + " A média: " + media) ;
            break;

            case 2:
            System.out.println("O total em estoque:  " + total);
            break;

            default:
            System.out.println("Inválido" );
            }
        teclado.close();
        }
    }

