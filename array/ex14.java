package exercicios05;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Double[] time = new Double[10];
        int acumulador = 0;

        for(int i =0; i<time.length; i++){
            System.out.println("Informe o tempo do corredor: ");
            time[i] = teclado.nextDouble();
            acumulador += time[i];

        }

        double mediatime = acumulador / time.length;
        double maisrapido = time[0];
        double maislento = time[0];

        for(int i =0; i < time.length;  i++){
            if(time[i]< maisrapido){
                maisrapido = time[0];
                            }
            if(time[0] > maislento) {
                maislento = time[0];
            }

        } 

        System.out.println("Tempo médio dos corredores: " + mediatime);
        System.out.println("Diferença do mais rápido: " + (mediatime - maisrapido));
        System.out.println("Diferença do mais lento: " + (mediatime - maislento));

        teclado.close();
    }
}