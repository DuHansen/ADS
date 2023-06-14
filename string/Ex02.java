package string;
import java.util.Scanner;



//DESENVOLVA  UM  PROGRAMA  QUE  LEIA UM  TEXTO  DIGITADO  
//PELO  USUÁRIO  E  EXIBA  O TEXTO  COM  CADA PALAVRA EM UMA LINHA.

public class Ex02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        char[] texto = new char[] {};
        String minhaString = new String(texto);

        prencher(teclado, minhaString );
        System.out.println();
        imprimir(teclado,minhaString);

    }



    static void prencher(Scanner teclado, String minhaString ){

        System.out.println("Escreva seu TEXTO aqui:");
        minhaString = teclado.nextLine();

    }

    static void imprimir(Scanner teclado, String minhaString ){


        System.out.println(minhaString);
    
    
    }
}
