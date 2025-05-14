import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite (1-3) para selecionar um modo.");
		 * System.out.println("-------------------------------------");
		 * System.out.println("1. Aluno");
		 * System.out.println("2. Disciplina/Turma");
		 * System.out.println("3. Avaliação/Frequência");
		 * int resp = sc.nextInt();
		 * 
		 * switch (resp) {
		 * case 1:
		 * }
		 */

		BancoDisciplinas bd = new BancoDisciplinas();
		bd.printDisciplinas();
	}
}
