import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Disciplinas {
	protected String nome;
	protected int codigo, cargaHor;

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

	public void addDisciplina(String nom, int codig, int cargaH) {
		setNome(nom);
		setCodigo(codig);
		setCargaHor(cargaH);
		salvarFile();
	}

	// leitor de file

}
