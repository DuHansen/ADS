import java.util.Scanner;

/*
FAÇA UM PROGRAMA PARA LERA ARMAZENAR EM UM ARRAY A TEMPERATURA MÉDIA DOS MESES DO ANO.
O PROGRAMA DEVE CALCULAR:
-MENOR TEMPERATURA MÉDIA;
-MAIOR TEMPERATURA MÉDIA;
-MÉDIA DA TEMPERATURA DO ANO;
-AQUANTIDADE DE MESESEM QUE A TEMPERATURA FOI INFERIOR À MÉDIA ANUAL;
*/






public class ex06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] temperaturas = new double[12];

        double acumulador = 0;

        for(int i = 0; i < temperaturas.length; i++){
            System.out.print("Informe a temperatura média do mês: ");
            temperaturas[i] = teclado.nextDouble();
            acumulador = acumulador + temperaturas[i];

        }
        double media = acumulador / temperaturas.length;
        int contador = 0;
        double temperaturamenor = temperaturas[0];
        double temperaturamaior= temperaturas[0];

        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] < media){
                contador ++;
            }
            if(temperaturas[i] < temperaturamenor){
                temperaturamenor = temperaturas[i];

            }
            if(temperaturas[i] > temperaturamaior){
                temperaturamaior = temperaturas[i];
            }
        }
        
        System.out.println("A Média:  "+ media);
        
        System.out.println("Quantidade a baixo da Média:  "+ contador);
        
        System.out.println("A maior temperatura:  "+ temperaturamaior);
        
        System.out.println("A menor temperatura:  "+ temperaturamenor);
    }
}
