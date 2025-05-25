import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Alunos {
	protected String nome, curso, matricula;

	public Alunos() {
		this.nome = "";
		this.curso = "";
		this.matricula = "";
	}

	public Alunos(String nome, String curso, String matricula, List<Disciplinas> disciplinas) {
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

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void addAluno(String nome, String matricula, String curso, String PATH) {
		try {
			boolean matriculaExiste = false;

			for (String[] aluno : ConfigCSV.procuraFile(PATH, matricula)) {
				if (aluno.length > 1 && aluno[1].equals(matricula)) {
					matriculaExiste = true;
					break;
				}
			}

			if (!matriculaExiste) {
				ConfigCSV.salvarFile(nome, matricula, curso, PATH);
				JOptionPane.showMessageDialog(null, "Aluno " + nome + " adicionado(a).");
			} else {
				throw new IOException("Erro: Matrícula duplicada!");
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public String toString() {
		return getNome() + "," + getMatricula() + "," + getCurso() + "\n";
	}

	public void showInfo() {
	}

}
