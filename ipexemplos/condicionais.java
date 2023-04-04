package app;
import java.util.Scanner;
/*Em uma feira, as maças custam R$ 1,30 cada se forem compradas menos de uma dúzia, */
public class condicionais {
    public static void main(String[] args) throws Exception {

   

        System.out.println("Digite a quantidade de maças");
        Scanner teclado = new Scanner(System.in);

        int quantidade = teclado.nextInt();
        double sempromo = 1.30;
        double compromo = 1;
        
        
        
        if(quantidade < 12){
            System.out.println("o RRESULTADO   =  " + quantidade*sempromo); 
        }else{
            System.out.println("o RRESULTADO    =   "+    quantidade*compromo);
        }

        //System.out.println("É o dobro");

        teclado.close();
    }
}
