package exercicios.lista4;
import java.util.Scanner;
/*
 * FAÇA UM PROGRAMA ONDE O USUÁRIO DEFINA A QUANTIDADE DE NÚMEROS A SEREM LIDOS E EM SEGUIDA
LEIA OS NÚMEROS. DEPOIS DE LER TODOS OS NÚMEROS O PROGRAMA DEVE APRESENTAR NA TELA O MAIOR
DOS NÚMEROS LIDOS, O MENOR DOS NÚMEROS LIDOS E A MÉDIA DOS NÚMEROS LIDOS.
 */
public class ex09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a = 0, maior = 0, menor = 0, total = 0;
        
        System.out.println("Insira quantos números a serem lidos:");
        int i = teclado.nextInt();

        for(int x = 0; x < i; x++){
            
            System.out.println("Insira um valor:");
            a = teclado.nextInt();

            total += a;

            if(x == 0){
                
                maior = a;
                menor = a;
            }
            
            if(a > maior){
                
                maior = a;
            }
            
            if(a < menor){
                
                menor = a;
            }
        } 
        double resultadototal = total;
        double media = resultadototal / i;
        teclado.close();
        
        System.out.println("Maior: "+ maior +" Menor: "+ menor);
        System.out.println("Media: "+ media);
    
    }
}

