package string;
import java.util.Scanner;

//FAÇA UM PROGRAMA QUE LEIA UMA PALAVRA DIGITADA PELO USUÁRIO EA APRESENTE INVERTIDA (DE TRÁS PARA FRENTE).

public class Ex1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        char[] meusChars = new char[] {'J','a','v','a'};
        String minhaString = new String(meusChars);

        crescente(minhaString, teclado, meusChars);
        System.out.println("----------------------------");
        decrescente(minhaString, teclado, meusChars);

    }


    static void crescente(String minhaString, Scanner teclado, char[] meusChars){

        for(int i = 0; i < meusChars.length; i++){
            System.out.println(meusChars[i]);
        }

    }

    static void decrescente(String minhaString, Scanner teclado, char[] meusChars){

        for(int i = meusChars.length - 1; i >= 0 ; i--){
            System.out.println(meusChars[i]);
        }

    }

}