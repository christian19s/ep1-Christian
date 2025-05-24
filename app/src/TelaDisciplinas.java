import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;

public class TelaDisciplinas implements ActionListener {
	Disciplinas dp = new Disciplinas();

	JPanel title = Config.createPanel(new Dimension(800, 200), Color.white);
	JLabel titulo = new JLabel("Modo Disciplinas");

	JButton btn1 = Config.createButton("Cadastrar disciplina", new Dimension(400, 60), new Color(255, 255, 255));
	JButton btn8 = Config.createButton("Cadastrar pré-requisitos", new Dimension(400, 60), new Color(255, 255, 255));
	JButton btn2 = Config.createButton("Criar turmas", new Dimension(400, 60), Color.white);
	JButton btn3 = Config.createButton("Listar turmas disponíveis", new Dimension(400, 60), Color.white);
	JButton btn4 = Config.createButton("Listar alunos por turma", new Dimension(400, 60), Color.white);
	JButton btn5 = Config.createButton("Salvar dados", new Dimension(400, 60), Color.white);
	JButton btn6 = Config.createButton("Carregar dados", new Dimension(400, 60), Color.white);
	JButton btn7 = Config.createButton("Voltar", new Dimension(400, 60), Color.red);

	JFrame frame = Config.createFrame("Modo Disciplinas", new Dimension(1200, 800), new Color(0, 58, 112));
	JPanel panel = Config.createPanel(new Dimension(800, 800), new Color(0, 132, 61));

	public TelaDisciplinas() {
		titulo.setFont(new Font("Default", Font.BOLD, 80));

		title.add(titulo, BorderLayout.CENTER);

		btn1.addActionListener(this);
		btn8.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);

		panel.add(title, BorderLayout.CENTER);
		panel.add(btn1);
		panel.add(btn8);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == btn1) {
			JFrame newFrame = Config.createFrame("Cadastrar Disciplinas", new Dimension(1000, 800),
					new Color(0, 58, 112));
			JTextField text1 = Config.createTextField("Nome", new Dimension(200, 30));
			JTextField text2 = Config.createTextField("Código", new Dimension(200, 30));
			JTextField text3 = Config.createTextField("Carga horária", new Dimension(200, 30));

			JButton btn = Config.createButton("Submeter", new Dimension(100, 30), new Color(0, 132, 61));

			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String str1 = text1.getText();
					String str2 = text2.getText();
					String str3 = text3.getText();
					dp.addDisciplina(str1, str2, Integer.parseInt(str3));
					JOptionPane.showMessageDialog(newFrame, "Disciplina " + str1 + " adicionada.");
					newFrame.dispose();
				}
			});
			newFrame.add(text1);
			newFrame.add(text2);
			newFrame.add(text3);
			newFrame.add(btn);
			newFrame.setVisible(true);
		}
		if (evt.getSource() == btn7) {
			TelaInicial ti = new TelaInicial();
			frame.dispose();
		}
	}

}
