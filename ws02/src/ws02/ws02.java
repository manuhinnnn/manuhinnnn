package ws02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ws02 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ws02 frame = new ws02();
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
	public ws02() {
		super("¬ход");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		Label label = new Label("\u0418\u043C\u044F \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F");
		label.setAlignment(Label.RIGHT);
		label.setBounds(10, 45, 118, 22);
		desktopPane.add(label);
		
		Label label_1 = new Label("\u041F\u0430\u0440\u043E\u043B\u044C:");
		label_1.setAlignment(Label.RIGHT);
		label_1.setBounds(66, 73, 62, 22);
		desktopPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(131, 47, 86, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 73, 86, 20);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u0412\u043E\u0439\u0442\u0438");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				l4 l4 = new l4();
				dispose();
				l4.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 114, 89, 23);
		desktopPane.add(btnNewButton);
		
		JButton button = new JButton("\u0412\u044B\u0445\u043E\u0434");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setBounds(131, 114, 89, 23);
		desktopPane.add(button);
		
		JButton btnNewButton_1 = new JButton("\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044F");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reg reg = new reg();
				dispose();
				reg.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 180, 118, 23);
		desktopPane.add(btnNewButton_1);
		
		Label label_2 = new Label("\u0415\u0441\u043B\u0438 \u0443 \u0412\u0430\u0441 \u043D\u0435\u0442 \u0434\u0430\u043D\u043D\u044B\u0445 \u0434\u043B\u044F \u0432\u0445\u043E\u0434\u0430, \u0442\u043E \u043F\u0440\u043E\u0439\u0434\u0438\u0442\u0435 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044E");
		label_2.setBounds(10, 152, 404, 22);
		desktopPane.add(label_2);
	}

}
