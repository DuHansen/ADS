package exercicios03;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args){
          
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Informe o salario bruto:");
        Double salario= teclado.nextDouble();
    
        salario *= 0.9; // salario = salario * 0.9 // 10% do salario bruto
        
        if(salario<1000){
            salario *= 0.95;
        }else{
            if(salario > 3000){
            salario *= 0.80;
        }else{
            salario *= 0.9;
            }       
        }   
        System.out.println(salario);
        teclado.close();
    }
}