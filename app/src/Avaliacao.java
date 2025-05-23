import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
	private Alunos alunos = new Alunos();
	private Disciplinas disciplinas = new Disciplinas();

	public void cadAlunoDisciplina(String matricula, String cod) {
		List<String[]> listaDisciplinas = disciplinas.procuraDisciplina(cod);
		for (String[] linha : listaDisciplinas) {
			String nome = linha[0]; // Coluna 0: nome da disciplina
			String codigo = linha[1]; // Coluna 1: código
			String cargaHoraria = linha[2]; // Coluna 2: carga horária
		}
	}
}
