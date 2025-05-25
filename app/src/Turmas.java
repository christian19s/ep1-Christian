import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Turmas extends Disciplinas {
	private String professor, sala, modalidade, avaliacao, horario, semestre;
	private int capAlunos, quantAlunos, numTurma;

	public Turmas() {
		this.professor = "";
		this.sala = "";
		this.modalidade = "";
		this.avaliacao = "";
		this.horario = "";
		this.semestre = "";
		this.capAlunos = 0;
		this.quantAlunos = 0;
		this.numTurma = 0;
	}

	public Turmas(String professor, String sala, String modalidade, String avaliacao, String horario, String semestre,
			int capAlunos,
			int quantAlunos, int numTurma) {
		this.professor = professor;
		this.sala = sala;
		this.modalidade = modalidade;
		this.avaliacao = avaliacao;
		this.horario = horario;
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

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getSemestre() {
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

	// cálculo de média
	public float calcMediaA() {
		return 0;
	}

	public float calcMediaB() {
		return 0;
	}

	// adicionar alunos
	public void addAlunos(String matricula) {

	}

	public int calcNumTurma() {
		String PATH = "../info/turmas.csv";
		int cont = 0;
		try (BufferedReader br = Files.newBufferedReader(Paths.get(PATH))) {
			while (br.readLine() != null) {
				cont++;
			}
		} catch (IOException e) {
			e.printStackTrace();
			;
		}
		return cont;
	}

	// verifica se a sala está disponível no horário
	// mexer aqui depois
	public boolean checkDispSala(String sala, String horario) {
		// verificar todas as linhas do arquivo turmas.csv e tentar igualar uma sala a
		// um horario
		return false;
	}

	@Override
	public String toString() {
		return calcNumTurma() + getProfessor() + getCapAlunos() + getSala() + getModalidade();
	}

	public void salvarFile() {
		try (FileWriter escritor = new FileWriter("../info/turmas.csv", true)) {
			escritor.write(toString());
			escritor.close();

			System.out.println("Turma " + calcNumTurma() + " adicionada.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int colunaNumT = 0, colunaProf = 1, colunaSala = 2, colunaHor = 3, colunaMod = 4, colunaCapA = 5,
			colunaAval = 6, colunaSem = 7;

	public ArrayList<String[]> lerFile() {
		ArrayList<String[]> infoArray = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get("../info/turmas.csv"))) {
			String COMMA = ",";
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] tokens = linha.split(COMMA);
				infoArray.add(tokens);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return infoArray;
	}

	public ArrayList<String> lerArg(int arg) {
		ArrayList<String> infoArray = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get("../info/turmas.csv"))) {
			String COMMA = ",";
			String linha;

			while ((linha = br.readLine()) != null) {
				if (arg == colunaNumT) {
					infoArray.add((linha.split(COMMA)).toString());
				}
				if (arg == colunaProf) {
					infoArray.add((linha.split(COMMA)).toString());
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return infoArray;
	}

	// adicionar turmas
	public void addTurmas() {
		// cada turma terá uma disciplina salva como nome
	}
}
