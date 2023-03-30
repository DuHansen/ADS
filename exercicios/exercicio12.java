package exercicios;
import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe o peso do saco de ração em KG:");
        double pesoSacoRacao = teclado.nextDouble();

        System.out.printf("Informe a quantidade em gramas da ração do Frajola:");
        double racaoFrajola = teclado.nextDouble();

        System.out.printf("Informe a quantidade em gramas da ração do Caramelo:");
        double racaoCaramelo = teclado.nextDouble();


        double consumoGatos = (racaoCaramelo + racaoFrajola)*5;
        double restoracaoSaco = (pesoSacoRacao * 1000) - consumoGatos;



        System.out.println("Resta no saco de ração:" + restoracaoSaco);

        teclado.close();
    }
}
//12–MARIAZINHA COMPROU UM SACO DE RAÇÃO PARA GATOS COM PESO EM QUILOS.ELA POSSUI DOIS GATOS,O CARAMELO  E  O  FRAJOLA,PARA  OS  QUAIS  FORNECE A  QUANTIDADE  DE RAÇÃO  EM  GRAMAS.AQUANTIDADE DIÁRIA DE RAÇÃO FORNECIDA PARA CADA GATO ÉSEMPRE A MESMA.FAÇA UM ALGORITMO QUERECEBA O PESO DO SACO DE RAÇÃO E AQUANTIDADE DE RAÇÃO FORNECIDA PARA CADA GATO,CALCULE O APRESENTE QUANTO RESTARÁ DE RAÇÃO NO SACO APÓS CINCO DIAS.
