package ws02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class okno extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					okno frame = new okno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public okno() {
		super("Отчет о выполненых действиях");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		Label label = new Label("\u0418\u0437\u043C\u0435\u043D\u0435\u043D\u0438\u0435 \u0434\u0430\u043D\u043D\u044B\u0445 \u043F\u0440\u043E\u0438\u0437\u043E\u0448\u043B\u043E \u0443\u0441\u043F\u0435\u0448\u043D\u043E!");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.PLAIN, 15));
		label.setBounds(10, 36, 404, 22);
		desktopPane.add(label);
		
		Button button = new Button("\u041E\u043A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				l4 l4 = new l4();
				dispose();
				l4.setVisible(true);
			}
		});
		button.setBounds(154, 86, 70, 22);
		desktopPane.add(button);
	}

}
