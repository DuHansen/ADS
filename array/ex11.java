package exercicios05;
import java.util.Scanner;

public class ex11 {

    public static void main(String[] args){
        
            Scanner teclado = new Scanner(System.in);

            int[] quartos = new int[10];
            
            
            for(int i = 0; i < quartos.length;i++){
                System.out.println("Informe a quantidade de quartos: ");
                quartos[i] = teclado.nextInt();               
            }

            int acumulador = 0;
            int contador = 0;


            for(int i =0; i < quartos.length; i++){
                if(quartos[i]==3){
                    contador ++;
                }
                acumulador += quartos[i];
            }

            System.out.println("TOTAL: " + acumulador + "QUANTIDADE: " + contador);

        teclado.close();
    }
}