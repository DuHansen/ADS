package funcao;
import java.util.Scanner;

public class exer03 {
    public static void main(final String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        double[]  notas = new double[3];
        
        for(int i =0; i < notas.length; i ++){
            System.out.print("Informe a " + (i + 1) + " nota: ");
            notas[i] = teclado.nextDouble();
        }
        System.out.println("Informe  o tipo de cálculo " + "[1 - Aritmetico, 2 - Ponderado]: ");
        int  tipo = teclado.nextInt();
        media(notas, tipo);
        teclado.close();
    }

    static void media(double[] notas, int tipo){
        double media = 0 ;
        if(tipo == 1 ) {
            for(int i = 0; i < notas.length; i++){
                media += notas[i];
            }
            media = media / 3;
        }else{
            media = ((notas[0] * 5) + (notas[1]*3) + (notas[2]*2))/10;
        }

        System.out.print("A média do aluno: " + media);


    }

}