package exercicios05;
import java.util.Scanner;
import java.util.Arrays;

public class ex10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int [] numeros = new int[10];
        String[] nomes = {"eduardo","leo","vit"}



        for(int i =0; i < numeros.length; i++){
            System.out.print("Informe um número");
            numeros[i] = teclado.nextInt();
        }
        
        System.out.print("---------------");
        for(int i =0; i < numeros.length; i++){       
            System.out.print(numeros[i] + "");
        }
        Arrays.sort(numeros);

        for(int i =0; i < numeros.length; i++){
            System.out.print(numeros[i] + "");
        }

        /*
        for(int j = 0; j < numeros.length - 1; j++){
        for(int i =0; i < numeros.length; i++){
            if(numeros[i]> numeros[i+1]){
                int auxiliar = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = auxiliar;
            }
        } 
    } // metodo bolho, mais inefisciente 
        */

    }
}
