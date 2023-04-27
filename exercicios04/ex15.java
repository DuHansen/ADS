package exercicios.lista4;
/*
 * CRIE UM PROGRAMA ONDE O USUÁRIO IRÁ INFORMAR O VALOR DE CADA GASTO REALIZADO NO MÊS. OS
GASTOS DEVEM SER LANÇADOS DE ACORDO COM AS CATEGORIAS (ALIMENTAÇÃO, COMBUSTÍVEL E SAÚDE). AO
FINAL O PROGRAMA DEVE INFORMAR:
• O TOTAL GASTO NO MÊS;
• QUAL A CATEGORIA COM MAIS GASTOS;
• QUAL A CATEGORIA COM MENOS GASTOS;
 */
public class ex15 {

            public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        
            double totalAlimentacao = 0;
            double totalCombustivel = 0;
            double totalsaude = 0;
            int continuar = 0;

            do{
                
                System.out.print("Informe o valor do gasto: R$ " );
                double gasto = teclado.nextDouble();

                System.out.println("Categorias: " );
                System.out.println("1 - Alimentação " );
                System.out.println("2 - Combustível " );
                System.out.println("3 - Saúde " );
                System.out.println("Digite a opção: " );
                int opcao = teclado.nextInt();
                switch(opcao){
                    case 1:{
                        totalAlimentacao += gasto;
                        break;
                    }
                    case 2: {
                        totalCombustivel += gasto;
                        break;
                    }
                    case 3:{
                        totalsaude += gasto;
                        break;
                    }
                }

                System.out.println("Deseja inserir mais um gasto: 1 - sim, 2 - não");
                continuar = teclado.nextInt();

            }while(continuar == 1);

            double total = totalAlimentacao + totalCombustivel + totalsaude;
            System.out.println("Total gasto no mês: " + total);

            if(totalAlimentacao > totalCombustivel && totalAlimentacao > totalsaude){
                System.out.println("Categoria com maior gasto foi alimentação.");
                System.out.println("Gasto da categoria Alimentação: " + totalAlimentacao);
            }
            if(totalAlimentacao < totalCombustivel && totalCombustivel >totalsaude){
                System.out.println("Categoria com maior gasto foi combustivel.");
                System.out.println("Gasto da categoria combustivel: " + totalCombustivel);
            }
            if(totalsaude > totalCombustivel && totalAlimentacao < totalsaude){
                System.out.println("Categoria com maior gasto foi saúde.");
                System.out.println("Gasto da categoria saúde: " + totalsaude);
            }
            if(totalAlimentacao < totalCombustivel && totalAlimentacao < totalsaude){
                System.out.println("Categoria com maior gasto foi alimentação.");
                System.out.println("Gasto da categoria Alimentação: " + totalAlimentacao);
            }
            if(totalAlimentacao > totalCombustivel && totalCombustivel < totalsaude){
                System.out.println("Categoria com maior gasto foi combustivel.");
                System.out.println("Gasto da categoria combustivel: " + totalCombustivel);
            }
            if(totalsaude < totalCombustivel && totalAlimentacao < totalsaude){
                System.out.println("Categoria com maior gasto foi saúde.");
                System.out.println("Gasto da categoria saúde: " + totalsaude);
            }
            teclado.close();
            }
            
        }
}
