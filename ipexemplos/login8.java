package app;

import java.util.Locale;
import java.util.Scanner;


public class login {
    

 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite SENHA de acsso:");
  int senha = entrada.nextInt();

   switch (senha) {
     case 12345:

       System.out.println("//ACESSO PERMITIDO//");  
       break;  
    
     default:
       System.out.println("SENHA INCORRETA");

  entrada.useLocale(Locale.US); 
  entrada.close();

}
 }
}
