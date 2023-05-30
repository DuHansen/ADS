package funcao;
import java.util.Scanner;

/*
DESENVOLVA UM PROGRAMA QUE LEIA A IDADE DE UM NADADOR.
DESENVOLVA UM MÉTODO SEM RETORNO (“PROCEDIMENTO” )QUE   RECEBA ESSA   IDADE POR  
 PARÂMETRO E   INFORME A   CATEGORIA   DO   NADADOR CONFORME TABELAABAIXO:
 IDADE CATEGORIA
 ATÉ 10 ANOS MIRIM
 11 A 14 ANOS INFANTIL
 15 A 19 ANOS JUVENIL 
 ACIMA DE 19 ADULTO

*/
public class exer01 {
    public static void main(final String[] args) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("Qual sua idade: ");
        final int idade = teclado.nextInt();

        filtro(idade);

        teclado.close();
    }

    static int filtro(final int idade){
        final int categoria = 0 ;

        if(idade <= 10){        
            System.out.println("O atleta participa da categoria MIRIM" );
        }else{
            if(idade >=11 && idade <=14 ){
            System.out.println("O atleta participa da categoria INFANTIL" );
            
        }else{
            if(idade>=15 && idade <=19){
            System.out.println("O atleta participa da categoria JUVENIL" );
        }else{
            if(idade > 19)
            System.out.println("O atleta participa da categoria ADULTO" );
            } 
        }
    }
        return categoria;
    }
}