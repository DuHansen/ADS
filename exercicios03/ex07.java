package exercicios03;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o seu peso:  ");
        Double peso = teclado.nextDouble();

        System.out.println("Informe a sua altura:");
        Double altura = teclado.nextDouble();

        double imc = peso  / (altura * altura) ;

        if(imc <  18.5 ){
            System.out.println("Abaixo do peso");
        }else{
            if(imc >= 18.5 && imc < 25 ){
                System.out.println("Normal" + imc);
            }else{
                if(imc >= 25 && imc < 30){
                    System.out.println("Sobrepeso"+ imc);
                }else{
                    if(imc >= 30 && imc < 35){
                        System.out.println("Obesidade Grau 1");
                    }else{
                        if(imc >= 35 && imc < 40){
                            System.out.println("Obesidade Grau 2");
                        }else{
                            System.out.println("Obesidade Grau 3");
                        }
                    }
                }
            }
        }   teclado.close();
    }
}