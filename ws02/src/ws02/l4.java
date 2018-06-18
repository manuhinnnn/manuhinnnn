package ws02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class l4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					l4 frame = new l4();
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
	public l4() {
		super("Личный кабинет");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		Label label = new Label("\u0418\u043C\u044F:");
		label.setAlignment(Label.RIGHT);
		label.setBounds(32, 80, 62, 22);
		desktopPane.add(label);
		
		Label label_1 = new Label("\u0424\u0430\u043C\u0438\u043B\u0438\u044F:");
		label_1.setAlignment(Label.RIGHT);
		label_1.setBounds(10, 108, 84, 22);
		desktopPane.add(label_1);
		
		Label label_2 = new Label("\u041B\u0438\u0447\u043D\u044B\u0439 \u043A\u0430\u0431\u0438\u043D\u0435\u0442");
		label_2.setFont(new Font("Dialog", Font.BOLD, 16));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(100, 10, 200, 22);
		desktopPane.add(label_2);
		
		Label label_3 = new Label("\u041E\u0442\u0447\u0435\u0441\u0442\u0432\u043E:");
		label_3.setAlignment(Label.RIGHT);
		label_3.setBounds(32, 136, 62, 22);
		desktopPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(100, 80, 144, 22);
		desktopPane.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(100, 108, 144, 22);
		desktopPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(100, 136, 144, 22);
		desktopPane.add(label_5);
		
		Button button = new Button("\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C \u0434\u0430\u043D\u043D\u044B\u0435");
		button.setBounds(42, 164, 107, 22);
		desktopPane.add(button);
		
		Button button_1 = new Button("\u0412\u044B\u0439\u0442\u0438");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ws02 ws02 = new ws02();
				dispose();
				ws02.setVisible(true);
			}
		});
		button_1.setBounds(174, 164, 70, 22);
		desktopPane.add(button_1);
	}

}
