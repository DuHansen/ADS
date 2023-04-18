package exemplos;
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int i = 0;

        do{
        System.out.println("Digite o seu nome:");
        String aluno = teclado.nextLine();

        System.out.println("Digite a primeira nota:");
        Double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota:");
        Double nota2 = teclado.nextDouble();

        Double media = (nota1 + nota2) /2;
         
        System.out.println("A nota final é:  " + media + "  do aluno  "+ aluno);
        
        ++ i;
        teclado.nextLine();
        
        }while(i < 2);
        teclado.close(); 
    }
}
