package exercicios03;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe seu sexo: M - Masculino e F - Feminino ");
        String sexo = teclado.nextLine();

        System.out.println("Informe sua altura em metros:  ");
        Double altura = teclado.nextDouble();

        switch (sexo.toUpperCase()) {
            case "M": {

                System.out.println("Peso ideal:" + ((72.7 * altura) - 58));
                break;
            }
            case "F": {

                System.out.println("Peso ideal:" + ((62.1 * altura) - 44.7));
                break;
            }
            default: {

                System.out.println("Opção invalida!");
                break;
            }
        }
        teclado.close();
    }
}