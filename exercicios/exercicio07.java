package exercicios;
import java.util.Scanner;

public class exercicio07 {
    public static void main(int[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
      
        
        System.out.printf("Informe o valor de votos brancos: ");
        int brancos = ler.nextInt(); 

        System.out.printf("Informe o total de votos nulos: ");
        int nulos = ler.nextInt();

        System.out.printf("Informe o total de votos validos: ");
        int validos = ler.nextInt();

        int totaldevotos = brancos + nulos + validos;

        double percentualdebrancos = (brancos / totaldevotos)*100;
        ler.close();

        

  System.out.printf("RESULTADO");
  

  System.out.println("Numeros antes e depois são: " + (percentualdebrancos) +", os votos brancos foram "+ (brancos));
		


}}

//7–CRIE UM ALGORITMO  PARA  LER  O  NÚMERO  TOTAL  DE ELEITORES  DE  UM  MUNICÍPIO,O  NÚMERO  DE  VOTOS BRANCOS,NULOS  E  VÁLIDOS.OALGORITMO  DEVE  CALCULAR  E  ESCREVER  O  PERCENTUAL  QUE  CADA  UM REPRESENTA EM RELAÇÃO AO TOTAL DE ELEITORES.
//  int validos, brancos, nulos;