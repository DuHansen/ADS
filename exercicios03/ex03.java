package exercicios03;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
          
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Informe um ano:");
        int ano = teclado.nextInt();

        String mensagem = "Esse ano não é bissexto";

        if(ano % 4 == 0){
            if(ano % 100 == 0){
                if(ano % 400 == 0){
                    mensagem = "Esse ano é bissexto";
                } 
            }else{  
                mensagem = "Esse ano é bissexto";
             }
        }

        System.out.println(mensagem);
        teclado.close();
}}
