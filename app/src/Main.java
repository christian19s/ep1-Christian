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

		Disciplinas discip = new Disciplinas();

		System.out.println("Digite o nome da disciplina: ");
		String nome = sc.nextLine();
		System.out.println("Digite o código da disciplina: ");
		String codigo = sc.nextLine();
		System.out.println("Digite a carga horária da disciplina em horas: ");
		String cargaHor = sc.nextLine();

		discip.addDisciplina(nome, codigo, cargaHor);

		sc.close();

		discip.showInfo();

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * Alunos alunos = new Alunos();
		 * 
		 * System.out.println("Digite o nome do aluno: ");
		 * String nome = sc.nextLine();
		 * alunos.setNome(nome);
		 * System.out.println("Digite a matrícula do aluno: ");
		 * String matricula = sc.nextLine();
		 * alunos.setMatricula(matricula);
		 * System.out.println("Digite o curso do aluno: ");
		 * String curso = sc.nextLine();
		 * alunos.setCurso(curso);
		 * alunos.salvarFile();
		 * alunos.lerFile();
		 * sc.close();
		 */
	}
}
