import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
	public static void main(String[] args) {
		ImageIcon logo = new ImageIcon("../assets/logo.jpg");

		JFrame frame = new JFrame("Gerenciador de Alunos");

		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(logo.getImage());
		frame.getContentPane().setBackground(new java.awt.Color(146, 142, 133));
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));

		JLabel ga = new JLabel("Gerenciador de Alunos");
		ga.setPreferredSize(new Dimension(400, 50));
		ga.setFont(new Font("Dialog", Font.BOLD, 30));

		JButton modoA = new JButton("Modo Aluno");
		modoA.setPreferredSize(new Dimension(400, 80));
		modoA.setFocusable(false);
		modoA.setBackground(Color.white);
		modoA.setBorder(BorderFactory.createLineBorder(Color.black));
		modoA.setFont(new Font("Default", Font.BOLD, 18));

		JButton modoB = new JButton("Modo Disciplina/Turma");
		modoB.setPreferredSize(new Dimension(400, 80));
		modoB.setFocusable(false);
		modoB.setBackground(Color.white);
		modoB.setBorder(BorderFactory.createLineBorder(Color.black));
		modoB.setFont(new Font("Default", Font.BOLD, 18));
		modoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// inserir ações do botão aqui

			}
		});

		JButton modoC = new JButton("Modo Avaliação");
		modoC.setPreferredSize(new Dimension(400, 80));
		modoC.setFocusable(false);
		modoC.setBackground(Color.white);
		modoC.setBorder(BorderFactory.createLineBorder(Color.black));
		modoC.setFont(new Font("Default", Font.BOLD, 18));

		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setPreferredSize(new Dimension(600, 900));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		panel.add(ga);
		panel.add(modoA);
		panel.add(modoB);
		panel.add(modoC);

		frame.add(panel);

		frame.setVisible(true);

	}
}
