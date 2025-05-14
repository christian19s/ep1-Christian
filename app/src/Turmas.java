public class Turmas {
	private String professor, sala, horario;
	private int semestre, capAlunos;
	private boolean isPresencial, isDisponivel;

	public Turmas() {
		this.professor = "";
		this.sala = "";
		this.horario = "";
		this.semestre = 0;
		this.capAlunos = 0;

		if (isPresencial == false) {
			sala = "";
		}
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

	public String setSala() {
		return sala;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getHorario() {
		return horario;
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
}
