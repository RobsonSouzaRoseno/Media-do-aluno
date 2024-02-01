package curso_programacao;

import java.util.Scanner;

public class notaDoAluno {

	public static void main(String[] args) {
		
		try (Scanner nota = new Scanner (System.in)) {
			System.out.println("Nome do aluno: ");
			String nome = nota.nextLine();
			
			System.out.println("Nota 1: ");
			Double n1 = nota.nextDouble();
			System.out.println("Nota 2: ");
			Double n2 = nota.nextDouble();
			System.out.println("Nota 3: ");
			Double n3 = nota.nextDouble();
			System.out.println("Nota 4: ");
			Double n4 = nota.nextDouble();
			 double media = ((n1 + n2 + n3 + n4) /4);
			
			
			System.out.println("Resultado: " + media);
			
			if (media <= 5) {
				System.out.println("Reprovado ");
			} else if (media <= 6) {
				System.out.println("Recuperacao, estude mais ");
				
			} else {
				System.out.println("Aprovado");
				System.out.println("Parabéns " + nome);
			}
		}
				
	}

}
