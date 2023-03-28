package exercicios;
import java.util.Scanner;

public class exercicio05 {
    public static void main(int[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        double valor;
        
        System.out.printf("Informe o valor: ");
        valor = ler.nextInt(); 
      
        
        ler.close();

        double antecessor = -- valor; 
        double sucessor = ++ valor;

  System.out.printf("RESULTADO");
  

  System.out.println("Numeros antes e depois são: " + (sucessor) + (antecessor));
		


}}
//5–CRIE UM  ALGORITMO QUE  LEIA  UM  VALOR  NUMÉRICO  INTEIRO  E  APRESENTE  COMO  RESULTADO  O  SEU ANTECESSOR E O SEU SUCESSOR.