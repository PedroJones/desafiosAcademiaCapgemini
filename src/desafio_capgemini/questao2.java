package desafio_capgemini;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int restante;
		boolean y=false;
		int countMaiusc = 0;
	    int countMinusc = 0;
	    int countDig = 0;
	    int countCharacter = 0;
		
	do {
		System.out.println("Cadestre sua senha: ");
		String senha = ler.next();
		
	    
		if (senha.length() <6) {
			restante=6-senha.length();
			System.out.println("Sua senha está fraca. Adicione "+restante +" caracter(es) para torná-la segura.");
		}
		for(int i = 0; i < senha.length(); i++) {
			char x = senha.charAt(i);
			if(Character.isUpperCase(x)) {
				countMaiusc++;
			}
			if(Character.isLowerCase(x)) {
				countMinusc++;
			}
			if(Character.isDigit(x)) {
				countDig++;
			}
			if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$") || senha.contains("%") || senha.contains("^")
					|| senha.contains("&") || senha.contains("*") || senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
				countCharacter++;
			}
		}
		
	     	if(countMaiusc == 0) {
	            System.out.println("Sua senha está fraca. Sua senha deve conter no mínimo 1 letra maiúscula.");
	        }
	        if(countMinusc == 0) {
	            System.out.println("Sua senha está fraca. Sua senha deve conter no mínimo 1 letra minúscula.");
	        }
	        if(countDig == 0) {
	            System.out.println("Sua senha está fraca. Sua senha deve conter no mínimo 1 digito.");
	        }
	        if(countCharacter == 0) {
	            System.out.println("Sua senha está fraca. Sua senha deve conter no mínimo 1 caracter especial do tipo: '?!@#$%^&*()-+' .");
	        }
	        else {
	            System.out.println("Sua senha foi cadastrada com sucesso!");
	            y=true;
	        }
		
		}while (y == false);
		
	}

}


