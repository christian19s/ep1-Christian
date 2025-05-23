import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Font;

public class TelaDisciplinas implements ActionListener {
	JPanel title = Config.createPanel(new Dimension(800, 200), Color.white);
	JLabel titulo = new JLabel("Modo Disciplinas");

	JButton btn1 = Config.createButton("Cadastrar disciplina", new Dimension(400, 60), new Color(255, 255, 255));
	JButton btn2 = Config.createButton("Criar turmas", new Dimension(400, 60), Color.white);
	JButton btn3 = Config.createButton("Listar turmas disponíveis", new Dimension(400, 60), Color.white);
	JButton btn4 = Config.createButton("Listar alunos por turma", new Dimension(400, 60), Color.white);
	JButton btn5 = Config.createButton("Salvar dados", new Dimension(400, 60), Color.white);
	JButton btn6 = Config.createButton("Carregar dados", new Dimension(400, 60), Color.white);
	JButton btn7 = Config.createButton("Voltar", new Dimension(400, 80), Color.red);

	JFrame frame = Config.createFrame("Modo Disciplinas", new Dimension(1200, 800), new Color(0, 58, 112));
	JPanel panel = Config.createPanel(new Dimension(800, 800), new Color(0, 132, 61));

	public TelaDisciplinas() {
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
			JFrame newFrame = Config.createFrame("Cadastrar Disciplinas", new Dimension(1000, 800),
					new Color(0, 58, 112));
			newFrame.setVisible(true);
		}
		if (evt.getSource() == btn7) {
			TelaInicial ti = new TelaInicial();
			frame.dispose();
		}
	}

}
