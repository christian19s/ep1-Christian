import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Disciplinas {
	protected String nome, codigo;
	protected int cargaHor;
	protected final int maxPreReq = 3;
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

	public String addBlank() {
		String str = "";
		for (int i = 1; i <= maxPreReq; i++) {
			str = str + ",-";
		}
		return str;
	}

	// append de file
	public void salvarFile() {
		try (FileWriter escritor = new FileWriter("../info/disciplinas.csv", true)) {
			String str = getNome() + "," + getCodigo() + "," + Integer.valueOf(getCargaHor()) + addBlank() + "\n";
			escritor.write(str);
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

	public void addDisciplina(String nom, String codig, int cargaH) {
		setNome(nom);
		setCodigo(codig);
		setCargaHor(cargaH);
		salvarFile();
	}

	public void showInfo() {
		ArrayList<String[]> disciplinas = lerFile();

		for (String[] disciplina : disciplinas) {
			System.out.println("Nome: " + disciplina[0]);
			System.out.println("Código: " + disciplina[1]);
			System.out.println("Carga Horária: " + disciplina[2]);
			System.out.println("-----");
		}
	}

	public String[] addPreRequisitos(String codigo, String[] codPre) {
		// ler linha da disciplina e substituir uma linha branca por prereq por passada
		// buscar prerequisitos pelo codigo usando outra funcao
		List<String[]> lista = procuraDisciplina(codigo);
		String[] preReq;
		if (lista.contains("-") == true) {
			int index = lista.indexOf("-");
			lista.set(index, codPre);
			int newIndex = lista.indexOf(codPre);
			preReq = lista.get(newIndex);
			return preReq;
		} else {
			preReq = null;
			return preReq;
		}
	}

	// função para retornar info sobre uma disciplina específica passando código
	// como argumento
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
		List<String[]> resultados = procuraDisciplina(codigo);

		for (String[] linha : resultados) {
			String nome = linha[0]; // nome da disciplina
			String cod = linha[1]; // código
			String cargaHoraria = linha[2]; // carga horária

			System.out.printf(
					"Nome: %s | Código: %s | Carga Horária: %s%n",
					nome, cod, cargaHoraria);
		}
		resultados = null;
	}
}
