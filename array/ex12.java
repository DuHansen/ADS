package exercicios05;
import java.util.Scanner;
public class ex12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double[] areaimoveis = new double[10];

        double acumulador = 0;

        for(int i = 0; i < areaimoveis.length;i++){
            System.out.println("Informe a quantidade de quartos: ");
            areaimoveis[i] = teclado.nextDouble();
            acumulador += areaimoveis[i];
            
            
        }
        double mediaarea = acumulador/ areaimoveis.length;


        int contadorcasa = 0;

        for(int i = 0; i < areaimoveis.length;i++){
            if(areaimoveis[i]<mediaarea){
                contadorcasa ++;

            }
        }

        System.out.println("Area média construida é: " + mediaarea);
        System.out.println("Quantidade de imoveis abaixo de média: " + contadorcasa);
        teclado.close();

    }
}