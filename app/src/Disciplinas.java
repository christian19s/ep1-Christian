import java.util.ArrayList;

public class Disciplinas {
	protected Alunos alunos = new Alunos();

	public void addAluno(Alunos alunos) {
		alunos.setNome(alunos.nome);
		alunos.setCurso(alunos.curso);
		alunos.setMatricula(alunos.matricula);
	}

	public void getInfo() {
		System.out.println("Disciplina: " + nome);
		System.out.println("Código: " + codigo);
		System.out.println("Carga horária: " + cargaHor);
	}
}
