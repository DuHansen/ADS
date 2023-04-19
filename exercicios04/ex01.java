package exercicios04;
import java.util.Scanner;

/*
DESENVOLVA UM PROGRAMA PARA LER 2 NÚMEROS.
SE O SEGUNDO NÚMERO INFORMADO FOR “0”(ZERO),
O  PROGRAMA  DEVERÁ  APRESENTAR  A  MENSAGEM  DE “VALOR INVÁLIDO!”,
E  DEVE  LER  O  SEGUNDO  NÚMERO NOVAMENTE,OU  SEJA,
O  PROGRAMA  NÃO  PODE ACEITAR  O  VALOR  ZERO  PARA  O  SEGUNDO  NÚMERO.
O PROGRAMA DEVE IMPRIMIR O RESULTADO DA DIVISÃO DO PRIMEIRO NÚMERO PELO SEGUNDO NÚMERO.
*/
public class ex01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero:");
        Double numero1 = teclado.nextDouble();
       
        System.out.println("Digite o segundo numero:");
        Double numero2 = teclado.nextDouble();
      
        Double resultado = numero1 / numero2;
        System.out.println("O resultado da divisão:  " + resultado);

        if(numero2 == 0){
            for(int i = 0; i < 1; i++) {
                     System.out.println("Digite o segundo numero que seja diferente de zero:   ");
                     Double numero = teclado.nextDouble();
                     Double resultadoo = numero1 / numero;
                     System.out.println("O resultado da divisão:" + resultadoo);
                     }
        }
        teclado.close();
    }

}