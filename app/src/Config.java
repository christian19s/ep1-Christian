import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class Config {

	public static JFrame createFrame(String title, Dimension dimension, Color bg) {
		JFrame frame = new JFrame();
		frame.setSize(dimension);
		frame.getContentPane().setBackground(bg);
		frame.setTitle(title);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return frame;
	}

	public static JButton createButton(String texto, Dimension dimension, Color bg) {
		JButton button = new JButton(texto);
		button.setFont(new Font("Default", Font.BOLD, 22));
		button.setBackground(bg);
		button.setPreferredSize(dimension);
		button.setBorder(BorderFactory.createLineBorder(Color.black));
		return button;
	}

	public static JPanel createPanel(Dimension dimension, Color bg) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(dimension);
		panel.setBackground(bg);
		panel.setLayout(new FlowLayout());

		return panel;
	}
}
