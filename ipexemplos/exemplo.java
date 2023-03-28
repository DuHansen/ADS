package ipexemplos;
import java.util.Scanner;


public class exemplo{
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma mensagem!"+"\n");
		String mensagem = teclado.nextLine();
        System.out.println(mensagem);
        teclado.close();
	}

}