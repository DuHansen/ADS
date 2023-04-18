package exemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class usandowhile {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        DecimalFormat formatador = new DecimalFormat("0.0");
        while(i < 2){
        System.out.println("Digite o seu nome:");
        String aluno = teclado.nextLine();

        System.out.println("Digite a primeira nota:");
        Double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota:");
        Double nota2 = teclado.nextDouble();

        Double media = (nota1 + nota2) /2;
         
        System.out.println("A nota final é:  " + formatador.format(media) + "  do aluno  "+ aluno);
        
        ++ i;
        teclado.nextLine();
        }


        teclado.close(); 
    }
}