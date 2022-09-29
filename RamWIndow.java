import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class RamWIndow extends JFrame {

	private JPanel contentPane;
	Ram ram = new Ram();
	int size;
	Program program;
	RamWIndow myselfRamWindos;
	Timer timer;
	Clock clock;


	/**
	 * Create the frame.
	 */

	
	
	
	public RamWIndow(String type, int time, int size) {
		this.ram.setType(type);
		this.ram.setTime(time);
		this.ram.setTotal_space(size);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 500, 500);
		setVisible(true);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JLabel lblNewLabel_2 = new JLabel("Tiempo:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(6, 0, 61, 16);
		contentPane.add(lblNewLabel_2);
		JLabel lblNewLabel_3 = new JLabel("Ciclos:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		lblNewLabel_3.setBounds(6, 28, 61, 16);
		contentPane.add(lblNewLabel_3);
		setVisible(true);
		//myselfRamWindos = this;
		clock = new Clock();
		timer = new Timer (1000, new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				clock.work(ram.getTime());
				lblNewLabel_2.setText("Tiempo: " + "00: " + clock.getSeconds());
				lblNewLabel_3.setText("Ciclos: " + clock.getCycles());
				
			}
		});

		JMenu mnNewMenu = new JMenu("Opciones" + ram.getType());
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar Programa");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				program = new Program();
				program.setName(JOptionPane.showInputDialog("Ingrese el nombre del programa"));
				program.setName(JOptionPane.showInputDialog("Ingrese el espacio del programa (en MB)"));
				ram.getWaitlist().add(program);
				
				//AddNewProgram aNP = new AddNewProgram();
				//aNP.setLocation( (int) (myselfRamWindos.getLocation().getX() + myselfRamWindos.getSize().width), (int) (myselfRamWindos.getLocation().getY()));
			}
		});


		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Emulador " + ram.getType() + " " + size);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 23));
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Emulador de memoria Ram");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(79, 6, 298, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Comenzar simulación");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		btnNewButton.setBounds(168, 34, 117, 29);
		contentPane.add(btnNewButton);
		
		

	}

}
