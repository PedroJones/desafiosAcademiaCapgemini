package desafio_capgemini;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		int n;
		String asterisc = "*";
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o número de linhas: ");
		n=ler.nextInt();
		
		String[][] matriz = new String[n][n];
		for(int linha=0;linha<n;linha++) {
				for (int space=n-1;space>linha;space--) {
					System.out.print(" ");
					}
				for(int coluna=0;coluna<=linha;coluna++) {
				
					matriz[linha][coluna]=asterisc;
					System.out.print(matriz[linha][coluna]);
				} 
		
				System.out.println("");
		}
	}

}
