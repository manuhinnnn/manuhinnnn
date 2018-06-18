package ws02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reg extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Label label_1;
	private Label label_2;
	private Button button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg frame = new reg();
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
	public reg() {
		super("Регистрация");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setBounds(159, 29, 86, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 60, 86, 20);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 90, 86, 20);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\u0417\u0430\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u043E\u0432\u0430\u0442\u044C\u0441\u044F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reg2 reg2 = new reg2();
				dispose();
				reg2.setVisible(true);
			}
		});
		btnNewButton.setBounds(91, 144, 137, 23);
		desktopPane.add(btnNewButton);
		
		Label label = new Label("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u0432\u043E\u0435 \u0438\u043C\u044F:");
		label.setAlignment(Label.RIGHT);
		label.setBounds(41, 27, 112, 22);
		desktopPane.add(label);
		
		label_1 = new Label("\u041F\u0430\u0440\u043E\u043B\u044C:");
		label_1.setAlignment(Label.RIGHT);
		label_1.setBounds(91, 60, 62, 22);
		desktopPane.add(label_1);
		
		label_2 = new Label("\u041F\u043E\u0432\u0442\u043E\u0440\u0438\u0442\u0435 \u043F\u0430\u0440\u043E\u043B\u044C:");
		label_2.setAlignment(Label.RIGHT);
		label_2.setBounds(10, 88, 143, 22);
		desktopPane.add(label_2);
		
		button = new Button("\u041D\u0430\u0437\u0430\u0434");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ws02 ws02 = new ws02();
				dispose();
				ws02.setVisible(true);
			}
		});
		button.setActionCommand("");
		button.setBounds(268, 144, 70, 22);
		desktopPane.add(button);
	}

}
