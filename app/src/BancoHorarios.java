public class BancoHorarios {
	private int dias;
	private String tempos;

	public BancoHorarios() {
		this.dias = 0;
		this.tempos = "";
	}

	public BancoHorarios(int dias, String tempos) {
		this.dias = dias;
		this.tempos = tempos;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	public void setTempos(String tempos) {
		this.tempos = tempos;
	}

	public String getTempos() {
		return tempos;
	}
}
