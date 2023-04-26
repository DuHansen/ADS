package exercicios.lista4;

import java.util.Scanner;

/*
JOAQUIM FOI NA PADARIA E REALIZOU A COMPRA DE VÁRIOS PRODUTOS. CRIE UM PROGRAMA QUE LEIA O
PREÇO DOS PRODUTOS COMPRADOS POR JOAQUIM E AO FINAL INFORME QUANTOS PRODUTOS FORAM
COMPRADOS, QUAL O PREÇO TOTAL DA COMPRA E O PREÇO MÉDIO POR PRODUTO.
*/
public class ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int produtos = 0;
        double total = 0;

        System.out.println("//////////////////");
        System.out.println("Digite: 0 Para sair do programa...");
        System.out.println("Quais são os valores: ");
        System.out.println("//////////////////");
        
        while(true){

        double valor= teclado.nextInt();
            if(valor == 0){
                break;
            }
        total += valor;
        produtos++;
        }
    /*do{
    }while(encerrar != 1);
    */
        double medio = total/produtos;
        System.out.println("O valor total: R$ " + total);
        System.out.println("O total de itens comprados: R$ " + produtos);
        System.out.println("Resultado médio de valor por produtos: R$ " + medio);
    teclado.close();
    }
}
