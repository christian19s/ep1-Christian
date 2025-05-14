import java.io.FileWriter;
import java.io.IOException;

public class AddFileDisciplina extends DisciplinasBanco {

	public AddFileDisciplina(String nome, int codigo, int cargaHor) {
		setNome(nome);
		setCodigo(codigo);
		setCargaHor(cargaHor);
	}

	@Override
	public String toString() {
		return getNome() + "," + getCodigo() + "," + getCargaHor() + "\n";
	}

	public void salvarFile() {
		try (FileWriter escritor = new FileWriter("info/disciplinas.csv", true)) {
			AddFileDisciplina afd = new AddFileDisciplina(getNome(), getCodigo(), getCargaHor());

			escritor.write(afd.toString());
			escritor.close();

			System.out.println("Disciplina " + getNome() + " adicionada.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
