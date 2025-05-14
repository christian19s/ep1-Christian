import java.util.ArrayList;

public class Alunos {
	protected String nome, curso;
	protected int matricula;
	protected ArrayList alunos = new ArrayList<Alunos>();

	public Alunos() {
		this.nome = "";
		this.curso = "";
		this.matricula = 0;
	}

	public Alunos(String nome, String curso, int matricula) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

}
