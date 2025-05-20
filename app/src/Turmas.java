import java.util.ArrayList;
import java.util.Arrays;

public class Turmas extends Disciplinas {
	private String professor, sala, modalidade, avaliacao;
	private int semestre, capAlunos, quantAlunos, numTurma;

	public Turmas() {
		this.professor = "";
		this.sala = "";
		this.modalidade = "";
		this.avaliacao = "";
		this.semestre = 0;
		this.capAlunos = 0;
		this.quantAlunos = 0;
		this.numTurma = 0;
	}

	public Turmas(String professor, String sala, String modalidade, String avaliacao, int semestre, int capAlunos,
			int quantAlunos, int numTurma) {
		this.professor = professor;
		this.sala = sala;
		this.modalidade = modalidade;
		this.avaliacao = avaliacao;
		this.semestre = semestre;
		this.capAlunos = capAlunos;
		this.quantAlunos = quantAlunos;
		this.numTurma = numTurma;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getProfessor() {
		return professor;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getSala() {
		return sala;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setCapAlunos(int capAlunos) {
		this.capAlunos = capAlunos;
	}

	public int getCapAlunos() {
		return capAlunos;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setQuantAlunos(int quantAlunos) {
		this.quantAlunos = quantAlunos;
	}

	public int getQuantAlunos() {
		return quantAlunos;
	}

	// cálculo de média
	public float calcMediaA() {
		return 0;
	}

	public float calcMediaB() {
		return 0;
	}

	// adicionar alunos
	public void addAlunos(String matricula) {
		ArrayList<Alunos> alunos = new ArrayList<>();

		Alunos aluno = new Alunos();

	}

	// verifica se a sala está disponível no horário
	// mexer aqui depois
	public boolean checkDispSala(String sala, String horario) {
		// verificar todas as linhas do arquivo turmas.csv e tentar igualar uma sala a
		// um horario
		return false;
	}

	// adicionar turmas
	public void addTurmas() {
	}
}
