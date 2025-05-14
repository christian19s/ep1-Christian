import java.util.ArrayList;
import java.util.List;

public class DisciplinasBanco {
	protected String nome;
	protected int codigo, cargaHor;

	List<DisciplinasBanco> lista = new ArrayList<DisciplinasBanco>();

	public DisciplinasBanco() {
		this.nome = "";
		this.codigo = 0;
		this.cargaHor = 0;
	}

	public DisciplinasBanco(String nome, int codigo, int cargaHor) {
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

	public void addDisciplina(String nom, int codig, int cargaH) {
		setNome(nom);
		setCodigo(codig);
		setCargaHor(cargaH);

		DisciplinasBanco DB = new DisciplinasBanco(getNome(), getCodigo(), getCargaHor());
		lista.add(DB);
		AddFileDisciplina add = new AddFileDisciplina(nome, codigo, cargaHor);
		add.salvarFile();
	}

}
