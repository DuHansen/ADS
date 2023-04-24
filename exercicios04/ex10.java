package exercicios.lista4;
import java.util.Scanner;

/*
A PREFEITURA DE UMA CIDADE DESEJA FAZER UMA PESQUISA ENTRE SEUS HABITANTES. FAÇA UM
PROGRAMA PARA COLETAR OS DADOS SOBRE O SALÁRIO E NÚMERO DE FILHOS DE CADA HABITANTE E APÓS AS
LEITURAS, ESCREVA:
 MÉDIA DE SALÁRIO DA POPULAÇÃO
 MÉDIA DO NÚMERO DE FILHOS
 MAIOR SALÁRIO DOS HABITANTES
 PERCENTUAL DE PESSOAS COM SALÁRIO MENOR QUE R$ 1000,00.
O PROGRAMA DEVE PERGUNTAR AO USUÁRIO SE ELE DESEJA INSERIR AS INFORMAÇÕES PARA MAIS UM
HABITANTE.
 */
public class ex10 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Quantos habitantes: ");
    int habitantes = teclado.nextInt();
    
    double filhostotal = 0;
    int totalsalario = 0;
    int  maior = 0;
    int count = 0;
    System.out.println("//////////////////////////");

    for(int x = 0; x < habitantes; x++){

    System.out.println((x+1)+" Número de filhos: ");

    int filhos = teclado.nextInt();
    
    filhostotal += filhos;
    System.out.println("//////////////////////////");
    System.out.println((x+1)+" Salário: ");
    int salario = teclado.nextInt();
    totalsalario += salario;

    if(salario <= 1000){
        count++;
    }

    if(x == 0){
                
        maior = salario;
    }
    
    if(salario > maior){
        
        maior = salario;
    }
    }
    System.out.println("//////////////////////////");
    System.out.println("//////////////////////////");
    double percentual = count*100/habitantes;
    double media = totalsalario / habitantes;  
    double mediafilhos = filhostotal / habitantes;
    System.out.println();
    System.out.println("Percentual: "+percentual+"%");
    System.out.println();
    System.out.println("Média de filho: "+ mediafilhos);
    System.out.println();
    System.out.println("Média de salário: "+ media);
    System.out.println();
    System.out.println("Maior salário: "+ maior);
    System.out.println("//////////////////////////");
    System.out.println("//////////////////////////");

    teclado.close();
    }
    
}
