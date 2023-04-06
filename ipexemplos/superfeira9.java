package app;

import java.util.Locale;
import java.util.Scanner;


public class superfeira {
 public static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);
  System.out.println("Quantos quilos de morango: ");
  int morango = entrada.nextInt();

  Scanner teclado = new Scanner(System.in);
  System.out.println("Quantos quilos de maca: ");
  int maca = teclado.nextInt();
  double frutas = maca + morango;

  if(morango > 5 && maca > 5 ){
    
    
    double valortotalmorangos = morango * 2.20;
    double valortotalmaca = maca * 1.50;
    double valortotaldesconto = valortotalmaca + valortotalmorangos;
    

    System.out.println("Valor total:  " + valortotaldesconto);

    if(valortotaldesconto > 25 && frutas> 8){

      double  valorfinal = valortotaldesconto - valortotaldesconto * 0.1 ;
      System.out.println("Valor total:  " + valorfinal );
    }   

  }
  if(frutas > 8){

    double valortotalmorangos = morango * 2.50;
    double valortotalmaca = maca * 1.80;
    double valortotal = valortotalmaca + valortotalmorangos;

    System.out.println("Valor da compra:  " + (valortotal - valortotal*0.1));

  }else{
    double valortotalmorangos = morango * 2.50;
    double valortotalmaca = maca * 1.80;
    double valortotal = valortotalmaca + valortotalmorangos;

    System.out.println("Valor da compra:  " + valortotal);

  }
  
  entrada.useLocale(Locale.US); 
  entrada.close();
  teclado.close();

}
}
