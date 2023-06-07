package funcao;
import java.util.Scanner;

public class exer12 {
    public static void main(final String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int continuar = 0;

        do{
            apresentaropcoesmenu();
            int operacao = teclado.nextInt();
            System.out.println("Informe o primerio numero: ");
            double numeroa = teclado.nextDouble();

            System.out.println("Informe o primerio numero: ");
            double numerob = teclado.nextDouble();


            switch(operacao){
                case 1: {

                    double soma = somar(numeroa, numerob);
                    System.out.println("Resultado de soma: " + soma);

                    break;
                }

                case 2: {
                    double sulbtrai = subtrair(numeroa, numerob);
                    System.out.println("Resultado de soma: " + sulbtrai);

                    break;
                }

                case 3: {
                    double multi = multiplicar(numeroa, numerob);
                    System.out.println("Resultado de soma: " + multi);

                    break;
                }

                case 4: {
                    dividir(numeroa, numerob);

                    break;
                }

                default: {
                    System.out.println("Opcao invalida!");
                }

            }

            System.out.println("Deseja continuar? [1 - SIM, 2 - Não ]");
            continuar = teclado.nextInt();
        }while(continuar == 1);

        teclado.close();
    }



    static void apresentaropcoesmenu(){
        System.out.println("Calculador basica: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir ");
        System.out.println("Digite a opcao: ");
    }

    static double somar(double numa, double numb){
        return numa + numb;
    }

    static double subtrair(double numa, double numb){
        double resultado = numa - numb; 
        return resultado;
    }

    static double multiplicar(double numa, double numb){
        return numa * numb;
    }

    static void dividir(double numa, double numb){
        double resultado = 0;

        if(numb!=0){
            resultado = numa / numb;
        }else{
            System.out.println("Não é possivel dividir um numero por zero");
        }
        System.out.println("O resultado da divisao é: " + resultado);
    }
}
