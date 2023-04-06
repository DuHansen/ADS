package app;

import java.util.Locale;
import java.util.Scanner;


public class produto {
 public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);

  System.out.println("Nome do produto: ");
  String nome = entrada.nextLine();

  System.out.println("Quantidade: ");
  int quantidade = entrada.nextInt();

  System.out.println("Valor: ");
  int valor = entrada.nextInt();

  double total =  valor * quantidade;

  if(quantidade <= 5){
    double valordesconto = total - total * 0.02 ; 
    System.out.println("Valor do"+ nome +": "+ valordesconto);

  }
  if(quantidade > 5 && quantidade <= 10){
    double valordesconto2 = total - total * 0.03 ; 
    System.out.println("Valor do"+ nome +": "+ valordesconto2);

  }
  if(quantidade > 10){
    double valordesconto3 = total - total * 0.05 ; 
    System.out.println("Valor do"+ nome +": "+ valordesconto3);

  }

  entrada.useLocale(Locale.US); 
  entrada.close();
 
}
}
