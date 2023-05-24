package exercicios05;
import java.util.Scanner;

/*
CRIE  UM  PROGRAMA  QUE  LEIA UMA MATRIZ 3X3 REPRESENTANDO  UM TABULEIRO  DE JOGO  DA VELHA.
EM SEGUIDA,VERIFIQUE SE HÁ ALGUM VENCEDOR NO JOGODA VELHA.
*/

public class ex17 {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[][] tabuleiro = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
		
		boolean interromper = false;
		for(int i = 0; i < tabuleiro.length; i++) {
			if(interromper) {
				break;
			}
			for(int j = 0; j < tabuleiro[i].length; j++) {
				//Preenchendo o tabuleiro
				System.out.print("Informe a linha da sua jogada: ");
				int posicaoLinha = teclado.nextInt();
				System.out.print("Informe a coluna da sua jogada: ");
				int posicaoColuna = teclado.nextInt();
				teclado.nextLine();
				System.out.print("Informe X ou O: ");
				tabuleiro[posicaoLinha][posicaoColuna] = teclado.nextLine();
				System.out.println("\n------------------------");
				
				//Imprimindo o tabuleiro
				for(int linha = 0; linha < tabuleiro.length; linha++) {
					for(int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
						if(coluna < 2) {
							System.out.print(tabuleiro[linha][coluna] + " | ");
						} else {
							System.out.print(tabuleiro[linha][coluna] + " ");
						}
						
					}
					if(linha < 2) {
						System.out.println("\n__________");
					}
				}
				System.out.println("\n------------------------");
				
				//Verificando ganhador
				//Linha 0
				if(tabuleiro[0][0].equalsIgnoreCase(tabuleiro[0][1]) 
						&& tabuleiro[0][1].equalsIgnoreCase(tabuleiro[0][2])
						&& !tabuleiro[0][0].equalsIgnoreCase(" ")) {
					if(tabuleiro[0][0].equalsIgnoreCase("x")) {
						System.out.println("O jogador do X venceu a partida - Linha 0");
						interromper = true;
						break;
					} else {
						System.out.println("O jogador do O venceu a partida - Linha 0");
						interromper = true;
						break;
					}
				}
				//Linha 1
				if(tabuleiro[1][0].equalsIgnoreCase(tabuleiro[1][1]) 
						&& tabuleiro[1][1].equalsIgnoreCase(tabuleiro[1][2]) 
					    && !tabuleiro[1][0].equalsIgnoreCase(" ")) {
					if(tabuleiro[1][0].equalsIgnoreCase("x")) {
						System.out.println("O jogador do X venceu a partida - Linha 1");
						interromper = true;
						break;
					} else {
						System.out.println("O jogador do O venceu a partida - Linha 1");
						interromper = true;
						break;
					}
				}
				//Linha 2
				if(tabuleiro[2][0].equalsIgnoreCase(tabuleiro[2][1]) 
						&& tabuleiro[2][1].equalsIgnoreCase(tabuleiro[2][2]) 
					    && !tabuleiro[2][0].equalsIgnoreCase(" ")) {
					if(tabuleiro[2][0].equalsIgnoreCase("x")) {
						System.out.println("O jogador do X venceu a partida - Linha 2");
						interromper = true;
						break;
					} else {
						System.out.println("O jogador do O venceu a partida - Linha 2");
						interromper = true;
						break;
					}
				}
				//Coluna 0
				if(tabuleiro[0][0].equalsIgnoreCase(tabuleiro[1][0]) 
						&& tabuleiro[1][0].equalsIgnoreCase(tabuleiro[2][0])
						&& !tabuleiro[0][0].equalsIgnoreCase(" ")) {
					if(tabuleiro[0][0].equalsIgnoreCase("x")) {
						System.out.println("O jogador do X venceu a partida - Coluna 0");
						interromper = true;
						break;
					} else {
						System.out.println("O jogador do O venceu a partida - Coluna 0");
						interromper = true;
						break;
					}
				}
				//Coluna 1
				if(tabuleiro[0][1].equalsIgnoreCase(tabuleiro[1][1]) 
						&& tabuleiro[1][1].equalsIgnoreCase(tabuleiro[2][1]) 
						&& !tabuleiro[0][1].equalsIgnoreCase(" ")) {
					if(tabuleiro[0][1].equalsIgnoreCase("x")) {
						System.out.println("O jogador do X venceu a partida - Coluna 1");
						interromper = true;
						break;
					} else {
						System.out.println("O jogador do O venceu a partida - Coluna 1");
						interromper = true;
						break;
					}
				}
				//Coluna 2
				if(tabuleiro[0][2].equalsIgnoreCase(tabuleiro[1][2]) 
						&& tabuleiro[1][2].equalsIgnoreCase(tabuleiro[2][2]) 
						&& !tabuleiro[0][2].equalsIgnoreCase(" ")) {
					if(tabuleiro[0][2].equalsIgnoreCase("x")) {
						System.out.println("O jogador do X venceu a partida - Coluna 2");
						interromper = true;
						break;
					} else {
						System.out.println("O jogador do O venceu a partida - Coluna 2");
						interromper = true;
						break;
					}
				}
				//Diagonal Principal
				if(tabuleiro[0][0].equalsIgnoreCase(tabuleiro[1][1]) 
						&& tabuleiro[1][1].equalsIgnoreCase(tabuleiro[2][2]) 
						&& !tabuleiro[0][0].equalsIgnoreCase(" ")) {
					if(tabuleiro[0][0].equalsIgnoreCase("x")) {
						System.out.println("O jogador do X venceu a partida - Diagonal Principal");
						interromper = true;
						break;
					} else {
						System.out.println("O jogador do O venceu a partida - Diagonal Principal");
						interromper = true;
						break;
					}
				}
				//Diagonal Secundária
				if(tabuleiro[0][2].equalsIgnoreCase(tabuleiro[1][1]) 
						&& tabuleiro[1][1].equalsIgnoreCase(tabuleiro[2][0]) 
						&& !tabuleiro[0][2].equalsIgnoreCase(" ")) {
					if(tabuleiro[0][2].equalsIgnoreCase("x")) {
						System.out.println("O jogador do X venceu a partida - Diagonal Secundária");
						interromper = true;
						break;
					} else {
						System.out.println("O jogador do O venceu a partida - Diagonal Secundária");
						interromper = true;
						break;
					}
				}
			}
		}
		teclado.close();
	}
}

       













        