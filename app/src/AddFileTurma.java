import java.io.FileWriter;

public class AddFileTurma extends Turmas {
	public static void main(String[] args) {
		FileWriter escritor = new FileWriter("info/turmas.csv");
		Turmas turma = new Turmas(argumentos);

		escritor.write(turma.toString());
	}
}
