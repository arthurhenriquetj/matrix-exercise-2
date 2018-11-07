package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt(); // recebendo o numero de linhas da matriz
		int n2 = sc.nextInt(); // recebendo o numero de colunas da matriz

		int[][] mat = new int[n1][n2]; // matriz instanciada na memoria

		for (int i = 0; i < n1; i++)
			for (int j = 0; j < n2; j++) {
				mat[i][j] = sc.nextInt();
			} // preenchendo os campos da matriz

		sc.close();
	}

}
