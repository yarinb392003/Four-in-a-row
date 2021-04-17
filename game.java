import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Font;

public class game extends JFrame {

	private JPanel contentPane;
	public  static game frame;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame = new game();
					frame.setVisible(true);
					frame.setTitle("Four in a row");
					
				}
				catch (Exception e) {
			
			
		
					e.printStackTrace();
				}
				
			
			}});

		
		}

	/**
	 * Create the frame.
	 */
	public game() {
		setBounds(new Rectangle(0, 0, 420, 310));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 333);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("settings");
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 12));
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("how to play");
		btnNewButton_1.setFont(new Font("Sitka Small", Font.BOLD, 12));
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("about the game");
		btnNewButton_2.setFont(new Font("Sitka Small", Font.BOLD, 12));
		menuBar.add(btnNewButton_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
						ImageIcon img=new ImageIcon("four in a row bg.png");
						JLabel bg=new JLabel(" ",new ImageIcon("C:\\Users\\user\\Downloads\\output-onlinepngtools (8).png"),JLabel.CENTER);
						bg.setBackground(Color.WHITE);
						bg.setBounds(0, -8, 420, 273);
						contentPane.add(bg);
						bg.setVisible(true);
						btnNewButton_2.setFont(new Font("Sitka Small", Font.BOLD, 12));
						
						
						 
						JButton btn3=new JButton("start game");
						bg.add(btn3);
						btn3.setFont(new Font("Sitka Small", Font.BOLD, 15));
						btn3.setBounds(256, 75, 100, 50);
						btn3.setVisible(true);
						btn3.setBorder(null);
						btn3.setContentAreaFilled(false);
						btnNewButton_2.setFont(new Font("Sitka Small", Font.BOLD, 12));
						btn3.setForeground(Color.WHITE);
						
						
						JButton btn4=new JButton("start");
						btn4.setBounds(256, 35, 100, 50);
						btn4.setVisible(true);
						bg.add(btn4);
						
						
						JButton btnNewButton_4 = new JButton("quit game");
						btnNewButton_4.setFont(new Font("Sitka Small", Font.BOLD, 15));
						btnNewButton_4.setBorder(null);
						btnNewButton_4.setContentAreaFilled(false);
						btnNewButton_4.setBounds(256, 150, 100,50);
						bg.add(btnNewButton_4);
						btnNewButton_4.setForeground(Color.WHITE);
						ActionListener hear = new ActionListener()
						{
						public void actionPerformed(ActionEvent actionEvent) {
							
							if(actionEvent.getSource().equals(btnNewButton_4))
							{
								
								System.exit(0);
							}
					//		if(actionEvent.getSource().equals(btn3))
							{
								game1 frame1=new game1();
								frame1.setVisible(true);
								
								
							}
							if(actionEvent.getSource().equals(btn4))
							{
								
								game1 frame1=new game1();
								frame1.setVisible(true);
							}


						




						}
						};;


						btnNewButton_4.addActionListener(hear);
						//btn3.addActionListener(hear);
						btn4.addActionListener(hear);
						
						
						
		}
		}




