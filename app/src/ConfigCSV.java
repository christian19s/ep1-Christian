import java.io.*;
import java.util.*;
import java.nio.file.*;

public class ConfigCSV {

	public static void salvarFile(String str1, String str2, int num, String PATH) {
		try (FileWriter escritor = new FileWriter(PATH, true)) {
			String str = str1 + "," + str2 + "," + Integer.valueOf(num) + ",-" + ",-" + ",-," + "\n";
			escritor.write(str);
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<String[]> lerFile(String PATH) {
		ArrayList<String[]> infoArray = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(PATH))) {
			String COMMA = ",";
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] tokens = linha.split(COMMA);
				infoArray.add(tokens);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return infoArray;
	}

	public static List<String[]> procuraFile(String PATH, String arg) {
		List<String[]> busca = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(PATH))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] dados = linha.split(",");
				for (String valor : dados) {
					if (valor.equalsIgnoreCase(arg)) {
						busca.add(dados);
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return busca;
	}

	public static void updateCSV(String PATH, String emptyLine, String... values) throws IOException {
		try {
			List<String> lines = Files.readAllLines(Paths.get(PATH));
			int targetRow = 0;
			for (int i = 0; i < lines.size(); i++) {
				String[] columns = lines.get(i).split(",");

				if (columns.length > 1 &&
						columns[1].trim().equalsIgnoreCase(emptyLine)) {
					targetRow = i;
				}
			}
			if (targetRow < 0 || targetRow >= lines.size()) {
				throw new IllegalArgumentException("Linha inválida: " + targetRow);
			}
			String[] columns = lines.get(targetRow).split(",");
			int valueIndex = 0;
			for (int i = 0; i < columns.length && valueIndex < values.length; i++) {
				if (columns[i].trim().equals("-")) {
					columns[i] = values[valueIndex++];
				}
			}
			lines.set(targetRow, String.join(",", columns));
			Files.write(Paths.get(PATH), lines, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
