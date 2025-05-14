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
		Scanner sc = new Scanner(System.in);

		DisciplinasBanco discip = new DisciplinasBanco();

		System.out.println("Digite o nome da disciplina: ");
		String nome = sc.nextLine();
		System.out.println("Digite o código da disciplina: ");
		int codigo = sc.nextInt();
		System.out.println("Digite a carga horária da disciplina em horas: ");
		int cargaHor = sc.nextInt();

		discip.addDisciplina(nome, codigo, cargaHor);

		sc.close();
	}
}
