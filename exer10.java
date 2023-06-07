package funcao;
import java.util.Scanner;

public class exer10 {
    public static void main(final String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de produto: ");
        int quantidade = teclado.nextInt();

        int[] numeros = new int[quantidade];

        for(int i= 0; i < numeros.length; i++){
            System.out.println("Informe o valor: ");
            numeros[i] = teclado.nextInt();
        }



        identificadorMenorElemento(numeros);
        identificadorMaiorElemento(numeros);
        calcularMedia(numeros);


        teclado.close();
    }



    static void identificadorMaiorElemento(int[] numeros){
        int menor = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("O menor elemento é: " + menor);
    }



    static int identificadorMenorElemento(int[] numeros){
        int maior = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){

                maior = numeros[0];

            }

        }
        return 0;
    }

    static double calcularMedia(int[] numeros){
        int acumulador = 0;

        for(int i = 0; i < numeros.length; i++){
            acumulador += numeros[0];
        }
        return acumulador * 1.0 / numeros.length;

    }
}