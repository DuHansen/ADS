package app;
import java.util.Scanner;


public class jogofutebol {
    public static void main(String[] args){
/////////////////
        System.out.println("Primeiro time: " );
        Scanner teclado = new Scanner(System.in);
 
        int time1 = teclado.nextInt();
/////////////////
        System.out.println("Segundo time: " );
        Scanner tecladoo = new Scanner(System.in);
 
        int time2 = tecladoo.nextInt();
        
/////////////////
        System.out.println("Gols marcados pelo primeiro time: " );
        Scanner teclaa = new Scanner(System.in);
 
        int gol1 = teclaa.nextInt();
////////////////
        System.out.println("Gols marcados pelo segundo time: " );
        Scanner tecla = new Scanner(System.in);
 
        int gol2 = tecla.nextInt();

        tecla.close();
        teclaa.close();
        teclado.close();
        tecladoo.close();

        if(gol1>gol2){

            System.out.println("TIME GANHADOR: " + time1 );

        }
        if(gol1==gol2){
            System.out.println("TIME GANHADOR: " + time2 );

        }else{
            System.out.println("TIME GANHADOR: " + time2 );
        }


       



        
    
    
    }
}
