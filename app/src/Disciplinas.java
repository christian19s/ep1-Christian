import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Disciplinas {
	protected String nome;
	protected int codigo, cargaHor;
	static int NUM_COL = 3;

	List<Disciplinas> lista = new ArrayList<Disciplinas>();

	public Disciplinas() {
		this.nome = "";
		this.codigo = 0;
		// formas de avaliação

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
	public void lerFile() {
		try {
			String COMMA = ",";
			BufferedReader br = Files.newBufferedReader(Paths.get("../info/disciplinas.csv"));

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

	// conversor de tokens para arrays de dados
	public void converteToken(String tick) {
		List<String> dados = new ArrayList<>();
		int i = 0;
		String oldTick = "";
		for (i = 0; i <= 2; i++) {
			oldTick = oldTick + tick;
		}
		dados.add(oldTick);
		System.out.println(toString());
	}

	public void addDisciplina(String nom, int codig, int cargaH) {
		setNome(nom);
		setCodigo(codig);
		setCargaHor(cargaH);
		salvarFile();
		Disciplinas discip = new Disciplinas(getNome(), getCodigo(), getCargaHor());
		lista.add(discip);
	}

	// leitor de file

}
