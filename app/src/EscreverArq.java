import java.io.FileWriter;
import java.io.IOException;

public class EscreverArq {
	public static void main(String[] args) {
		try {
			FileWriter esc = new FileWriter("info/info.csv");
			esc.write("editar aqui depois");
			esc.close();
			System.out.println("Mudanças salvas.");
		} catch (

		IOException e) {
			System.out.println("Um erro ocorreu.");
			e.printStackTrace();
		}
	}
}
