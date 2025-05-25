import java.util.List;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Alunos {
	protected String nome, curso, matricula;

	public Alunos() {
		this.nome = "";
		this.curso = "";
		this.matricula = "";
	}

	public Alunos(String nome, String curso, String matricula, List<Disciplinas> disciplinas) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void addAluno(String nome, String matricula, String curso, String PATH) {
		try {
			boolean matriculaExiste = false;

			for (String[] aluno : ConfigCSV.procuraFile(PATH, matricula)) {
				if (aluno.length > 1 && aluno[1].equals(matricula)) {
					matriculaExiste = true;
					break;
				}
			}

			if (!matriculaExiste) {
				ConfigCSV.salvarFile(nome, matricula, curso, PATH);

				JOptionPane.showMessageDialog(null, "Aluno " + nome + " adicionado(a).");
			} else {
				throw new IOException("Erro: Matrícula duplicada!");
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static boolean editarAluno(String caminhoArquivo, String matriculaAntiga,
			String novoNome, String novaMatricula, String novoCurso) {
		try {
			List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo));
			boolean alunoEncontrado = false;
			for (int i = 0; i < linhas.size(); i++) {
				String[] dados = linhas.get(i).split(",");
				if (dados.length > 1 && dados[1].trim().equals(matriculaAntiga)) {
					String novaLinha = String.format("%s,%s,%s",
							novoNome,
							novaMatricula,
							novoCurso);
					if (dados.length > 3) {
						novaLinha += "," + String.join(",", Arrays.copyOfRange(dados, 3, dados.length));
					}
					linhas.set(i, novaLinha);
					alunoEncontrado = true;
					break;
				}
			}

			if (!alunoEncontrado) {
				JOptionPane.showMessageDialog(null,
						"Matrícula não encontrada: " + matriculaAntiga,
						"Erro",
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
			Files.write(Paths.get(caminhoArquivo), linhas);

			JOptionPane.showMessageDialog(null,
					"Aluno editado com sucesso!",
					"Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
			return true;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Erro ao editar aluno: " + e.getMessage(),
					"Erro",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	public List<String[]> listarTodosAlunos(String caminhoArquivo) throws IOException {
		List<String[]> alunos = new ArrayList<>();
		List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo));

		boolean temCabecalho = linhas.size() > 0 && linhas.get(0).equals("Nome,Matricula,Curso");
		int inicio = temCabecalho ? 1 : 0;

		for (int i = inicio; i < linhas.size(); i++) {
			String[] dados = linhas.get(i).split(",");
			if (dados.length >= 3) {
				alunos.add(new String[] {
						dados[0].trim(),
						dados[1].trim(),
						dados[2].trim()
				});
			}
		}
		return alunos;
	}

}
