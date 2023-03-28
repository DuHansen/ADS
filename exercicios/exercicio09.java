package exercicios;
import java.util.Scanner;

public class exercicio09 {

    public static void main( String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe o valor do carro:");
        double valorcarro = teclado.nextDouble();

        double valormercado = ((valorcarro * 35)/100) + valorcarro + ((valorcarro * 45)/100);

        System.out.println("Salario atual:" + valormercado);
       

        teclado.close();
    
}



}

/*9–OCUSTO DE UM CARRO NOVO PARA O CONSUMIDOR É A SOMA DO CUSTO DE FÁBRICA COM A PORCENTAGEM DO  DISTRIBUIDOR  E  DOS  IMPOSTOS (APLICADOS  AO  CUSTO  DE  FÁBRICA).SUPONDO  QUE  O  PERCENTUAL  DO DISTRIBUIDOR SEJA DE 28%E DOS IMPOSTOS DE 45%.ESCREVA UM ALGORITMO PARA LER O MODELO DE  UM CARRO, O SEU CUSTO DE FÁBRICA E ESCREVAO MODELO DO CARRO E SEU CUSTO FINAL AO CONSUMIDOR.*/
