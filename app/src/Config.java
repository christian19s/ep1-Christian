public final class Config {
	public static String matricula;

	public static void setMatricula(String matricula) {
		Config.matricula = matricula;
	}

	public static String getMatricula() {
		return matricula;
	}

	public static void main(String[] args) {
		matricula = "pqp";
	}
}
