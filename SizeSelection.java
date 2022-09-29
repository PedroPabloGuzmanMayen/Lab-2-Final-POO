import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class SizeSelection extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	public String type;
	public int size;
	public double GBSpace;


	/**
	 * Create the frame.
	 */
	public SizeSelection(String type) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();

		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.type = type;
		
		JLabel lblNewLabel = new JLabel("Seleccione el tamaño de la memoria Ram");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(16, 6, 417, 39);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("4GB");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = 4000;
				GBSpace = 4;
				
			}
		});
		rdbtnNewRadioButton.setBounds(6, 76, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("8GB");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size =8000; 
				GBSpace = 8;
			}
		});
		rdbtnNewRadioButton_1.setBounds(150, 76, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("16GB");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = 16000;
				GBSpace = 16;
			}
		});
		rdbtnNewRadioButton_2.setBounds(6, 169, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("12GB");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = 12000;
				GBSpace = 12;
			}
		});
		rdbtnNewRadioButton_3.setBounds(303, 76, 141, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("32GB");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = 32000;
				GBSpace = 32;
			}
		});
		rdbtnNewRadioButton_4.setBounds(150, 169, 141, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("64GB");
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = 64000;
				GBSpace = 64;
			}
		});
		rdbtnNewRadioButton_5.setBounds(303, 169, 141, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimeSelection ts = new TimeSelection(type, size, GBSpace);
				
			}
		});
		btnNewButton_1.setBounds(161, 226, 117, 29);
		contentPane.add(btnNewButton_1);

	}
}

