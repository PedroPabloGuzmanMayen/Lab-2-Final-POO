import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel welcomeLabel = new JLabel("Simulador de Memoria RAM");
		welcomeLabel.setBackground(Color.PINK);
		welcomeLabel.setFont(new Font("Futura", Font.PLAIN, 29));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setForeground(Color.BLACK);
		welcomeLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(welcomeLabel, BorderLayout.NORTH);
		
		JButton startButton = new JButton("Comenzar");
		startButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		startButton.setBackground(new Color (204,204,204));
		startButton.setForeground(Color.BLUE);
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TypeSelection rW = new TypeSelection ();
			}
		});
		contentPane.add(startButton, BorderLayout.CENTER);
	}

}

