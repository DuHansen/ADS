package exercicios.lista4;
import java.util.Scanner;


/*
 * FAÇA UM PROGRAMA QUE LEIA A IDADE E A ALTURA DOS JOGADORES DE UM TIME DE BASQUETE E IMPRIMA
NA TELA A MÉDIA DE IDADE DOS JOGADORES E QUAL A ALTURA DO MENOR JOGADOR DO TIME. LEVE EM
CONSIDERAÇÃO APENAS OS TITULARES (CINCO JOGADORES)
 */
public class ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double totalidade = 0;
        
        double menor = 0;

        for (int i=0;i<5;i++){
        System.out.println("Qual sua altura:  ");

        double altura = teclado.nextDouble();
        
        if(i == 0){
                
            menor = altura;
        }
        
        if(altura < menor){
            
            menor = altura;
        }

        System.out.println("Qual sua idade:  ");
        int idade = teclado.nextInt();

        totalidade += idade;
    } 
    double mediadejogador = totalidade /5;

    System.out.println("Jogador com menor tamanho:  " + menor);
    System.out.println("Média de idade entre jogadores:  " + mediadejogador);

    teclado.close();
    } 
}
