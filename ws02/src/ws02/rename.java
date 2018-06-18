package ws02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class rename extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rename frame = new rename();
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
	public rename() {
		super("Изменение личных данных");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		Label label = new Label("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043D\u043E\u0432\u043E\u0435 \u0418\u043C\u044F:");
		label.setAlignment(Label.RIGHT);
		label.setBounds(10, 66, 140, 22);
		desktopPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(162, 66, 86, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		Label label_1 = new Label("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043D\u043E\u0432\u0443\u044E \u0424\u0430\u043C\u0438\u043B\u0438\u044E:");
		label_1.setAlignment(Label.RIGHT);
		label_1.setBounds(10, 94, 140, 22);
		desktopPane.add(label_1);
		
		Label label_2 = new Label("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043D\u043E\u0432\u043E\u0435 \u041E\u0442\u0447\u0435\u0441\u0442\u0432\u043E:");
		label_2.setAlignment(Label.RIGHT);
		label_2.setBounds(10, 122, 140, 22);
		desktopPane.add(label_2);
		
		Label label_3 = new Label("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043D\u043E\u0432\u044B\u0439 \u041F\u0430\u0440\u043E\u043B\u044C:");
		label_3.setAlignment(Label.RIGHT);
		label_3.setBounds(10, 150, 140, 22);
		desktopPane.add(label_3);
		
		Label label_4 = new Label("\u041F\u043E\u0432\u0442\u043E\u0440\u0438\u0442\u0435 \u041F\u0430\u0440\u043E\u043B\u044C:");
		label_4.setAlignment(Label.RIGHT);
		label_4.setBounds(10, 178, 140, 22);
		desktopPane.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 96, 86, 20);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 122, 86, 20);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(162, 150, 86, 20);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(162, 178, 86, 20);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);
		
		Button button = new Button("\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C \u0434\u0430\u043D\u043D\u044B\u0435");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(35, 219, 115, 22);
		desktopPane.add(button);
		
		Label label_5 = new Label("\u0418\u0437\u043C\u0435\u043D\u0435\u043D\u0438\u0435 \u043B\u0438\u0447\u043D\u044B\u0445 \u0434\u0430\u043D\u043D\u044B\u0445");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(10, 10, 404, 22);
		desktopPane.add(label_5);
		
		Button button_1 = new Button("\u041D\u0430\u0437\u0430\u0434 \u0432 \u043B\u0438\u0447\u043D\u044B\u0439 \u043A\u0430\u0431\u0438\u043D\u0435\u0442");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				l4 l4 = new l4();
				dispose();
				l4.setVisible(true);
			}
		});
		button_1.setBounds(274, 219, 140, 22);
		desktopPane.add(button_1);
	}

}
