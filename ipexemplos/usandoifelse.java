package exemplos;
import java.util.Scanner;

public class usandoifelse {
    public static void main( String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero para saber se é par ou impar:  ");
        int numero = teclado.nextInt();
        int resto;

        resto = numero/2;


        if(resto == 0 ){        //numero % 2 == 0
           System.out.println("É PAR");
            
        }else{
            System.out.println("É IMPAR");
        }

        teclado.close();
    }

}
