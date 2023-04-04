package app;
import java.util.Scanner;

// 40 horas semanais
// Hora extra , 50%
public class salarioextra {
    public static void main(String[] args){
        System.out.println("Informe o valor pago por hora: " );
       Scanner teclado = new Scanner(System.in);

       int valorhora = teclado.nextInt();

       System.out.println("Informe as horas trabalhadas: " );
       Scanner tecla= new Scanner(System.in);

        int horastrabalhadas = tecla.nextInt();

        tecla.close();
        teclado.close();

        double horastrabalhadasextras = horastrabalhadas - 40; // apenas horas extra
        double horasextra = horastrabalhadasextras*valorhora*1.5; // valor das horas extras

        if(horastrabalhadas > 40){
            System.out.println("O valor das horas extras nesse mes foi:   " + horasextra );
        }else{
            System.out.println("Informe o valor das horas extras nesse mes:   " +  horastrabalhadas*valorhora);
        }
    }
}
