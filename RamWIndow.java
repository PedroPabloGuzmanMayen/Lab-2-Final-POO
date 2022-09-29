
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Button;
import javax.swing.JButton;

public class RamWIndow extends JFrame {

	private JPanel contentPane;

	String type;
	int size;
	int time;
	Ram ram = new Ram();

	/**
	 * Create the frame.
	 */
	public RamWIndow(String type, int size, int time) {
		this.type = type;
		this.size = size;
		this.time = time;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar programa");
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Emulador memoria RAM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(6, 6, 438, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Comenzar");
		btnNewButton.setBounds(163, 43, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Tiempo: 00: ");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		lblNewLabel_1.setBounds(6, 13, 80, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ciclos: ");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		lblNewLabel_2.setBounds(6, 40, 61, 16);
		contentPane.add(lblNewLabel_2);
	}
}
