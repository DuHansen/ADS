package exercicios03;
import java.util.Scanner;

        /*
         * CRIE UM  PROGRAMA  QUE  LEIA  O  NÚMERO  DE  EMPRÉSTIMOS  DE  CADA  LIVRO  DA  BIBLIOTECA.
         * AO  FINAL  O PROGRAMA  DEVE  INFORMARO  TÍTULO  DO  LIVRO  MAIS  EMPRESTADO  E 
         * QUANTO  FOI  ESSA  QUANTIDADE  DE EMPRÉSTIMOS.
         */
        public class ex03 {
            public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
        
            String titulomaisemprestado  = "";
            int quantidadedemaisemprestado = 0;
            int continuar = 0;

            do{
                System.out.println("Informe o titulo do livro");
                String titulo = teclado.nextLine();
                System.out.println("Informe o total de emprestimos: ");
                int emprestimo = teclado.nextInt();

                if(emprestimo > quantidadedemaisemprestado){
                    titulomaisemprestado =  titulo;
                    quantidadedemaisemprestado = emprestimo;
                }

                System.out.println("Deseja inserir um livro? 1 - sim , 2 - não ");
                continuar = teclado.nextInt();
                teclado.nextLine();
            }while(continuar == 1);

            System.out.println("Titulo mais emprestado: " + titulomaisemprestado);
            System.out.println("Quantidade de mais emprestado: " + quantidadedemaisemprestado);
            teclado.close();
            }
            
        }
    
    
