package exercicios.lista4;
/*
 * FAÇA UM PROGRAMA QUE LEIA O VALOR DAS RECEITAS E DESPESAS DE UMA EMPRESA E EXIBA NA TELA O
RESULTADO DO MÊS DESSA EMPRESA. CASO O RESULTADO SEJA NEGATIVO EXIBA A MENSAGEM "A EMPRESA
FICOU NO PREJUÍZO ESSE MÊS", CASO CONTRÁRIO INFORME A MENSAGEM "TIVEMOS UM RESULTADO POSITIVO
ESSE MÊS".
 */
public class ex16 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int continuar = 0, totalreceita = 0, totaldivida = 0;
        
        do{
        System.out.println("Qual sua receita: ");
        int receita = teclado.nextInt();
        totalreceita += receita;

        System.out.println("Qual sua despesa: ");
        int divida = teclado.nextInt();
            totaldivida += divida;

        System.out.println("Deseja continuar 1 sim, 2 não : ");
            continuar = teclado.nextInt();

        }while(continuar == 1);

        if(totaldivida > totalreceita){
            System.out.println("Vocẽ está negativo!");
        }
        if(totaldivida < totalreceita){
            System.out.println("Vocẽ está positivo!");
        }
        teclado.close();

    }
    
}

    
}
