import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;

public class game1 extends JFrame implements MouseListener {
	public  static game1 frame1;
	public static JLabel lblNewLabel_2;
	public static String time;
	public int x =30;
	public boolean z;
	public static JButton btn5;
	public static Timer t;
	public int[]arr2;
	public board board2;


	public static void main(String[] args) {
		//frame1=new game1();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame1 = new game1();
					frame1.setVisible(true);
					frame1.setTitle("Four in a row");
					
					
				}
				catch (Exception e) {
			
			
		
					e.printStackTrace();
				}
				
			
			}});

		
	}
	public game1(){
		this.setSize(800, 800);
		board2=new board();
		arr2=new int[7];
		arr2[0]=0;
		for(int i=1;i<arr2.length;i++)
		{
			arr2[i]=arr2[i=1]+97;
		}
		this.setVisible(true);
		
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().setBackground(new Color(51, 153, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\700428_700x527.png"));
		lblNewLabel.setBounds(0, 0, 680, 527);
		getContentPane().add(lblNewLabel);
		
		String [] firsttostart= {"player one","player two"};
		JComboBox comboBox = new JComboBox(firsttostart);
		comboBox.setBounds(714, 73, 91, 61);
		getContentPane().add(comboBox);
		
		JLabel lblChooseWhoStarts = new JLabel("choose who starts first:");
		lblChooseWhoStarts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChooseWhoStarts.setBounds(680, 27, 151, 47);
		getContentPane().add(lblChooseWhoStarts);
		
		JLabel lblNewLabel_1 = new JLabel("Timer");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(732, 222, 73, 52);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2 .setText("30");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(743, 333, 48, 40);
		getContentPane().add(lblNewLabel_2);
		//Integer p=Integer.valueOf(lblNewLabel_2 .getText());
		//String help=getTime(p);
		//lblNewLabel_2.setText(String.valueOf(p));
		
		JButton btn5=new JButton(" START TIMER");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(690, 273, 125, 30);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(btn5);
		btn5.setVisible(true);
		
		
		
		JLabel lblNewLabel_3 = new JLabel(" the turm of:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(714, 145, 91, 33);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(732, 189, 48, 14);
		getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("quit game\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(702, 401, 113, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("back to start");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(700, 462, 115, 23);
		getContentPane().add(btnNewButton_1);
		
	
		
		
		setBounds(new Rectangle(0, 0, 420, 310));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 566);
		
	
		
		ActionListener hear = new ActionListener()
		{
		public void actionPerformed(ActionEvent actionEvent) {
			if(actionEvent.getSource().equals(btnNewButton))
			{
				System.exit(0);
			}
			if(actionEvent.getSource().equals(btnNewButton_1))
			{
				game frame=new game();
				//frame1.setVisible(false);
				frame.setVisible(true);
			}
			
			if(actionEvent.getSource().equals(btn5))
			{
				Timer timer=new Timer();
				timer.schedule(new TimerTask() {

					@Override
					public void run() {
						
						
						lblNewLabel_2 .setText("30");
						
					}
					
						
					
				},30000);
				
				
				Timer t=new Timer();
				TimerTask t1=new TimerTask() {

					
					@Override
					public void run() {
						
						
						lblNewLabel_2.setText(String.valueOf(x));
						x=x-1;
						if(x==0)
							t.cancel();
						
							
						
					
				}};

				t.schedule(t1,0, 1000);
				
			
				
			
		




		}
		};;
		
				
		
		
			
		
		};
		btn5.addActionListener(hear);
		btnNewButton.addActionListener(hear);
		btnNewButton_1.addActionListener(hear);
		if(x==0)
			t.cancel();
		

	}
	@Override
	public void mouseClicked(MouseEvent e) {
	int x=e.getX();
	int y=e.getY();
	int count=0;
	for(int i=0;i<arr2.length-1;i++)
	{
		if(x>=arr2[i]&&x<arr2[i]+1)
			break;
		count++;
		
			
	}
	if(board2.arr[0][count]!=null)
	{
		board2.add(count, this.getGraphics());
		
	}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

	
	
				
		
		
	
		
	

	
	

			
			
			
		
		
				
		
		
	

		
		
		
	
		
		
		
	
		


	