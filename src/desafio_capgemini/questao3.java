package desafio_capgemini;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class questao3 {

	// Complete the sherlockAndAnagrams function below.
	static int calcularAnagramasPares(String palavra) {
		HashMap<String, Integer> map = new HashMap<>();

		int anagramasParesCount= 0;

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i + 1; j <= palavra.length(); j++) {
				String palavraSubStrings = palavra.substring(i, j);

				char[] chars = palavraSubStrings.toCharArray();
				Arrays.sort(chars);
				palavraSubStrings = String.valueOf(chars);

				int value = map.getOrDefault(palavraSubStrings, 0);
				if (value > 0) {
					anagramasParesCount += value;
				}
				map.put(palavraSubStrings, ++value);
			}
		}
		return anagramasParesCount;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra = ler.next();
		System.out.print(calcularAnagramasPares(palavra));
	}
}