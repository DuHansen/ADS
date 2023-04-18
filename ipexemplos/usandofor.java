package exemplos;
import java.util.Scanner;
public class usandofor {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int i;

    for(i = 0; i < 2; i++){
        System.out.println("Digite o seu nome:");
        String aluno = teclado.nextLine();

        System.out.println("Digite a primeira nota:");
        Double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota:");
        Double nota2 = teclado.nextDouble();

        Double media = (nota1 + nota2) /2;
         
        System.out.println("A nota final é:  " + media + "  do aluno  "+ aluno);
        
        teclado.nextLine();
        }

    
        teclado.close(); 
    }
}
