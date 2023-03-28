package exercicios;
import java.util.Scanner;

public class exercicio08 {
    public static void main( int[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe o o seu salario:");
        double salario = teclado.nextDouble();

        System.out.printf("Informe o percentual  da dataBase:");
        double dataBase = teclado.nextDouble();

        double novoSalario = salario * ( 1 + (dataBase/100));
        System.out.println("Salario atual:" + salario);
        System.out.println("Novo salario :" + novoSalario);





        teclado.close();
    
}

}

//8–ESCREVA UM ALGORITMO PARA LER O SALÁRIO ATUAL DE UM FUNCIONÁRIO E O PERCENTUAL DA DATA BASE.CALCULAR O VALOR DO NOVO SALÁRIO E ESCREVER O SALÁRIO ATUAL OE NOVO SALÁRIODO FUNCIONÁRIO.