package exercicios03;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        int respostas = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("VOCÊ JÁ TRABALHOU COM A VÍTIMA?" + "[0 - Não e 1 - Sim]");
        respostas  += teclado.nextInt();

        System.out.println("VOCÊ TELEFONOU PARA A VÍTIMA?" + "[0 - Não e 1 - Sim]");
        respostas  += teclado.nextInt();

        System.out.println("VOCÊ MORA PRÓXIMA A VÍTIMA?" + "[0 - Não e 1 - Sim]");
        respostas  += teclado.nextInt();

        System.out.println("VOCÊ DEVIA DINHEIRO A VÍTIMA?" + "[0 - Não e 1 - Sim]");
        respostas  += teclado.nextInt();

        System.out.println("VOCÊ ESTEVE NO LOCAL DO CRIME?" + "[0 - Não e 1 - Sim]");
        respostas = respostas + teclado.nextInt();


        if(respostas < 2){
            System.out.println("Classificação: Inocente");
        }else{
            if(respostas == 2){
                System.out.println("Classificação: Suspeito");
            }else{
                if(respostas> 2 && respostas < 5){
                    System.out.println("Classificação: Cumplice");
                }else{
                    System.out.println("Classificação: Assasino");
                }
            }

        }
 teclado.close();
}}
