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
import java.util.List;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import java.io.IOException;

public class TelaAlunos implements ActionListener {
	Alunos alunos = new Alunos();

	JPanel title = Config.createPanel(new Dimension(800, 200), Color.white);
	JLabel titulo = new JLabel("Modo Alunos");

	JButton btn1 = Config.createButton("Adicionar alunos", new Dimension(400, 60), new Color(255, 255, 255));
	JButton btn2 = Config.createButton("Editar alunos", new Dimension(400, 60), Color.white);
	JButton btn3 = Config.createButton("Listar alunos", new Dimension(400, 60), Color.white);
	JButton btn4 = Config.createButton("Listar alunos por turma", new Dimension(400, 60), Color.white);
	JButton btn5 = Config.createButton("Matricular alunos", new Dimension(400, 60), Color.white);
	JButton btn6 = Config.createButton("Trancar disciplinas/semestres", new Dimension(400, 60), Color.white);
	JButton btn7 = Config.createButton("Voltar", new Dimension(400, 60), Color.red);

	JFrame frame = Config.createFrame("Modo Alunos", new Color(0, 58, 112));
	JPanel panel = Config.createPanel(new Dimension(800, 800), new Color(0, 132, 61));

	public TelaAlunos() {
		titulo.setFont(new Font("Default", Font.BOLD, 80));

		title.add(titulo, BorderLayout.CENTER);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);

		panel.add(title, BorderLayout.CENTER);
		panel.add(btn1);
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
			JFrame newFrame = Config.createFrame("Cadastrar disciplinas",
					new Color(0, 58, 112));
			JTextField text1 = Config.createTextField("Nome", new Dimension(200, 30));
			JTextField text2 = Config.createTextField("Matrícula", new Dimension(200, 30));
			JTextField text3 = Config.createTextField("Curso", new Dimension(200, 30));

			JButton btn = Config.createButton("Submeter", new Dimension(150, 30), new Color(0, 132, 61));
			JButton btn2 = Config.createButton("Voltar", new Dimension(150, 30), new Color(255, 0, 0));

			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String str1 = text1.getText();
					String str2 = text2.getText();
					String str3 = text3.getText();
					alunos.addAluno(str1, str2, str3, "../info/alunos.csv");
					newFrame.dispose();
				}
			});
			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					newFrame.dispose();
				}
			});

			newFrame.add(text1);
			newFrame.add(text2);
			newFrame.add(text3);
			newFrame.add(btn);
			newFrame.add(btn2, BorderLayout.PAGE_END);
			newFrame.pack();
			newFrame.setVisible(true);
		}

		if (evt.getSource() == btn2) {
			JFrame newFrame = Config.createFrame("Editar aluno",
					new Color(0, 58, 112));
			JTextField text1 = Config.createTextField("Matrícula antiga", new Dimension(200, 30));
			JTextField text2 = Config.createTextField("Novo nome", new Dimension(200, 30));
			JTextField text3 = Config.createTextField("Nova matrícula", new Dimension(200, 30));
			JTextField text4 = Config.createTextField("Novo curso", new Dimension(200, 30));

			JButton btn = Config.createButton("Submeter", new Dimension(150, 30), new Color(0, 132, 61));
			JButton btn2 = Config.createButton("Voltar", new Dimension(150, 30), new Color(255, 0, 0));
			// Componentes

			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String str1 = text1.getText();
					String str2 = text2.getText();
					String str3 = text3.getText();
					String str4 = text4.getText();
					boolean sub = alunos.editarAluno("../info/alunos.csv", str1, str2, str3, str4);
					newFrame.dispose();
				}
			});
			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					newFrame.dispose();
				}
			});
			newFrame.add(text1);
			newFrame.add(text2);
			newFrame.add(text3);
			newFrame.add(text4);
			newFrame.add(btn);
			newFrame.add(btn2);
			newFrame.pack();
			newFrame.setVisible(true);

		}
		if (evt.getSource() == btn3) {
			JFrame newFrame = Config.createFrame("Lista de Alunos",
					new Color(0, 58, 112));

			JButton btn2 = Config.createButton("Voltar", new Dimension(150, 30), new Color(255, 0, 0));

			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					newFrame.dispose();
				}
			});

			newFrame.setVisible(true);
		}
		if (evt.getSource() == btn7) {
			TelaInicial ti = new TelaInicial();
			frame.dispose();
		}
	}

}
