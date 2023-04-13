package exercicios03;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe  o valor do saque:");
        int saque = teclado.nextInt();

        if(saque >= 10 && saque <= 1000){
            if(saque >= 100){
                int notas100 = saque / 100;
                saque = saque - (notas100 * 100);
                System.out.println("Notas de R$ 100,00: " + notas100);

            }
            if(saque >= 50){
                int notas50 = saque / 50;
                saque = saque - (notas50 * 50);
                System.out.println("Notas de R$ 50,00: " + notas50);

            }
            if(saque >= 10){
                int notas10 = saque / 10;
                saque = saque - (notas10 * 10);
                System.out.println("Notas de R$ 10,00: " + notas10);

            }
            if(saque >= 5){
                int notas5 = saque / 5;
                saque = saque - (notas5 * 5);
                System.out.println("Notas de R$ 100,00: " + notas5);

            }
            else{
                System.out.println("Valor fora do limite de R$ 10,00 e R$ 1000,00");
            }
            teclado.close();
        }

        
}
}