package funcao;
import java.util.Scanner;

public class exer08 {
    public static void main(final String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a primeira medida: " );
        double ladoA = teclado.nextDouble();
        System.out.print("Informe a segunda medida: " );
        double ladob = teclado.nextDouble();
        System.out.print("Informe a terceira medida: " );
        double ladoc = teclado.nextDouble();

        if(isTriangulo(ladoA, ladob, ladoc)){
            classificar(ladoA, ladob, ladoc);
        }else{
            System.out.print("As medidas não formam um triangulo." );
        }
        teclado.close();
    }

        static boolean isTriangulo(double ladoA, double ladob, double ladoc){
            boolean retorno = true;

            if(ladoA > (ladob+ladoc)){
                retorno = false;
            }
            if(ladob > (ladoA+ladoc)){
                retorno = false;
            }
            if(ladoc > (ladob+ladoA)){
                retorno = false;
            } 
            return retorno;
        }


        static void classificar(double ladoA, double ladob, double ladoc){

            if(ladoA ==  ladob && ladob == ladoc){
                System.out.println("Equilatero");
            }else{
            if(ladoA !=  ladob && ladob != ladoc){
                System.out.println("Escaleno");
            }else{
            if(ladoA ==  ladob && ladob == ladoc){
                System.out.println("isoseceles");
                }
            }
        }
    }
}