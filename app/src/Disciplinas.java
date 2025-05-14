import java.util.ArrayList;

public class Disciplinas {
	protected String nome;
	protected int codigo, cargaHor;
	protected Alunos alunos = new Alunos();

	public Disciplinas() {
		this.nome = "";
		this.codigo = 0;
		this.cargaHor = 0;
	}

	public Disciplinas(String nome, int codigo, int cargaHor) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHor = cargaHor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCargaHor(int cargaHor) {
		this.cargaHor = cargaHor;
	}

	public int getCargaHor() {
		return cargaHor;
	}

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
