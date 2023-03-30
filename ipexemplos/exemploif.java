package exemplos;
import java.util.Scanner;
public class exemploif {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro:  ");
        int numero = teclado.nextInt();



        if(numero > 0) {

           System.out.println("O numero é" + numero); 
        }
        
        System.out.println("fimdoprograma");
        teclado.close();
    }

}
