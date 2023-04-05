package app;

import java.util.Locale;
import java.util.Scanner;


public class jogofutebol {
    
    public static void main(String[] args){

        System.out.println("///////////////////////////// " );
        System.out.println("Primeiro time: " );
        Scanner teclado = new Scanner(System.in);
        String time1 = teclado.nextLine();


        System.out.println("///////////////////////////// " );
        System.out.println("Segundo time: " );
        Scanner tecladoo = new Scanner(System.in);
        String time2 = tecladoo.nextLine();   

        System.out.println("///////////////////////////// " );
        System.out.println("Gols marcados pelo primeiro time: " );
        Scanner teclaa = new Scanner(System.in);
        int gol1 = teclaa.nextInt();

        System.out.println("///////////////////////////// " );
        System.out.println("Gols marcados pelo segundo time: " );
        Scanner tecla = new Scanner(System.in);
        int gol2 = tecla.nextInt();

        if(gol1 > gol2){
            System.out.println("///////////////////////////// " );
            System.out.println("TIME GANHADOR: " + time1 + " "+ gol1+"x"+gol2);
            System.out.println("///////////////////////////// " );
        }
        if(gol1 == gol2){
            System.out.println("///////////////////////////// " );
            System.out.println("EMPATE: " + time2 + " "+ gol1+"x"+gol2);
            System.out.println("///////////////////////////// " );
        }
        if(gol1 < gol2){
            System.out.println("///////////////////////////// " );
            System.out.println("TIME GANHADOR: " + time2 + " "+ gol1+"x"+gol2);
            System.out.println("///////////////////////////// " );
        }

        teclado.useLocale(Locale.US);
        tecla.close();
        teclaa.close();
        teclado.close();
        tecladoo.close();

       



        
    
    
    }
}
