package exercicios03;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o tipo da conta: " + "[P - Predial , R - Residencial]");
        String tipo = teclado.nextLine();

        System.out.println("Informe a leitura atual: ");
        double leituraatual = teclado.nextDouble();

        System.out.println("Informe a leitura anterior: ");
        double leituranterior = teclado.nextDouble();

        double consumo = leituraatual - leituranterior;

        double taxas = 70.00;
        
        switch(tipo){
            case "R": {
                if(consumo < 10){
                    System.out.println("Total a pagar:" + ((consumo * 1.00) + taxas));
                }else{
                    if(consumo > 25){
                        System.out.println("Total a pagar:" + ((consumo * 4.25) + taxas));
                    }else{
                        System.out.println("Total a pagar:" + ((consumo * 2.50) + taxas));
                        }
                    }
                    }
                break;
            case "P":{
                if(consumo < 10){
                    System.out.println("Total a pagar:" + ((consumo * 1.30) + taxas));
                }else{
                    if(consumo > 25){
                        System.out.println("Total a pagar:" + ((consumo * 2.90) + taxas));
                    }else{
                        System.out.println("Total a pagar:" + ((consumo * 4.50) + taxas));
                    }
                }
                break;
            
            }
            
            }
        teclado.close();
            

            

        }







}