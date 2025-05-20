import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Disciplinas {
	protected String nome, codigo, cargaHor;
	static int NUM_COL = 3;

	List<Disciplinas> lista = new ArrayList<Disciplinas>();

	public Disciplinas() {
		this.nome = "";
		this.codigo = "";
		this.cargaHor = "";
	}

	public Disciplinas(String nome, String codigo, String cargaHor) {
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

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCargaHor(String cargaHor) {
		this.cargaHor = cargaHor;
	}

	public String getCargaHor() {
		return cargaHor;
	}

	@Override
	public String toString() {
		return getNome() + "," + getCodigo() + "," + getCargaHor() + "\n";
	}

	// append de file
	public void salvarFile() {
		try (FileWriter escritor = new FileWriter("../info/disciplinas.csv", true)) {
			escritor.write(toString());
			escritor.close();

			System.out.println("Disciplina " + getNome() + " adicionada.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// leitor de file
	public ArrayList<String[]> lerFile() {
		ArrayList<String[]> infoArray = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get("../info/disciplinas.csv"))) {
			String COMMA = ",";
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] tokens = linha.split(COMMA);
				infoArray.add(tokens);
			}
			// remover essa linha

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return infoArray;
	}

	public void addDisciplina(String nom, String codig, String cargaH) {
		setNome(nom);
		setCodigo(codig);
		setCargaHor(cargaH);
		salvarFile();
		Disciplinas discip = new Disciplinas(getNome(), getCodigo(), getCargaHor());
		lista.add(discip);
	}

	// leitor de file

	public void showInfo() {
		ArrayList<String[]> disciplinas = lerFile();

		// Exemplo de como acessar os dados
		for (String[] disciplina : disciplinas) {
			System.out.println("Nome: " + disciplina[0]);
			System.out.println("Código: " + disciplina[1]);
			System.out.println("Carga Horária: " + disciplina[2]);
			System.out.println("-----");
		}
	}

	private int contarDisciplinas() {
		int count = 0;
		return count;
	}

	public void preRequisitos() {
		// loopar por todos os elementos da file disciplinas e add prerequisitos com
		// base no codigo da disciplina
	}

	// função para retornar info sobre uma disciplina específica passando código
	// como argumento

	public void showDisciplina(String codigo) {

	}
}
