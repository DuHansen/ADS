package exercicios.lista4;
import java.util.Scanner;
/*
 * FAÇA UM PROGRAMA QUE LEIA A DISTÂNCIA (EM METROS) E O TEMPO (EM MINUTOS) DAS ÚLTIMAS CINCO
PROVAS DE UM CORREDOR. O PROGRAMA AINDA DEVE PERGUNTAR QUAL A DISTÂNCIA DA PRÓXIMA PROVA QUE
O CORREDOR IRÁ PARTICIPAR. EM POSSE DESSAS INFORMAÇÕES O PROGRAMA DEVE CALCULAR A VELOCIDADE
MÉDIA (EM METROS POR SEGUNDO) DO CORREDOR E INFORMAR O TEMPO ESTIMADO QUE O CORREDOR LEVARÁ
PARA FINALIZAR A PRÓXIMA CORRIDA.
 */
public class ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double totaldistancia = 0;
        int totaltempo = 0;

        for(int i = 0; i<5; i++){
            System.out.println((i+1)+"- Distância em metros:  ");
            double distancia = teclado.nextDouble();
            totaldistancia += distancia;

            System.out.println((i+1)+"- Qual o tempo em minutos:  ");
            int tempo = teclado.nextInt();
            totaltempo += tempo;
        }
        double velocidademedia = totaldistancia/(totaltempo*60);
        System.out.println("A velocidade média percorrida:  " + velocidademedia + " (m/s)");
        System.out.println("Qual a distancia da proxima prova:  " );
        double prodistancia = teclado.nextDouble();

        double tempopro = (prodistancia/velocidademedia)/60;

        System.out.println("O tempo que o corredor vai levar para a proxima prova é: " + tempopro + "Minutos");

    teclado.close();
    }
    
}
