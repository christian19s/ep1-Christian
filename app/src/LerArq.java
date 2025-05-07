import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LerArq {
    public static void main(String[] args) {
        try {
            File file = new File("info/info.csv");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String dados = sc.nextLine();
                System.out.println(dados);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro.");
            e.printStackTrace();
        }
    }
}
