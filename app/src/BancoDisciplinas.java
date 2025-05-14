import java.util.ArrayList;
import java.util.List;

public class BancoDisciplinas extends Disciplinas {

	final List<Disciplinas> BD = new ArrayList<Disciplinas>();
	Disciplinas dp = new Disciplinas();

	// Declaração das disciplinas
	protected Disciplinas C1 = new Disciplinas("Cálculo 1", 113034, 90);
	protected Disciplinas C2 = new Disciplinas("Cálculo 2", 113042, 90);
	protected Disciplinas C3 = new Disciplinas("Cálculo 3", 113051, 90);
	protected Disciplinas EA = new Disciplinas("Engenharia e Ambiente", 198005, 60);
	protected Disciplinas PEAE = new Disciplinas("Probabilidade e Estatística Aplicada à Engenharia", 195332, 60);
	protected Disciplinas MNE = new Disciplinas("Métodos Numéricos para Engenharia", 195413, 60);
	protected Disciplinas DIAC = new Disciplinas("Desenho Industrial Assistido por Computador", 199176, 90);
	protected Disciplinas F1EXP = new Disciplinas("Física 1 Experimental", 118010, 30);
	protected Disciplinas QGT = new Disciplinas("Química Geral Teórica", 114626, 60);
	protected Disciplinas APC = new Disciplinas("Algoritmos e Programação de Computadores", 113476, 90);
	protected Disciplinas F1 = new Disciplinas("Física 1", 118001, 60);
	protected Disciplinas MECSOL = new Disciplinas("Mecânica dos Sólidos 1 para Engenharia", 195308, 60);
	protected Disciplinas IE = new Disciplinas("Introdução à Engenharia", 198013, 30);
	protected Disciplinas IAL = new Disciplinas("Introdução à Álgebra Linear", 113093, 60);
	protected Disciplinas QGE = new Disciplinas("Química Geral Experimental", 114634, 30);
	protected Disciplinas EE = new Disciplinas("Engenharia Econômica", 193321, 60);
	protected Disciplinas TED1 = new Disciplinas("Teoria de Eletrônica Digital 1", 119428, 60);
	protected Disciplinas PED1 = new Disciplinas("Prática de Eletrônica Digital 1", 119466, 30);

	public BancoDisciplinas() {
		BD.add(C1);
		BD.add(C2);
		BD.add(C3);
		BD.add(EA);
		BD.add(PEAE);
		BD.add(MNE);
		BD.add(DIAC);
		BD.add(F1EXP);
		BD.add(QGT);
		BD.add(APC);
		BD.add(F1);
		BD.add(MECSOL);
		BD.add(IE);
		BD.add(IAL);
		BD.add(QGE);
		BD.add(EE);
		BD.add(TED1);
		BD.add(PED1);
	}

	@Override
	public String toString() {
		StringBuilder SB = new StringBuilder();
		for (Disciplinas disciplina : BD) {
			SB.append("\nDisciplina: ").append(disciplina.nome)
					.append("\nCódigo: ").append(disciplina.codigo)
					.append("\nCarga horária: ").append(disciplina.cargaHor)
					.append("\n-----------------");
		}
		return SB.toString();
	}

	public void printDisciplinas() {
		System.out.println(this.toString());
	}

}
