import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Alunos {
	protected String nome, curso, matricula;
	protected List<Disciplinas> disciplinas = new ArrayList<>();

	public Alunos() {
		this.nome = "";
		this.curso = "";
		this.matricula = "";
		this.disciplinas = null;
	}

	public Alunos(String nome, String curso, String matricula, List<Disciplinas> disciplinas) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.disciplinas = disciplinas;
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

	public void addAluno(int matricula) {
		// loopar por todos os alunos e verificar se algum elemento já está na file
	}

	@Override
	public String toString() {
		return getNome() + "," + getMatricula() + "," + getCurso() + "\n";
	}

	public void salvarFile() {
		try (FileWriter escritor = new FileWriter("../info/alunos.csv", true)) {
			escritor.write(toString());
			escritor.close();

			System.out.println("Aluno " + getNome() + " adicionado(a).");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// leitor de file
	public void lerFile() {
		try {
			String COMMA = ",";
			BufferedReader br = Files.newBufferedReader(Paths.get("../info/alunos.csv"));

			String linha;

			while ((linha = br.readLine()) != null) {
				String[] tokens = linha.split(COMMA);

				for (String token : tokens) {
					System.out.println(token);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// adicionar matricula como argumento aqui
	public void showInfo() {
	}
}
