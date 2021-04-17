import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class gametimer extends JFrame
{
	
	
	public gametimer(){
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTimer = new JLabel("");
		lblTimer.setBounds(82, 67, 46, 14);
		contentPane.add(lblTimer);
		
		JButton btnStart = new JButton("start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Timer t=new Timer(100, new ActionListener()
						{

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
							SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
							lblTimer.setText(sdf.format(new java.util.Date()));
							}
					
						});
				t.start();
			}
		});
		btnStart.setBounds(83, 147, 89, 23);
		contentPane.add(btnStart);
	}
		public static void main(String[] args) {
			gametimer x=new gametimer();
		
		}
	
	}





