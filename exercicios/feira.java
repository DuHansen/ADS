package exercicios;
import java.util.Scanner;

public class feira {

    public static void main(Double[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        double pesomaca, valormaca,  pesolaranja, valorlaranja;
        
        System.out.printf("Informe o peso: ");
        pesomaca = ler.nextInt(); 
      
        System.out.printf("Informe o valor.: ");
        valormaca = ler.nextInt(); 

        System.out.printf("Informe o peso: ");
        pesolaranja = ler.nextInt();

        System.out.printf("Informe o valor.: ");
        valorlaranja = ler.nextInt();

        ler.close();


  double totalgasto = (valormaca*pesomaca + valorlaranja*pesolaranja);	


  System.out.printf("RESULTADO");
  

  System.out.println("A soma dos produtos de Joana foi: " + (totalgasto) + "$");
		
		  

}}
//double maca = 7.25;
//double pesomaca = 1;
//double laranja = 5.5;
//double pesolaranja = 3;



