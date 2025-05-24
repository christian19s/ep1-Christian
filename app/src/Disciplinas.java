import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Disciplinas {
	protected String nome, codigo;
	protected int cargaHor;
	protected int quantPreReq = 3;
	static int NUM_COL = 3;

	List<Disciplinas> lista = new ArrayList<Disciplinas>();

	public Disciplinas() {
		this.nome = "";
		this.codigo = "";
		this.cargaHor = 0;
	}

	public Disciplinas(String nome, String codigo, int cargaHor) {
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

	public void setCargaHor(int cargaHor) {
		this.cargaHor = cargaHor;
	}

	public int getCargaHor() {
		return cargaHor;
	}

	public void addDisciplina(String nom, String codig, int cargaH) {
		setNome(nom);
		setCodigo(codig);
		setCargaHor(cargaH);
		ConfigCSV.salvarFile(getNome(), getCodigo(), getCargaHor(), "../info/disciplinas.csv");
	}

	public void showInfo() {
		ArrayList<String[]> disciplinas = ConfigCSV.lerFile("../info/disciplinas.csv");

		for (String[] disciplina : disciplinas) {
			System.out.println("Nome: " + disciplina[0]);
			System.out.println("Código: " + disciplina[1]);
			System.out.println("Carga Horária: " + disciplina[2]);
			System.out.println("-----");
		}
	}

	public List<String[]> procuraDisciplina(String codigo) {
		List<String[]> busca = new ArrayList<>();
		final String COMMA = ",";

		try (BufferedReader br = Files.newBufferedReader(Paths.get("../info/disciplinas.csv"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] dados = linha.split(COMMA);
				for (String valor : dados) {
					if (valor.equalsIgnoreCase(codigo)) {
						busca.add(dados);
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return busca;
	}

	public void exibirDisciplina(String codigo) {
		List<String[]> resultados = ConfigCSV.procuraFile("../info/disciplinas.csv", codigo);

		for (String[] linha : resultados) {
			String nome = linha[0];
			String cod = linha[1];
			String cargaHoraria = linha[2];

			System.out.printf(
					"Nome: %s | Código: %s | Carga Horária: %s%n",
					nome, cod, cargaHoraria);
		}
		resultados = null;
	}
}
