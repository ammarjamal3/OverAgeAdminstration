package com.ammar;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.util.Locale;
public class Main {
	JFrame frame;
	private JTextField username;
	private JTextField password;
	public Timer timer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public Main() throws SQLException {
		initialize();
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();

		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 401, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(29, 22, 124, 34);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(29, 75, 100, 34);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_6.setBounds(247, 120, 42, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		username = new JTextField();
		username.setBounds(151, 22, 187, 38);
		username.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
	    username.setBackground(Color.BLACK);
		username.setForeground(Color.WHITE);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(151, 68, 187, 41);
		password.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		password.setForeground(Color.WHITE);
		password.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setLocale(new Locale("ar", "IQ"));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_5.setBounds(222, 120, 24, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(61, 120, 167, 20);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Database status: ");
		lblNewLabel_3.setBounds(29, 229, 159, 34);
		lblNewLabel_3.setForeground(Color.WHITE);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(168, 239, 187, 15);
		lblNewLabel_4.setForeground(Color.RED);
		frame.getContentPane().add(lblNewLabel_4);
		
		 
		if(! AdminsDB.getConnection().isClosed()){
			
			lblNewLabel_4.setText("Connected");
		}else{
			lblNewLabel_4.setText("Not connected");
		}
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(29, 156, 136, 62);
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
				btnNewButton.setForeground(Color.BLACK);
	
Timer timer = new Timer(0, e -> {			
lblNewLabel_2.setText("Failed Five Time Wait");	
lblNewLabel_6.setText("Sec");

Thread th=new Thread() {
									
public void run() {
int q=0;	
int sec=15;
for(;;) {
try {
sleep(1);
} catch (InterruptedException e2) {
e2.printStackTrace();
}
if(q==1000) {
sec--;
String sec_s=Integer.toString(sec);
q=0;
lblNewLabel_5.setText(sec_s);}
else if(sec==0) {
						
	lblNewLabel_5.setText("");
break;
}
else {q++;}
}}};
th.start();
btnNewButton.setVisible(false);			
});
Timer timer2 = new Timer(17470, e -> {
lblNewLabel_2.setText("");	
lblNewLabel_6.setText("");
lblNewLabel_5.setText("");
btnNewButton.setVisible(true);
      });				
				
				
btnNewButton.addActionListener(new ActionListener() {
int y=0;
public void actionPerformed(ActionEvent arg) {
	timer.stop();
	timer2.stop();				
 if(username.getText().equals("")) {JOptionPane.showMessageDialog(frame, "User Name Empty ! , Please Enter User Name");}
 else if(password.getText().equals("")){JOptionPane.showMessageDialog(frame, "password Empty ! , Please Enter password");}
 else {	List<Admins> list=AdminsDB.getAdmins();
	 Map<String, String> map = new HashMap<String, String>();
		 
	 for(Admins a:list){
			
					 map.put(a.getUsername(), a.getPassword());
					
				 }
		 
			if (map.containsKey(username.getText())   ) {
				
		String val2=map.get(username.getText());  //value of key
				
				if( val2.equals(password.getText()) ){
					String admin=username.getText();	
					Edit cp = null;
					try {
						cp = new Edit();
						
					} catch (SQLException e1) {
			
						e1.printStackTrace();
					}
					cp.setAdmin(admin);
					cp.f.setVisible(true);
				frame.setVisible(false);
				 
			}else{
					lblNewLabel_2.setText("Failed try again");
					y=y+1;
					if(y==5) {
						y=0;
timer.start();
btnNewButton.addActionListener(e -> timer.start());
timer.setRepeats(false);
timer2.start();
btnNewButton.addActionListener(e -> timer2.start());
timer2.setRepeats(false);	
					}
			}
				
			}else{
				lblNewLabel_2.setText("Failed try again");
		
				y=y+1;
				if(y==5) {
					y=0;
timer.start();
btnNewButton.addActionListener(e -> timer.start());
timer.setRepeats(false);
timer2.start();
btnNewButton.addActionListener(e -> timer2.start());
timer2.setRepeats(false);				
				}			
			}		
			}}
	
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(189, 156, 149, 62);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_1);

	}
}

