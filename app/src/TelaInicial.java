import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class TelaInicial implements ActionListener {

	ImageIcon icon = new ImageIcon("../assets/logo.jpg");
	JLabel titulo = new JLabel(icon, SwingConstants.CENTER);
	JButton btn1 = Config.createButton("Modo Aluno", new Dimension(500, 80), new Color(255, 255, 255));
	JButton btn2 = Config.createButton("Modo Disciplina/Turma", new Dimension(500, 80), new Color(255, 255, 255));
	JButton btn3 = Config.createButton("Modo Avaliação", new Dimension(500, 80), new Color(255, 255, 255));
	JButton btn4 = Config.createButton("Sair", new Dimension(500, 80), new Color(255, 0, 0));

	JFrame frame = Config.createFrame("Gerenciador de Alunos", new Dimension(1200, 800), new Color(0, 58, 112));
	JPanel panel = Config.createPanel(new Dimension(800, 800), new Color(0, 132, 61));

	TelaInicial() {

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		frame.setVisible(true);
		panel.add(titulo);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4, BorderLayout.SOUTH);
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == btn1) {
			TelaDisciplinas td = new TelaDisciplinas();
			frame.dispose();
		}
		if (evt.getSource() == btn2) {
			TelaDisciplinas td = new TelaDisciplinas();
			frame.dispose();
		}
		if (evt.getSource() == btn3) {
			TelaDisciplinas td = new TelaDisciplinas();
			frame.dispose();
		}
		if (evt.getSource() == btn4) {
			frame.dispose();
		}
	}
}
