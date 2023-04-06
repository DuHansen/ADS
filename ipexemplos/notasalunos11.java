package app;

import java.util.Locale;
import java.util.Scanner;

public class notas {
 public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);

  System.out.println("Qual a primeira nota: ");
  int nota1 = entrada.nextInt();

  System.out.println("Qual a segunda nota: ");
  int nota2  = entrada.nextInt();

  System.out.println("Qual a terceira nota: ");
  int nota3 = entrada.nextInt();

  System.out.println("Qual a nota dos exercicios: ");
  int exercicios = entrada.nextInt();

  double total = ( nota1 + nota2*2 + nota3*3 + exercicios )/7;

  if(total >= 9){
    
    System.out.println("Nota A" + total);

  }
  if(total >= 7.5 && total < 9 ){
    
    System.out.println("Nota A" + total);

  }
  if(total >= 6 &&  total < 7.5){

    System.out.println("Nota A" + total);

  }
  if( total < 6){
  
    System.out.println("Nota A" + total);

  }

  entrada.useLocale(Locale.US); 
  entrada.close();
 
}
}
