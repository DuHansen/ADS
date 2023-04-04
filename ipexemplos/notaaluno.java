package app;
import java.util.Scanner;


public class notaaluno {

    public static void main(String args []){

       System.out.println("Informe a primeira nota do aluno: " );
       Scanner teclado = new Scanner(System.in);

       int nota1 = teclado.nextInt();

       System.out.println("Informe a segunda nota do aluno: " );
       Scanner tecla= new Scanner(System.in);

        int nota2 = tecla.nextInt();

        tecla.close();
        teclado.close();
        
        double notafinal = (nota1+nota2)/2;

        if(notafinal > 7){
            System.out.println("O aluno foi aprovado");
        }else{
            System.out.println("O aluno foi reprovado");
        }


    }
    

}
