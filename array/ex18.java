import java.util.Scanner;
package exercicios05;

/*
ESCREVA UM PROGRAMA  QUE  LEIA  UMA  MATRIZ 5X5REPRESENTANDO AS VENDAS  DE PRODUTOS EM  UMA LOJA.
CADA LINHA REPRESENTA UM PRODUTOE CADA COLUNA UM DIA DA SEMANA.
EM SEGUIDA,EXIBA NA TELA O TOTAL DE VENDAS DE CADA PRODUTOE O DIA DA SEMANA QUE TEVE MAIS VENDAS.
*/
public class ex18 {
        public static void main(final String[] args) {
            final Scanner teclado = new Scanner(System.in);

            final String[] dias = { "segunda", "terça", "querta", "quinta", "sexta" };

            final double[][] vendas = new double[5][5];
            
            //preenchendo a tabela de vendas
            for(int i = 0; i < vendas.length; i++){
                for(int j = 0; j< vendas[i].length; j ++){
                    System.out.println("Informe a quantidade de vendas do produto: " + (i+1) + "realizada na " + dias[j] + "-feira: ");
                    vendas[i][j] = teclado.nextDouble();
                }
            }
            
            //imprimindo a tabela de vendas
            for(int i = 0; i < vendas.length; i++){
                for(int j = 0; j< vendas[i].length; j ++){
                    System.out.println(vendas[i][j] + "  ");
                }
                System.out.println();
            }


            System.out.println("--------------------------------------" );
            //contabilizando o total de produto
            for(int i = 0; i < vendas.length; i++){
                double totalVendaProduto = 0;
                for(int j = 0; j< vendas[i].length; j ++){
                   totalVendaProduto += vendas[i][j];
                }
                System.out.println("Total de vendas do produto" + (i+1) + ": " + totalVendaProduto);
            }
            System.out.println("--------------------------------------" );
            //contabilizando o total por dias da semana
            double maiorvendas = 0;
            int indice = 0;
            for(int j = 0; j < vendas[0].length; j++){
                double totalvendadiasemana = 0;
                for(int i = 0; i< vendas[j].length; i ++){
                   totalvendadiasemana += vendas[i][j];                  
                }
                if(totalvendadiasemana > maiorvendas){
                    maiorvendas = totalvendadiasemana;
                    indice = j;
                }
               
            }
             System.out.println("O melhor dia da semana foi: " + dias[indice] + " - feira" );
             System.out.println("Com um total de vendas: " + maiorvendas );

            teclado.close();
        }
}