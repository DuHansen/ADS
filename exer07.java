package funcao;
import java.util.Scanner;

public class exer07 {
    public static void main(final String[] args) {
        Scanner teclado = new Scanner(System.in);

        for(int i = 2; i < 100; i ++){
           if(isPrimo(i)){
            System.out.println(i + " ");
           }
    }
        teclado.close();
    }

    static boolean isPrimo(int numero){
    boolean resultado = true;
    if(numero % 2 == 0 && numero != 2 ){
        resultado = false;
    }
    if(numero % 3 == 0 && numero != 3 ){
        resultado = false;
    }
    if(numero % 5 == 0 && numero != 5 ){
        resultado = false;
    }
    if(numero % 7 == 0 && numero != 7 ){
        resultado = false;
    }

    return resultado;
    }
}