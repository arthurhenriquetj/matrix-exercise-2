package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digit the number of lines:");
		int n1 = sc.nextInt(); // recebendo o numero de linhas da matriz
		System.out.println("Digit the number of columns:");
		int n2 = sc.nextInt(); // recebendo o numero de colunas da matriz

		int[][] mat = new int[n1][n2]; // matriz instanciada na memoria

		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < n2; j++) {
				System.out.println("Digit the number to position: " + i + " , " + j);
				mat[i][j] = sc.nextInt();
			} // preenchendo os campos da matriz

		System.out.println("Select a number:");
		int n3 = sc.nextInt();

		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < n2; j++) {
				if (mat[i][j] == n3) { // se o numero escolhido estiver na matriz
					System.out.println("Position: " + i + " , " + j); // imprimir a posicao do numero
					if (j>0) // se a coluna for maior que zero
						System.out.println("Left: " + mat[i][j-1]); // o numero da esquerda sera o de mesma linha, porem a uma coluna anterior
					if (i>0) // se a linha for maior que zero
						System.out.println("Up: " + mat[i-1][j]); // o numero acima sera o de mesma coluna, porem uma linha anterior
					if (j<mat[i].length-1) // se a coluna for menor que o numero de colunas menos 1
						System.out.println("Right: " + mat[i][j+1]); // o numero da direita sera o da mesma linha porem da proxima coluna
					if (i<mat.length-1) // se a linha for menor que o numero de linhas menos 1
						System.out.println("Down: " + mat[i+1][j]); // o numero de baixo sera o da proxima linha e mesma coluna
				}
			}

		sc.close();
	}

}
