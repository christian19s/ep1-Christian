import java.util.Arrays;

// remover essa classe, generalista é desnecessário
public class Horarios extends Turmas {
	private Character turno;
	private int[] dias = { 2, 3, 4, 5, 6 }, tempos = { 1, 2, 3, 4, 5 };
	private int i = 0;

	public Horarios() {
		this.turno = null;
		this.dias = null;
		this.tempos = null;
	}

	public Horarios(Character turno, int[] dias, int[] tempos) {
		this.turno = turno;
		this.dias = dias;
		this.tempos = tempos;
	}

	public void setTurno(Character turno) {
		this.turno = turno;
	}

	public char getTurno() {
		return turno;
	}

	public void setDias(int dias) {
		for (i = 0; i <= 4; i++) {
			this.dias[i] = dias;
		}
	}

	public void setTempos(int tempos) {
		for (i = 0; i <= 4; i++) {
			this.tempos[i] = tempos;
		}
	}

	String strDias = dias.toString();
	String strTempos = tempos.toString();

	@Override
	public String toString() {
		Character nchar = Character.toUpperCase(turno);
		return strDias + nchar + strTempos;
	}

	public String getHorario() {
		return toString();
	}

}
