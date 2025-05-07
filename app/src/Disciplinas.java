public class Disciplinas {
	private String nome, codigo, cargaHor, preReq;

	public Disciplinas() {
		this.nome = "";
		this.codigo = "";
		this.cargaHor = "";
		this.preReq = "";
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

	public void setCargaHor(String cargaHor) {
		this.cargaHor = cargaHor;
	}

	public String getCargaHor() {
		return cargaHor;
	}

	public void setPreReq(String preReq) {
		this.preReq = preReq;
	}

	public String getPreReq() {
		return preReq;
	}

	public void getInfo() {
		System.out.println("Disciplina: " + nome);
		System.out.println("Código: " + codigo);
		System.out.println("Carga horária: " + cargaHor);
		System.out.println("Pré-requisitos: " + preReq);
	}
}
