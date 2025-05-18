import java.io.FileWriter;
import java.io.IOException;

public class AddFileTurmas extends Turmas {

	@Override
	public String toString() {
		return getProfessor() + "," + getSala() + "," + getSemestre() + "," + getCapAlunos() + "," + getAvaliacao()
				+ "," + getModalidade() + "," + getQuantAlunos() + "," + getHorario() + "\n";
	}

	public void salvarFile(int nTurma) {
		try (FileWriter escritor = new FileWriter("info/turmas.csv", true)) {
			AddFileTurmas aft = new Turmas(getProfessor(), getSala(), getCargaHor());

			escritor.write(afd.toString());
			escritor.close();

			System.out.println("Turma " + getNome() + " adicionada.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
