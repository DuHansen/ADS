package exercicios05;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            int[] predios = new int[10];
            

            for(int i = 0; i < predios.length; i++){
                System.out.print("Informe a quantidade de andares: ");
                predios[i] = teclado.nextInt();
            }

            int contadosAndares = 0;

            for(int i = 0; i < predios.length; i++){
                if(predios[i]>10){
                    contadosAndares ++;
                }

            }
            System.out.print("A quantidade de prédios com mais de 10 andares é: " + contadosAndares);
            teclado.close();
    }
}