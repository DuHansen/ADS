package app;

import java.util.Locale;
import java.util.Scanner;


public class gasolina {
    

 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite 1 para Gasolina ou 2 Alcool:");
  int numero = entrada.nextInt();
   switch (numero) {
     case 1:
       System.out.println("//Gasolina//");
       System.out.println("Quantos litros de Gasolina:");
       Scanner teclado = new Scanner(System.in);
       int litros = teclado.nextInt();
       
       double g = 6.9;

       if(litros > 20){
            double valorcomdesconto = (g * litros) - (litros * g * 0.6);
            System.out.println("Valor acima de 20 litros de Gasolina com desconto:    " + valorcomdesconto);


       }else{
           double valorcomdescontobaixo = (g * litros) - (litros * g * 0.4);
            System.out.println("Valor abaixo de 20 litros de Gasolina com desconto:   " + valorcomdescontobaixo);
       }
       
       break;
     case 2:
       System.out.println("//Alcool//");
       System.out.println("Quantos litros de Alcool:");
       Scanner tecladoo = new Scanner(System.in);
       int litrosdealcool = tecladoo.nextInt();
       
       double a = 6.9;

       if(litrosdealcool > 20){
            double valorcomdesconto = ( litrosdealcool * a ) - litrosdealcool * a * 0.5 ;
            System.out.println("Valor acima de 20 litros de Alcool com desconto:     " + valorcomdesconto);


       }else{
           double valorcomdescontobaixo =   ( litrosdealcool * a ) - ( litrosdealcool * a )* 0.3;
            System.out.println("Valor abaixo de 20 litros de Alcool com desconto:    " + valorcomdescontobaixo);
       }
       break;
    
     default:
       System.out.println("O número escolhido é inválido! Digite um número entre 1 ou 2");

  entrada.useLocale(Locale.US); 
  entrada.close();

}
 }
}
