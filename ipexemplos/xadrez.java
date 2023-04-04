package app;
import java.util.Scanner;

public class xadrez {
    public void main(String[] args){
       System.out.println("Informe a nota de inicio: " );
       Scanner teclado = new Scanner(System.in);

       int hora1 = teclado.nextInt();

       System.out.println("Informe que terminou: " );
       Scanner tecla= new Scanner(System.in);

        int hora2 = tecla.nextInt();

        tecla.close();
        teclado.close();


        int horatotal = hora1 - hora2; 
        if(horatotal  == 0 ){
            System.out.println("Passou do tempo limite =  ");
        }else {
            System.out.println("O tempo esta " + horatotal);
        }
    }
}
