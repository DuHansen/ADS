package exercicios;
import java.util.Scanner;

public class exercicio10 {

	public static void main( String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe as venda:");
        int carrosVendidos = teclado.nextInt();

        System.out.println("Informe o valor total das vendas:");
        int totalVendas = teclado.nextInt();

        System.out.println("Informe o salario fixo do vendedor:");
        int SalarioFixo = teclado.nextInt();

        System.out.println("Informe a comissao por carro vendido:");
        int comissaoPorcarro = teclado.nextInt();

        double salario = SalarioFixo + (carrosVendidos*comissaoPorcarro)+(totalVendas * 0.05);

        System.out.println(" O salário do funcionário: " + salario);

        teclado.close();
