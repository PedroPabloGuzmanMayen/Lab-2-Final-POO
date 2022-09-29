import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimeSelection extends JFrame {

	private JPanel contentPane;
	String type;
	int size;
	int time;
	double GBSpace;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TimeSelection(String type, int size, double GBSpace) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.type = type;
		this.size = size;
		this.GBSpace = GBSpace;
		
		JLabel lblNewLabel = new JLabel("Seleccione el tiempo de los ciclos del reloj del programa");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 19, 438, 16);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("100 segundos");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = 10;
			}
		});
		rdbtnNewRadioButton.setBounds(25, 82, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("200 segundos");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = 200000;
			}
		});
		rdbtnNewRadioButton_1.setBounds(232, 82, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("300 segundos");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = 300000;
			}
		});
		rdbtnNewRadioButton_2.setBounds(25, 155, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("400 segundos");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = 400000;
			}
		});
		rdbtnNewRadioButton_3.setBounds(232, 155, 141, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RamWIndow rW = new RamWIndow(type, time, size, GBSpace);
			}
		});
		btnNewButton.setBounds(160, 217, 117, 29);
		contentPane.add(btnNewButton);
	}

}