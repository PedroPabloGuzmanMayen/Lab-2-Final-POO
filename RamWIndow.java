
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
	int start;
	int start2;
	int size;
	int time;
	Ram ram = new Ram();
	Timer timer;
	Clock clock = new Clock();
	Program program = new Program();
	double GBSpace;
	

	/**
	 * Create the frame.
	 */
	public RamWIndow(String type, int size, int time, double GBSpace) {
		this.type = type;
		this.size = size;
		this.time = time;
		this.GBSpace = GBSpace;
		ram.setTime(time);
		ram.setType(type);
		ram.setTotal_space(size);
		ram.setGBSpace(GBSpace);
		double blocks = ram.getGBSpace()*1024/64;
		System.out.println(blocks);
		System.out.println(ram.getGBSpace());
		
		  if (ram.getType().equals("SDR")) {
			 for (double i = 0; i < blocks; i++) {
				ram.getProcess().add(0);
			}
			
		}
		
		 
		System.out.println(ram.getProcess().size());		 
		
			
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
				toWaitlist(ram, start2);
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
		
		JButton btnNewButton = new JButton("Comenzar " + Math.ceil(ram.getTotal_space() *(1024000/64000000)) );
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();
				BlocksfromArrayList(ram, start);
				
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
 	public void BlocksfromArrayList(Ram ram, int start) {
		for (int i =0; i < ram.getProcess().size() ; i++) {
			JLabel label = new JLabel();
			if(ram.getProcess().get(i) == 0) {
				label.setText("Libre");
			}
			else {
				label.setText("Ocupado");
				
			}
			label.setBounds(start+60*i, 60, 40, 40);
			getContentPane().add(label);
			
		}
		
	}
 	private void  toWaitlist(Ram ram, int start2) {
 		
 		for (int i =0; i<ram.getWaitlist().size(); i++) {
 			JLabel label2 = new JLabel();
 			label2.setText("Programa: " + ram.getWaitlist().get(i).getName() );
 			label2.setBounds(start2+240*i, start2+240*i, 40,40);
 	 		getContentPane().add(label2);
 	 		
 			
 		}
 		
 		
 	}
}
