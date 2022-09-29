
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RamWIndow extends JFrame {

	private JPanel contentPane;

	String type;
	int size;
	int time;
	Ram ram = new Ram();
	Timer timer;
	Clock clock = new Clock();
	Program program = new Program();

	/**
	 * Create the frame.
	 */
	public RamWIndow(String type, int size, int time) {
		this.type = type;
		this.size = size;
		this.time = time;
		ram.setTime(time);
		ram.setType(type);
		ram.setTotal_space(size);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar programa");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Program program = new Program();
				String space;
				program.setName(JOptionPane.showInputDialog("Ingrse el nombre del programa")); 
				space = JOptionPane.showInputDialog("Ingrse el espacio del programa (en MB)");
				int space2 = Integer.parseInt(space);
				program.setSpace(space2);
				ram.getWaitlist().add(program);
			}
		});
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Emulador memoria RAM" + ram.getTime());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(6, 6, 438, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Comenzar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();
				
			}
		});
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
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(194, 119, 61, 16);
		contentPane.add(lblNewLabel_3);
		timer = new Timer (1000, new ActionListener ()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	clock.work(ram.getTotal_space());
		    	lblNewLabel_1.setText("Tiempo: " +"00: " + clock.getSeconds()); 
		    	lblNewLabel_2.setText("Ciclos: " + clock.getCycles()); 
		    }
		});
	}
}
