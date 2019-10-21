package com.ammar;


import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.IntegerValidator;
import org.apache.commons.validator.routines.LongValidator;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import javax.swing.JTextArea;

public class Edit {

	private JPanel contentPane;
	private JTextField fname1;
	private JTextField lname1;
	private JTextField salary1;
	private JTextField age1;
	private JTextField department1;
	private JTextField address1;
	private JTextField gender1;
	private JTextField education1;
	private JTextField experience1;
	private JTextField mother_language1;
	private JTextField other_language1;
	private JTextField nationality1;
	private JTextField idEmployee1;
	private JTextField fname11;
	private JTextField lname11;
	private JTextField salary11;
	private JTextField age11;
	private JTextField department11;
	private JTextField address11;
	private JTextField gender11;
	private JTextField contract_end11;
	private JTextField contract_start11;
	private JTextField date_of_birth11;
	private JTextField other_language11;
	private JTextField mother_language11;
	private JTextField nationality11;
	private JTextField experience11;
	private JTextField education11;
JFrame f=new JFrame();
private JTextField email1;
private JTextField phone1;
private JTextField email11;
private JTextField phone11;
private String admin;	
private JPanel panel_3;
private JTextField M_fn;
private JTextField M_ln;
private JTextField M_age;
private JTextField M_dep;
private JTextField M_gen;
private JTextField M_edu;
private JTextField M_exp;
private JTextField M_ml;
private JTextField M_ol;
private JTextField M_nat;
private JTextField M_fame;
private JTextField M_famp;
private JTextField M_od;
private JTextField M_cd;
private JTextField M_sn;
private JTextField fname;
private JTextField lname;
private JTextField age_text;
private JTextField department;
private JTextField gender;
private JTextField education;
private JTextField experience;
private JTextField mother_language;
private JTextField other_language;
private JTextField nationality;
private JTextField family_email;
private JTextField family_pho;
private JTextField other_diseases;
private JTextField chronic_diseases;
private JTextField special_needs;
private JTextField id_member;
private JTextField date_of_birth;
private JTextField date_of_join;
private JLabel label_2;



public Edit(String admin) {
	super();
	this.admin = admin;
}

public String getAdmin() {
	return admin;
}

public void setAdmin(String admin) {
	this.admin = admin;
}

/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit fr = new Edit();
					fr.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Edit() throws SQLException {

		f.setBackground(Color.WHITE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(0,0, 1500, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 51));
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		f.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 39, 1200, 700);
		tabbedPane.setBackground(Color.WHITE);
		contentPane.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Employees", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 1195, 684);
		panel_6.add(tabbedPane_1);

		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		tabbedPane_1.addTab("View Employees", null, panel_3, null);
			
		
		   display(panel_3);
		
		
		
	UtilDateModel dModel = new UtilDateModel();
	JDatePanelImpl datePanel = new JDatePanelImpl(dModel);
		
		
		UtilDateModel dModel2 = new UtilDateModel();
		JDatePanelImpl datePanel2 = new JDatePanelImpl(dModel2);
		
		
		UtilDateModel dModel3 = new UtilDateModel();
		JDatePanelImpl datePanel3 = new JDatePanelImpl(dModel3);
		
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(SystemColor.menu);
				tabbedPane_1.addTab("Insert Employee", null, panel_1, null);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel_2 = new JLabel("First Name");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_2.setBounds(36, 28, 92, 15);
				panel_1.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("Last Name");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_3.setBounds(36, 81, 92, 15);
				panel_1.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("Salary");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_4.setBounds(36, 130, 70, 15);
				panel_1.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("Age");
				lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_5.setBounds(36, 182, 70, 15);
				panel_1.add(lblNewLabel_5);
				
				JLabel lblNewLabel_6 = new JLabel("Department");
				lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_6.setBounds(36, 227, 92, 15);
				panel_1.add(lblNewLabel_6);
				
				JLabel lblNewLabel_7 = new JLabel("Address");
				lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_7.setBounds(36, 279, 70, 15);
				panel_1.add(lblNewLabel_7);
				
				JLabel lblNewLabel_8 = new JLabel("Date of Birthday");
				lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_8.setBounds(36, 331, 107, 25);
				panel_1.add(lblNewLabel_8);
				
				JLabel lblNewLabel_9 = new JLabel("Gender");
				lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_9.setBounds(36, 397, 70, 15);
				panel_1.add(lblNewLabel_9);
				
				fname1 = new JTextField();
				fname1.setBounds(146, 26, 172, 19);
				panel_1.add(fname1);
				fname1.setColumns(10);
				
				lname1 = new JTextField();
				lname1.setBounds(146, 79, 172, 19);
				panel_1.add(lname1);
				lname1.setColumns(10);
				
				salary1 = new JTextField();
				salary1.setBounds(146, 128, 172, 19);
				panel_1.add(salary1);
				salary1.setColumns(10);
				
				age1 = new JTextField();
				age1.setBounds(146, 180, 172, 19);
				panel_1.add(age1);
				age1.setColumns(10);
				
				department1 = new JTextField();
				department1.setBounds(146, 225, 172, 19);
				panel_1.add(department1);
				department1.setColumns(10);
				
				address1 = new JTextField();
				address1.setBounds(146, 277, 172, 19);
				panel_1.add(address1);
				address1.setColumns(10);
				
				JLabel lblNewLabel_10 = new JLabel("Education");
				lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_10.setBounds(36, 443, 92, 15);
				panel_1.add(lblNewLabel_10);
				
				JLabel lblNewLabel_11 = new JLabel("Experience");
				lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_11.setBounds(36, 500, 92, 15);
				panel_1.add(lblNewLabel_11);
				
				JLabel lblNewLabel_12 = new JLabel("Contract_Start");
				lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_12.setBounds(349, 22, 107, 26);
				panel_1.add(lblNewLabel_12);
				
				JLabel lblNewLabel_13 = new JLabel("Contract_End");
				lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_13.setBounds(349, 73, 107, 24);
				panel_1.add(lblNewLabel_13);
				
				JLabel lblNewLabel_14 = new JLabel("Nationality");
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_14.setBounds(349, 130, 100, 15);
				panel_1.add(lblNewLabel_14);
				
				JLabel lblNewLabel_15 = new JLabel("Mother_Language");
				lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_15.setBounds(349, 184, 140, 15);
				panel_1.add(lblNewLabel_15);
				
				JLabel lblNewLabel_16 = new JLabel("Other_Language");
				lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_16.setBounds(349, 227, 124, 15);
				panel_1.add(lblNewLabel_16);
				
				gender1 = new JTextField();
				gender1.setBounds(146, 395, 172, 19);
				panel_1.add(gender1);
				gender1.setColumns(10);
				
				education1 = new JTextField();
				education1.setBounds(146, 441, 172, 19);
				panel_1.add(education1);
				education1.setColumns(10);
				
				experience1 = new JTextField();
				experience1.setBounds(146, 498, 172, 19);
				panel_1.add(experience1);
				experience1.setColumns(10);
				
				mother_language1 = new JTextField();
				mother_language1.setBounds(497, 182, 172, 19);
				panel_1.add(mother_language1);
				mother_language1.setColumns(10);
				
				other_language1 = new JTextField();
				other_language1.setBounds(497, 225, 172, 19);
				panel_1.add(other_language1);
				other_language1.setColumns(10);
				
				nationality1 = new JTextField();
				nationality1.setBounds(497, 128, 172, 19);
				panel_1.add(nationality1);
				nationality1.setColumns(10);
				
				JLabel lblEmail = new JLabel("E-Mail");
				lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblEmail.setBounds(349, 277, 107, 19);
				panel_1.add(lblEmail);
				
				email1 = new JTextField();
				email1.setBounds(497, 277, 172, 20);
				panel_1.add(email1);
				email1.setColumns(10);
				
				JLabel lblPhone = new JLabel("Phone");
				lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPhone.setBounds(349, 329, 100, 27);
				panel_1.add(lblPhone);
				
				phone1 = new JTextField();
				phone1.setBounds(497, 329, 172, 21);
				panel_1.add(phone1);
				phone1.setColumns(10);
				JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
				datePicker.setBounds(146, 331, 172, 26);
				
		panel_1.add(datePicker);
		JDatePickerImpl datePicker2 = new JDatePickerImpl(datePanel2);
		datePicker2.setForeground(Color.RED);
		datePicker2.setBackground(Color.WHITE);
		datePicker2.setBounds(497, 22, 172, 26);
		
		panel_1.add(datePicker2);
		JDatePickerImpl datePicker3 = new JDatePickerImpl(datePanel3);
		SpringLayout springLayout = (SpringLayout) datePicker3.getLayout();
		springLayout.putConstraint(SpringLayout.WEST, datePicker3.getJFormattedTextField(), 0, SpringLayout.WEST, datePicker3);
		datePicker3.setBounds(497, 73, 172, 26);
		
		panel_1.add(datePicker3);
		
		
		
JLabel photo = new JLabel(new ImageIcon(Edit.class.getResource("/img/Add-Male-User.png")));
photo.setBounds(851, 11, 270, 317);
panel_1.add(photo);

JPanel panel_7 = new JPanel();
tabbedPane.addTab("Members", null, panel_7, null);
panel_7.setLayout(null);
JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
tabbedPane_2.setBounds(0, 0, 1195, 672);
panel_7.add(tabbedPane_2);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		LongValidator lo=LongValidator.getInstance();
		EmailValidator em=EmailValidator.getInstance();
		IntegerValidator in = IntegerValidator.getInstance();
		boolean bemail=em.isValid(email11.getText());
		boolean bage=in.isValid(age11.getText());
		boolean lphone=lo.isValid(phone11.getText());
		Pattern p = Pattern.compile("[0-9]*\\.?[0-9]+");
		Matcher m = p.matcher(salary11.getText());


		if (bemail==false) {
		JOptionPane.showMessageDialog(f, "Plese Enter Correct E-mail !");}
		else if (m.matches()==false)
	    {JOptionPane.showMessageDialog(f, "Plese Enter Correct Salary !");}
		else if (bage==false) {
		JOptionPane.showMessageDialog(f, "Plese Enter Correct age !");}
		else if (lphone==false) {
		JOptionPane.showMessageDialog(f, "Plese Enter Correct Phone Number !");}
		else {			
Date date_of_birth = (Date) datePicker.getModel().getValue();
Date contract_start = (Date) datePicker2.getModel().getValue();
Date contract_end = (Date) datePicker3.getModel().getValue();
			
			String firstName         = 	    fname1.getText();
			String lastName          = 		lname1.getText();
			String textSalary        = 		salary1.getText();
			String textAge           = 		age1.getText();
			String textDepatment     = 		department1.getText();
			String textAddress       = 		address1.getText();
		 	String textGender        = 		gender1.getText();
			String textEducation     = 		education1.getText();
			String textExperience    = 		experience1.getText(); 
			String textNationality   = 		nationality1.getText();
			String motherLanguage    = 		mother_language1.getText();
			String otherLanguage     = 		other_language1.getText();
			String dateOfBirth       =        date_of_birth.toString() ;
			String textContractstart =      contract_start.toString() ;
			String textContractend   =      contract_end.toString() ;
			String email             =       email1.getText();
			String sphone             =       phone1.getText(); 
			String admin2            =        getAdmin();
			
			
			float fSalary = Float.parseFloat(textSalary);
			int iAge = Integer.parseInt(textAge);
			Long phone=Long.parseLong(sphone);

			Employee emp = new Employee();  
			
			emp.setFname(firstName);
			emp.setLname(lastName);
			emp.setSalary(fSalary);
			emp.setAge(iAge);
			emp.setDepartment(textDepatment);
			emp.setAddress(textAddress);
			emp.setDate_of_birth(dateOfBirth);
			emp.setGender(textGender);
			emp.setEducation(textEducation);
			emp.setExperience(textExperience);
			emp.setContract_start(textContractstart);
			emp.setContract_end(textContractend);
			emp.setNationality(textNationality);
			emp.setMother_language(motherLanguage);
			emp.setOther_language(otherLanguage);
			emp.setemail(email);
			emp.setphone(phone);
			emp.setAdmin(admin2);
			 try {
				int status=  DBInfo.save(emp);

				  if(status>0){  	  
  JOptionPane.showMessageDialog(panel_1, " Record saved successfully! ");
					  
//	          System.out.println(" Record saved successfully! ");  
				       
				}else{  
JOptionPane.showMessageDialog(panel_1, "Sorry! unable to save record","warning",
							  JOptionPane.ERROR_MESSAGE);
					  
				//	  System.out.println("Sorry! unable to save record");  
				  }
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  	
panel_3.removeAll();
display(panel_3);

			 
			 
			 
			 
			 
			}}

			
		});
		btnNewButton.setBounds(848, 370, 117, 42);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 0, 51));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fname1.setText("");
				lname1.setText("");
				salary1.setText("");
				age1.setText("");
				department1.setText("");
				address1.setText("");
		 		gender1.setText("");
				education1.setText("");
				experience1.setText("");
		 		nationality1.setText("");
				mother_language1.setText("");
				other_language1.setText("");
				email1.setText("");
				phone1.setText("");
				
				
				
			}
		});
		btnNewButton_1.setBounds(1056, 370, 117, 42);
		panel_1.add(btnNewButton_1);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.menu);
		tabbedPane_1.addTab("Update Employee / Delete", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("Enter ID");
		lblNewLabel_17.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_17.setBounds(12, 28, 81, 27);
		panel_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Firstname");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_18.setBounds(12, 92, 97, 15);
		panel_2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Last name");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_19.setBounds(12, 142, 97, 15);
		panel_2.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Salary");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_20.setBounds(12, 190, 70, 15);
		panel_2.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Age");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_21.setBounds(12, 246, 70, 15);
		panel_2.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("department");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_22.setBounds(12, 297, 97, 15);
		panel_2.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Address");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_23.setBounds(12, 345, 70, 15);
		panel_2.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("gender");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_24.setBounds(12, 400, 70, 15);
		panel_2.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("education");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_25.setBounds(12, 449, 103, 15);
		panel_2.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("experience");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_26.setBounds(12, 498, 103, 15);
		panel_2.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("nationality");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_27.setBounds(321, 94, 103, 15);
		panel_2.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("mother language");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_28.setBounds(321, 140, 122, 15);
		panel_2.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("other language");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_29.setBounds(321, 192, 122, 15);
		panel_2.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("date_of_birth");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_30.setBounds(321, 247, 103, 15);
		panel_2.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("contract start");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_31.setBounds(321, 298, 103, 15);
		panel_2.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("contract end");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_32.setBounds(321, 347, 103, 15);
		panel_2.add(lblNewLabel_32);
		
		idEmployee1 = new JTextField();
		idEmployee1.setBounds(119, 28, 93, 27);
		panel_2.add(idEmployee1);
		idEmployee1.setColumns(10);
		
		fname11 = new JTextField();
		fname11.setBounds(119, 90, 170, 19);
		panel_2.add(fname11);
		fname11.setColumns(10);
		
		lname11 = new JTextField();
		lname11.setBounds(119, 140, 170, 19);
		panel_2.add(lname11);
		lname11.setColumns(10);
		
		salary11 = new JTextField();
		salary11.setBounds(119, 188, 170, 19);
		panel_2.add(salary11);
		salary11.setColumns(10);
		
		age11 = new JTextField();
		age11.setBounds(119, 244, 170, 19);
		panel_2.add(age11);
		age11.setColumns(10);
		
		department11 = new JTextField();
		department11.setBounds(119, 295, 170, 19);
		panel_2.add(department11);
		department11.setColumns(10);
		
		address11 = new JTextField();
		address11.setBounds(119, 345, 170, 19);
		panel_2.add(address11);
		address11.setColumns(10);
		
		gender11 = new JTextField();
		gender11.setBounds(119, 398, 170, 19);
		panel_2.add(gender11);
		gender11.setColumns(10);
		
		contract_end11 = new JTextField();
		contract_end11.setBounds(471, 345, 170, 19);
		panel_2.add(contract_end11);
		contract_end11.setColumns(10);
		
		contract_start11 = new JTextField();
		contract_start11.setBounds(471, 296, 170, 19);
		panel_2.add(contract_start11);
		contract_start11.setColumns(10);
		
		date_of_birth11 = new JTextField();
		date_of_birth11.setBounds(471, 245, 170, 19);
		panel_2.add(date_of_birth11);
		date_of_birth11.setColumns(10);
		
		other_language11 = new JTextField();
		other_language11.setBounds(471, 190, 170, 19);
		panel_2.add(other_language11);
		other_language11.setColumns(10);
		
		mother_language11 = new JTextField();
		mother_language11.setBounds(471, 138, 170, 19);
		panel_2.add(mother_language11);
		mother_language11.setColumns(10);
		
		nationality11 = new JTextField();
		nationality11.setBounds(471, 92, 170, 19);
		panel_2.add(nationality11);
		nationality11.setColumns(10);
		
		experience11 = new JTextField();
		experience11.setBounds(119, 496, 170, 19);
		panel_2.add(experience11);
		experience11.setColumns(10);
		
		education11 = new JTextField();
		education11.setBounds(119, 447, 170, 19);
		panel_2.add(education11);
		education11.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Find");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(0, 0, 128));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(idEmployee1.getText().equals(""))	
			{JOptionPane.showMessageDialog(panel_2, "Please Enter Id Value");}

			else {	
				String sid=idEmployee1.getText();  
			    int id=Integer.parseInt(sid);   
				
			    Employee emp=DBInfo.getEmployeeId(id); 
		 
			    
			    fname11.setText(emp.getFname());
			    lname11.setText(emp.getLname());
			    salary11.setText(String.valueOf(emp.getSalary()));
			    age11.setText(String.valueOf(emp.getAge()));
			    department11.setText( emp.getDepartment());
			    address11.setText( emp.getAddress());
			    nationality11.setText( emp.getNationality());
			    gender11.setText(emp.getGender());
			    education11.setText( emp.getEducation());
			    experience11.setText( emp.getExperience());
			    mother_language11.setText( emp.getMother_language());
			    other_language11.setText(emp.getOther_language());
			    date_of_birth11.setText(emp.getDate_of_birth());
			    contract_start11.setText(emp.getContract_start());
			    contract_end11.setText(emp.getContract_end()); 
			    email11.setText(emp.getemail());
			    phone11.setText(String.valueOf(emp.getphone()));
			}}
		});
		btnNewButton_2.setBounds(243, 21, 97, 41);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update Employee");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBackground(new Color(0, 0, 51));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    LongValidator lo=LongValidator.getInstance();
				EmailValidator em=EmailValidator.getInstance();
				IntegerValidator in = IntegerValidator.getInstance();
				boolean bemail=em.isValid(email11.getText());
				boolean bage=in.isValid(age11.getText());
				boolean lphone=lo.isValid(phone11.getText());
				Pattern p = Pattern.compile("[0-9]*\\.?[0-9]+");
				Matcher m = p.matcher(salary11.getText());
				boolean bid=in.isValid(idEmployee1.getText());

				if (bid==false) {
				JOptionPane.showMessageDialog(f, "Plese Enter Correct id !");}
				else if (bemail==false) {
				JOptionPane.showMessageDialog(f, "Plese Enter Correct E-mail !");}
				else if (m.matches()==false)
				{JOptionPane.showMessageDialog(f, "Plese Enter Correct Salary !");}
				else if (bage==false) {
				JOptionPane.showMessageDialog(f, "Plese Enter Correct age !");}
				else if (lphone==false) {
				JOptionPane.showMessageDialog(f, "Plese Enter Correct Phone Number !");}
				else {			
				String sid=idEmployee1.getText();  
			    int id=Integer.parseInt(sid);  
			    
		    String textfName        =     fname11.getText();
		    String textlName        =     lname11.getText();
	   float textsalary        =     Float.parseFloat(salary11.getText());
    int textage             =     Integer.parseInt(age11.getText());
		    String textdepart       =     department11.getText();
		    String textaddress      =     address11.getText();
	   String textnation       =     nationality11.getText();
		    String textgender       =     gender11.getText();
			   String texteducation    =     education11.getText();
			  String textexperience   =     experience11.getText();
			   String textmother      =     mother_language11.getText();
			   String textother      =     other_language11.getText();
			    String textbirth      =     date_of_birth11.getText();
			    String textstart      =     contract_start11.getText();
			    String textend      =     contract_end11.getText();
			    String email        =     email11.getText();
			    Long phone       =     Long.parseLong(phone11.getText());
			    String admin22            =        getAdmin();
			    
			    Employee emp=new Employee();  
			    
		        emp.setId(id);
				emp.setFname(textfName);
				emp.setLname(textlName);
				emp.setSalary(textsalary);
				emp.setAge(textage);
				emp.setDepartment(textdepart);
				emp.setAddress(textaddress);
				emp.setDate_of_birth(textbirth);
				emp.setGender(textgender);
				emp.setEducation(texteducation);
				emp.setExperience(textexperience);
				emp.setContract_start(textstart);
				emp.setContract_end(textend);
				emp.setNationality(textnation);
				emp.setMother_language(textmother);
				emp.setOther_language(textother); 
			    emp.setemail(email);
			    emp.setphone(phone);
			    emp.setModify_By(admin22);
			    
			    int status=DBInfo.update(emp);  
		        if(status>0){  
	 
JOptionPane.showMessageDialog(panel_2, "Record update successfully!" );
		        	

		        }else{ 
		        		
JOptionPane.showMessageDialog(panel_2, "Sorry! unable to update record","warning",
			    			  JOptionPane.ERROR_MESSAGE);
		        	
  
		        }  
	
		        panel_3.removeAll();
				
				   display(panel_3);
  
			}}
		});
		btnNewButton_3.setBounds(950, 63, 181, 36);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete Employee");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(0, 0, 51));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
IntegerValidator in= IntegerValidator.getInstance();	
boolean bid=in.isValid(idEmployee1.getText());

if (bid==false) {
JOptionPane.showMessageDialog(f, "Plese Enter Correct id !");}
{

                String sid=idEmployee1.getText();  
			    int id=Integer.parseInt(sid);   
			     
			     int status=  DBInfo.delete(id) ;
			     if(status>0){  
JOptionPane.showMessageDialog(panel_2, "Record delete successfully!" );
		        	
		     //   	 System.out.println(" Record update successfully! ");
		        }
 else{ 
		        	
	 	
JOptionPane.showMessageDialog(panel_2, "Sorry! unable to delete record","warning",
			    			  JOptionPane.ERROR_MESSAGE);
		     	
		      //  	System.out.println("Sorry! unable to update record");  
		        }  
	     
			     panel_3.removeAll();
				  display(panel_3);				
			}}
		});
		btnNewButton_4.setBounds(950, 388, 181, 36);
		panel_2.add(btnNewButton_4);
		
		JLabel photo1 = new JLabel(new ImageIcon(Edit.class.getResource("/img/employees.png")));
		photo1.setBounds(950, 160, 213, 200);
		panel_2.add(photo1);
		
		JLabel label = new JLabel("E-Mail");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(321, 398, 107, 19);
		panel_2.add(label);
		
		email11 = new JTextField();
		email11.setColumns(10);
		email11.setBounds(471, 398, 170, 20);
		panel_2.add(email11);
		
		JLabel label_1 = new JLabel("Phone");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(321, 443, 100, 27);
		panel_2.add(label_1);
		
		phone11 = new JTextField();
		phone11.setColumns(10);
		phone11.setBounds(471, 447, 170, 21);
		panel_2.add(phone11);
////////////////////////////////////////////
////////////////////////////////////////////
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		tabbedPane_2.addTab("View Members", null, panel, null);
		display_mem(panel);
		
////////////////////////////////////////////
////////////////////////////////////////////
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.menu);
		tabbedPane_2.addTab("Insert Member", null, panel_4, null);
		

		UtilDateModel dModel5 = new UtilDateModel();
		JDatePanelImpl datePanel5 = new JDatePanelImpl(dModel5);
		panel_4.setLayout(null);
			
		JDatePickerImpl datePicker5 = new JDatePickerImpl(datePanel5);
		datePicker5.setBounds(146, 235, 175, 26);
		
        panel_4.add(datePicker5);
        
        UtilDateModel dModel6 = new UtilDateModel();
		JDatePanelImpl datePanel6 = new JDatePanelImpl(dModel6);
		
        JDatePickerImpl datePicker6 = new JDatePickerImpl(datePanel6);
        datePicker6.setBounds(146, 290, 175, 26);
        datePicker6.setForeground(Color.RED);
        datePicker6.setBackground(Color.WHITE);
        
                panel_4.add(datePicker6);
		
		label_2 = new JLabel("First Name");
		label_2.setBounds(27, 39, 92, 15);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_2);
		
		JLabel label_3 = new JLabel("Last Name");
		label_3.setBounds(27, 92, 92, 15);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel("Age");
		label_4.setBounds(27, 145, 70, 15);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("Department");
		label_5.setBounds(27, 190, 92, 15);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_5);
		
		JLabel label_7 = new JLabel("Date of Birthday");
		label_7.setBounds(27, 235, 107, 26);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel("Gender");
		label_8.setBounds(27, 352, 70, 15);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel("Date of Join");
		label_9.setBounds(27, 290, 107, 26);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_9);
		
		JLabel label_10 = new JLabel("Experience");
		label_10.setBounds(27, 469, 119, 15);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_10);
		
		JLabel label_11 = new JLabel("Education");
		label_11.setBounds(27, 409, 92, 21);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_11);
		
		M_fn = new JTextField();
		M_fn.setBounds(146, 35, 175, 19);
		M_fn.setColumns(10);
		panel_4.add(M_fn);
		
		M_ln = new JTextField();
		M_ln.setBounds(146, 88, 175, 19);
		M_ln.setColumns(10);
		panel_4.add(M_ln);
		
		M_age = new JTextField();
		M_age.setBounds(146, 141, 175, 19);
		M_age.setColumns(10);
		panel_4.add(M_age);
		
		M_dep = new JTextField();
		M_dep.setBounds(146, 186, 175, 19);
		M_dep.setColumns(10);
		panel_4.add(M_dep);
		
		M_gen = new JTextField();
		M_gen.setBounds(146, 348, 175, 19);
		M_gen.setColumns(10);
		panel_4.add(M_gen);
		
		M_edu = new JTextField();
		M_edu.setBounds(146, 409, 175, 21);
		M_edu.setColumns(10);
		panel_4.add(M_edu);
		
		M_exp = new JTextField();
		M_exp.setBounds(146, 465, 175, 19);
		M_exp.setColumns(10);
		panel_4.add(M_exp);
		
		JLabel label_12 = new JLabel("Nationality");
		label_12.setBounds(27, 519, 92, 15);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_12);
		
		JLabel label_13 = new JLabel("Other_Language");
		label_13.setBounds(382, 89, 118, 15);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_13);
		
		JLabel lblEmail_1 = new JLabel("E-Mail");
		lblEmail_1.setBounds(382, 134, 118, 19);
		lblEmail_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblEmail_1);
		
		JLabel label_16 = new JLabel("Mother_Language");
		label_16.setBounds(382, 37, 118, 15);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_16);
		
		M_ml = new JTextField();
		M_ml.setBounds(510, 35, 172, 19);
		M_ml.setColumns(10);
		panel_4.add(M_ml);
		
		M_ol = new JTextField();
		M_ol.setBounds(510, 87, 172, 19);
		M_ol.setColumns(10);
		panel_4.add(M_ol);
		
		M_nat = new JTextField();
		M_nat.setBounds(146, 517, 175, 19);
		M_nat.setColumns(10);
		panel_4.add(M_nat);
		
		M_fame = new JTextField();
		M_fame.setBounds(510, 134, 172, 20);
		M_fame.setColumns(10);
		panel_4.add(M_fame);
		
		JLabel lblPhone_1 = new JLabel("Phone");
		lblPhone_1.setBounds(382, 188, 118, 15);
		lblPhone_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblPhone_1);
		
		M_famp = new JTextField();
		M_famp.setBounds(510, 186, 172, 21);
		M_famp.setColumns(10);
		panel_4.add(M_famp);
		
		JLabel label_19 = new JLabel("chronic diseases");
		label_19.setBounds(382, 235, 107, 27);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_19);
		
		JLabel label_20 = new JLabel("Other diseases");
		label_20.setBounds(382, 296, 107, 21);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_20);
		
		M_od = new JTextField();
		M_od.setBounds(510, 296, 172, 21);
		M_od.setColumns(10);
		panel_4.add(M_od);
		
		M_cd = new JTextField();
		M_cd.setBounds(510, 239, 172, 21);
		M_cd.setColumns(10);
		panel_4.add(M_cd);
		
		JLabel label_21 = new JLabel("Special Needs");
		label_21.setBounds(382, 352, 107, 23);
		label_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(label_21);
		
		M_sn = new JTextField();
		M_sn.setBounds(510, 352, 172, 21);
		M_sn.setColumns(10);
		panel_4.add(M_sn);
		
		JButton button = new JButton("Reset");
		button.setBounds(1078, 370, 117, 42);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
M_fn.setText("");
M_ln.setText("");
M_age.setText("");
M_dep.setText("");
M_gen.setText("");
M_edu.setText("");
M_exp.setText(""); 
M_nat.setText("");
M_ml.setText("");
M_ol.setText("");
M_fame.setText("");
M_famp.setText(""); 
M_cd.setText("");
M_od.setText("");
M_sn.setText("");			
				
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(0, 0, 51));
		panel_4.add(button);
		
		JButton button_1 = new JButton("Insert");
		button_1.setBounds(941, 370, 117, 42);
		button_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

	    LongValidator lo=LongValidator.getInstance();
		EmailValidator em=EmailValidator.getInstance();
		IntegerValidator in = IntegerValidator.getInstance();
		boolean bemail=em.isValid(M_fame.getText());
		boolean bage=in.isValid(M_age.getText());
		boolean lphone=lo.isValid(M_famp.getText());
		

		if (bemail==false &&! M_fame.getText().equals("N/A")) {
		JOptionPane.showMessageDialog(f, "Plese Enter Correct Family-E-mail !");}
		else if (bage==false) {
		JOptionPane.showMessageDialog(f, "Plese Enter Correct age !");}
		else if (lphone==false &&! M_famp.getText().equals("0")) {
		JOptionPane.showMessageDialog(f, "Plese Enter Correct Family-Phone Number !");}
		
		else {				
	
	
	
	
	
	
Date date_of_birth = (Date) datePicker5.getModel().getValue();
Date date_of_join  = (Date) datePicker6.getModel().getValue();

							
String firstName         = 	    M_fn.getText();
String lastName          = 		M_ln.getText();
String age               = 	    M_age.getText();
String Depatment         = 		M_dep.getText();
String Gender            = 		M_gen.getText();
String Education         = 		M_edu.getText();
String Experience        = 		M_exp.getText(); 
String Nationality       = 		M_nat.getText();
String motherLanguage    = 		M_ml.getText();
String otherLanguage     = 		M_ol.getText();
String dateOfBirth       =      date_of_birth.toString() ;
String DateOfJoin        =      date_of_join.toString() ;
String family_email      =      M_fame.getText();
String s_family_phone    =      M_famp.getText(); 
String chronic_diseases  =      M_cd.getText();
String other_diseases    =      M_od.getText();
String spical_needs      =      M_sn.getText();
String admin2            =      getAdmin();

							
							

int iAge = Integer.parseInt(age);
Long family_phone=Long.parseLong(s_family_phone);

Member mem = new Member();  
						
mem.setFname(firstName);
mem.setLname(lastName);
mem.setAge(iAge);
mem.setDepartment(Depatment);
mem.setDate_of_birth(dateOfBirth);
mem.setGender(Gender);
mem.setEducation(Education);
mem.setExperience(Experience);
mem.setDate_of_join(DateOfJoin);
mem.setNationality(Nationality);
mem.setMother_language(motherLanguage);
mem.setOther_language(otherLanguage);
mem.setFamily_email(family_email);
mem.setFamily_phone(family_phone);
mem.setChronic_diseases(chronic_diseases);
mem.setOther_diseases(other_diseases);
mem.setSpecial_needs(spical_needs);
mem.setAdmin(admin2);
 try {
int status=  DBInfo.save_Mem(mem);

 if(status>0){  	  
 JOptionPane.showMessageDialog(panel_1, " Record saved successfully! ");
									  
//System.out.println(" Record saved successfully! ");  
								       
}else{  
JOptionPane.showMessageDialog(panel_1, "Sorry! unable to save record","warning",
	JOptionPane.ERROR_MESSAGE);
									  
	//	  System.out.println("Sorry! unable to save record");  
	  }
	} catch (HeadlessException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
		}  	
	panel.removeAll();
	display_mem(panel);

							 
		}		
}		
			
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBackground(new Color(0, 0, 51));
		panel_4.add(button_1);
		
		JLabel label_22 = new JLabel(new ImageIcon(Edit.class.getResource("/img/Add-Male-User.png")));
		label_22.setBounds(941, 51, 254, 317);
		panel_4.add(label_22);
		
		JLabel lblNewLabel_33 = new JLabel("If No Informatiom , Write N/A");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_33.setForeground(new Color(153, 0, 51));
		lblNewLabel_33.setBounds(703, 137, 204, 15);
		panel_4.add(lblNewLabel_33);
		
		JLabel lblIfNoInformatiom_2 = new JLabel("If No Informatiom , Write 0");
		lblIfNoInformatiom_2.setForeground(new Color(153, 0, 51));
		lblIfNoInformatiom_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIfNoInformatiom_2.setBounds(703, 190, 204, 15);
		panel_4.add(lblIfNoInformatiom_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.menu);
		tabbedPane_2.addTab("Update Member/Delete", null, panel_5, null);
		panel_5.setLayout(null);
		


		
		JLabel label_23 = new JLabel("First Name");
		label_23.setBounds(10, 89, 92, 15);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_23);
		
		JLabel label_24 = new JLabel("Last Name");
		label_24.setBounds(10, 142, 92, 15);
		label_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_24);
		
		JLabel label_25 = new JLabel("Age");
		label_25.setBounds(10, 195, 70, 15);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_25);
		
		JLabel label_26 = new JLabel("Department");
		label_26.setBounds(10, 240, 92, 15);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_26);
		
		JLabel label_28 = new JLabel("Date of Birthday");
		label_28.setBounds(10, 290, 107, 15);
		label_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_28);
		
		JLabel label_29 = new JLabel("Gender");
		label_29.setBounds(10, 346, 70, 15);
		label_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_29);
		
		JLabel label_30 = new JLabel("Date of Join");
		label_30.setBounds(10, 498, 107, 15);
		label_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_30);
		
		JLabel label_31 = new JLabel("Experience");
		label_31.setBounds(10, 449, 119, 15);
		label_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_31);
		
		JLabel label_32 = new JLabel("Education");
		label_32.setBounds(10, 392, 92, 15);
		label_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_32);
		
		fname = new JTextField();
		fname.setBounds(129, 85, 178, 19);
		fname.setColumns(10);
		panel_5.add(fname);
		
		lname = new JTextField();
		lname.setBounds(129, 138, 178, 19);
		lname.setColumns(10);
		panel_5.add(lname);
		
		age_text = new JTextField();
		age_text.setBounds(129, 191, 178, 19);
		age_text.setColumns(10);
		panel_5.add(age_text);
		
		department = new JTextField();
		department.setBounds(129, 236, 178, 19);
		department.setColumns(10);
		panel_5.add(department);
		
		gender = new JTextField();
		gender.setBounds(129, 342, 178, 19);
		gender.setColumns(10);
		panel_5.add(gender);
		
		education = new JTextField();
		education.setBounds(129, 388, 178, 19);
		education.setColumns(10);
		panel_5.add(education);
		
		experience = new JTextField();
		experience.setBounds(129, 445, 178, 19);
		experience.setColumns(10);
		panel_5.add(experience);
		
		JLabel label_33 = new JLabel("Nationality");
		label_33.setBounds(10, 553, 92, 15);
		label_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_33);
		
		JLabel label_34 = new JLabel("Other_Language");
		label_34.setBounds(382, 139, 118, 15);
		label_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_34);
		
		JLabel label_35 = new JLabel("Family E-Mail");
		label_35.setBounds(382, 184, 118, 19);
		label_35.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_35);
		
		JLabel label_37 = new JLabel("Mother_Language");
		label_37.setBounds(382, 87, 118, 15);
		label_37.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_37);
		
		mother_language = new JTextField();
		mother_language.setBounds(510, 85, 176, 19);
		mother_language.setColumns(10);
		panel_5.add(mother_language);
		
		other_language = new JTextField();
		other_language.setBounds(510, 137, 176, 19);
		other_language.setColumns(10);
		panel_5.add(other_language);
		
		nationality = new JTextField();
		nationality.setBounds(129, 551, 178, 19);
		nationality.setColumns(10);
		panel_5.add(nationality);
		
		family_email = new JTextField();
		family_email.setBounds(510, 184, 176, 20);
		family_email.setColumns(10);
		panel_5.add(family_email);
		
		JLabel label_39 = new JLabel("Family Phone");
		label_39.setBounds(382, 235, 118, 21);
		label_39.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_39);
		
		family_pho = new JTextField();
		family_pho.setBounds(510, 234, 176, 21);
		family_pho.setColumns(10);
		panel_5.add(family_pho);
		
		JLabel label_40 = new JLabel("chronic diseases");
		label_40.setBounds(382, 281, 107, 27);
		label_40.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_40);
		
		JLabel label_41 = new JLabel("Other diseases");
		label_41.setBounds(382, 338, 107, 27);
		label_41.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_41);
		
		other_diseases = new JTextField();
		other_diseases.setBounds(510, 342, 176, 21);
		other_diseases.setColumns(10);
		panel_5.add(other_diseases);
		
		chronic_diseases = new JTextField();
		chronic_diseases.setBounds(510, 285, 176, 21);
		chronic_diseases.setColumns(10);
		panel_5.add(chronic_diseases);
		
		JLabel label_42 = new JLabel("Special Needs");
		label_42.setBounds(382, 394, 107, 27);
		label_42.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(label_42);
		
		special_needs = new JTextField();
		special_needs.setBounds(510, 398, 176, 21);
		special_needs.setColumns(10);
		panel_5.add(special_needs);
		
		JLabel label_43 = new JLabel("Enter ID");
		label_43.setBounds(10, 18, 81, 27);
		label_43.setFont(new Font("Dialog", Font.BOLD, 18));
		panel_5.add(label_43);
		
		id_member = new JTextField();
		id_member.setBounds(117, 18, 93, 27);
		id_member.setColumns(10);
		panel_5.add(id_member);
		
		JButton button_2 = new JButton("Find");
		button_2.setBounds(241, 11, 97, 41);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
if(id_member.getText().equals(""))	
{JOptionPane.showMessageDialog(panel_5, "Please Enter Id Value");}

else {	

				
String sid=id_member.getText();  
 int id=Integer.parseInt(sid);   
			
Member mem=DBInfo.getMemberId(id); 
		 
			    
fname.setText(mem.getFname());
lname.setText(mem.getLname());
age_text.setText(String.valueOf(mem.getAge()));
department.setText( mem.getDepartment());
nationality.setText( mem.getNationality());
gender.setText(mem.getGender());
education.setText( mem.getEducation());
experience.setText( mem.getExperience());
mother_language.setText( mem.getMother_language());
other_language.setText(mem.getOther_language());
family_pho.setText(mem.getFamily_phone().toString());
family_email.setText(mem.getFamily_email());
date_of_birth.setText(mem.getDate_of_birth());
date_of_join.setText(mem.getDate_of_join());
chronic_diseases.setText(mem.getChronic_diseases());
other_diseases.setText(mem.getOther_diseases());
special_needs.setText(mem.getSpecial_needs());
			}}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBackground(new Color(0, 0, 128));
		panel_5.add(button_2);
		
		JButton btnUpdateMember = new JButton("Update Member");
		btnUpdateMember.setBounds(982, 110, 181, 36);
		btnUpdateMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

	 LongValidator lo=LongValidator.getInstance();
	EmailValidator em=EmailValidator.getInstance();
	IntegerValidator in = IntegerValidator.getInstance();
    boolean bemail=em.isValid(family_email.getText());
	boolean bage=in.isValid(age_text.getText());
	boolean lphone=lo.isValid(family_pho.getText());
	boolean bid=in.isValid(id_member.getText());

	if (bid==false) {
		JOptionPane.showMessageDialog(f, "Plese Enter Correct id !");}
	else if (bemail==false &&! family_email.getText().equals("N/A")) {
	JOptionPane.showMessageDialog(f, "Plese Enter Correct Family-E-mail !");}
	
	else if (bage==false) {
	JOptionPane.showMessageDialog(f, "Plese Enter Correct age !");}
	else if (lphone==false &&! family_pho.getText().equals("0")) {
	JOptionPane.showMessageDialog(f, "Plese Enter Correct Family-Phone Number !");}
	
	else {	
							
				String sid=id_member.getText();  
			    int id=Integer.parseInt(sid);  
	
			    String firstName         = 	    fname.getText();
			    String lastName          = 		lname.getText();
			    int agea                  =      Integer.parseInt(age_text.getText());
			    String Depatment         = 		department.getText();
			    String Gender            = 		gender.getText();
			    String Education         = 		education.getText();
			    String Experience        = 		experience.getText(); 
			    String Nationality       = 		nationality.getText();
			    String motherLanguage    = 		mother_language.getText();
			    String otherLanguage     = 		other_language.getText();
			    String dateOfBirth       =      date_of_birth.toString() ;
			    String DateOfJoin        =      date_of_join.toString() ;
			    String family_emailz      =      family_email.getText();
			    Long s_family_phone    =        Long.parseLong(family_pho.getText()); 
			    String chronic_diseasesz  =      chronic_diseases.getText();
			    String other_diseasesz    =      other_diseases.getText();
			    String spical_needs      =      special_needs.getText();
			    String admin22            =      getAdmin();		    
			  
			    
			    Member mem = new Member();  
				mem.setId(id);
			    mem.setFname(firstName);
			    mem.setLname(lastName);
			    mem.setAge(agea);
			    mem.setDepartment(Depatment);
			    mem.setDate_of_birth(dateOfBirth);
			    mem.setGender(Gender);
			    mem.setEducation(Education);
			    mem.setExperience(Experience);
			    mem.setDate_of_join(DateOfJoin);
			    mem.setNationality(Nationality);
			    mem.setMother_language(motherLanguage);
			    mem.setOther_language(otherLanguage);
			    mem.setFamily_email(family_emailz);
			    mem.setFamily_phone(s_family_phone);
			    mem.setChronic_diseases(chronic_diseasesz);
			    mem.setOther_diseases(other_diseasesz);
			    mem.setSpecial_needs(spical_needs);
			    mem.setModify_By(admin22);

			    int status=DBInfo.update_member(mem);  
		        if(status>0){  
	 
JOptionPane.showMessageDialog(panel_2, "Record update successfully!" );
		        }else{ 	        		
JOptionPane.showMessageDialog(panel_2, "Sorry! unable to update record","warning",
			    			  JOptionPane.ERROR_MESSAGE);
		        	
  
		        }  
	
		        panel.removeAll();
				
				   display_mem(panel);
  


			}}
		});
		btnUpdateMember.setForeground(Color.WHITE);
		btnUpdateMember.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdateMember.setBackground(new Color(0, 0, 51));
		panel_5.add(btnUpdateMember);
		
		JButton button_4 = new JButton("Delete Employee");
		button_4.setBounds(982, 435, 181, 36);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
IntegerValidator in = IntegerValidator.getInstance();
boolean bid=in.isValid(id_member.getText());
if (bid==false) {
JOptionPane.showMessageDialog(f, "Plese Enter Correct id !");}
else {


String sid=id_member.getText();  
 int id=Integer.parseInt(sid);   
			     
	 int status=  DBInfo.delete_member(id) ;
	 if(status>0){  
JOptionPane.showMessageDialog(panel_2, "Record delete successfully!" );
		        }
 else{ 	
JOptionPane.showMessageDialog(panel_2, "Sorry! unable to delete record","warning",
			    			  JOptionPane.ERROR_MESSAGE); 
		        }  
	     
			     panel.removeAll();
				  display_mem(panel);






			}}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBackground(new Color(0, 0, 51));
		panel_5.add(button_4);
		
		JLabel label_44 = new JLabel(new ImageIcon(Edit.class.getResource("/img/employees.png")));
		label_44.setBounds(982, 207, 213, 200);
		panel_5.add(label_44);
		
		date_of_birth = new JTextField();
		date_of_birth.setBounds(129, 288, 178, 19);
		date_of_birth.setColumns(10);
		panel_5.add(date_of_birth);
		
		date_of_join = new JTextField();
		date_of_join.setBounds(129, 496, 178, 19);
		date_of_join.setColumns(10);
		panel_5.add(date_of_join);
		
		JLabel label_46 = new JLabel("If No Informatiom , Write N/A");
		label_46.setForeground(new Color(153, 0, 51));
		label_46.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_46.setBounds(696, 187, 204, 15);
		panel_5.add(label_46);
		
		JLabel lblIfNoInformatiom = new JLabel("If No Informatiom , Write 0");
		lblIfNoInformatiom.setForeground(new Color(153, 0, 51));
		lblIfNoInformatiom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIfNoInformatiom.setBounds(696, 236, 204, 19);
		panel_5.add(lblIfNoInformatiom);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("About", null, panel_8, null);
		panel_8.setLayout(null);
		
		JTextArea textArea = new JTextArea("«·»—„Ã… ·√Ã· «·⁄—«ﬁ  Code for Iraq     \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ÂÌ „»«œ—… ≈‰”«‰Ì… €Ì— —»ÕÌ…  Âœ› «·Ï Œœ„… «·„Ã „⁄ ⁄‰ ÿ—Ìﬁ «·»—„Ã….\r\n" + 
				"Ê ⁄ »— „»«œ—…  ⁄·Ì„Ì… ÕﬁÌﬁÌ…  —⁄Ï «·„Â „Ì‰ » ⁄·„  ’„Ì„ Ê»—„Ã…  ÿ»Ìﬁ«  «·Â« › «·ÃÊ«· Ê„Ê«ﬁ⁄ «·«‰ —‰Ì  Ê»—«„Ã «·Õ«”Ê» Ê«·‘»ﬂ«  Ê«·« ’«·«  Ê‰Ÿ„  ‘€Ì· «·Õ«”Ê»»«” Œœ«„  ﬁ‰Ì«  „› ÊÕ… «·„’œ—° ﬂ„«  Ê›— ·Â„ Ã„Ì⁄ «·œ—Ê” «· ⁄·Ì„Ì… «··«“„… Ê»‘ﬂ· „Ã«‰Ì  „«„«.\r\n" + 
				"Ê«·√Â„ „‰ –·ﬂ  ⁄ „œ «·„»«œ—… ⁄·Ï „»œ√ «·„Ê«ÿ‰… Ê«·„‘«—ﬂ… «·›«⁄·… ›Ì  √”Ì” Ê»‰«¡ «·„Ã „⁄.\r\n" + 
				"·–«  œ⁄Ê «·„»«œ—… Ã„Ì⁄ «·ÿ·»… Ê«·Œ—ÌÃÌ‰ Ê«·ÂÊ«… Ê«·√”« –… «·Ã«„⁄ÌÌ‰ Ê«·„Â „Ì‰ ›Ì „Ã«· «·»—„Ã… Ê ﬁ‰Ì«  «·„⁄·Ê„«  Êﬂ–·ﬂ «·«Œ ’«’«  «·√Œ—Ï «·Ï «· ÿÊ— Ê«·„‘«—ﬂ… «·›⁄·Ì… ·√Ã· «·«— ﬁ«¡ »Ê«ﬁ⁄ «·»·œ ÕÌÀ  ⁄ »— Â–Â ›—’… ⁄ŸÌ„… ·«ﬂ ”«» «·Œ»—… Ê«·„Â«—… ⁄‰ ÿ—Ìﬁ  ’„Ì„ Ê ‰›Ì– »—«„Ã Ê ÿ»Ìﬁ«  Œœ„Ì… „‰ ‘√‰Â« Œœ„… «·„Ê«ÿ‰ Ê–·ﬂ ÷„‰ „Ã«„Ì⁄ ⁄„· ‰‘ÿ… Ê›⁄«·… Ì ⁄«Ê‰ ›ÌÂ« Ã„Ì⁄ «·«›—«œ ﬂ›—Ìﬁ Ê«Õœ°Ì »«œ· «·¬—«¡ Ê«·Œ»—«  ÊÌÿ—Õ «·√›ﬂ«— ·  „ „‰«ﬁ‘ Â« Ê ÿ»ÌﬁÂ« ⁄·Ï «—÷ «·Ê«ﬁ⁄.\r\n" + 
				"ﬂ„«  › Õ «·„Ã«· ·Ã„Ì⁄ «·„Ê«ÿ‰Ì‰ «·⁄—«ﬁÌÌ‰ Ê„‰ Ã„Ì⁄ «·«Œ ’«’«  «·Ï «·„‘«—ﬂ… «·›⁄«·… ›Ì Â–Â «·„‘«—Ì⁄ ·—›œ «·›—Ìﬁ »«·Œ»—«  Ê«·√›ﬂ«— Ê«·¬—«¡ Ê«·„ﬁ —Õ«  «· Ì „‰ ‘√‰Â« Œœ„… «·„Ã „⁄ »√›÷· „« Ì„ﬂ‰.\r\n" + 
				"\r\n" + 
				"");
		textArea.setBounds(0, 0, 1195, 492);
		panel_8.add(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textArea.setLineWrap(true);
		

		
	
		
		
		
		JLabel lblNewLabel = new JLabel("DataBase status");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(40, 12, 134, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(214, 12, 217, 15);
		lblNewLabel_1.setForeground(Color.RED);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_5 = new JButton("Log Out");
		btnNewButton_5.setForeground(new Color(0, 0, 102));
		btnNewButton_5.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		btnNewButton_5.setBackground(SystemColor.activeCaption);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    Main p=null;
				try {
					p=new Main();
				} catch (Exception e) {
					e.printStackTrace();
				}
				p.frame.setVisible(true);
				f.setVisible(false);
			}
		});
		btnNewButton_5.setBounds(1222, 64, 130, 53);
		contentPane.add(btnNewButton_5);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(0, 0, 102));
		btnExit.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);	
			}
		});
		btnExit.setBounds(1222, 145, 130, 53);
		contentPane.add(btnExit);
		
	
		
		
		
if(! AdminsDB.getConnection().isClosed()){
			
	lblNewLabel_1.setText("Connected");
		}else{
			lblNewLabel_1.setText("Not connected");
		}

	}

	public void display_mem(JPanel panel) {
		DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("First Name");
        model.addColumn("Last name");
        model.addColumn("Age");
        model.addColumn("Department");
        model.addColumn("Date Of Join");
        model.addColumn("Date_of_birth");
        model.addColumn("Gender");
        model.addColumn("Education");
        model.addColumn("Experience");
        model.addColumn("Nationality");
        model.addColumn("Mother_Language");
        model.addColumn("Other_Language");
        model.addColumn("Family_E-Mail");
        model.addColumn("Family_Phone");
        model.addColumn("Chronic Diseases");
        model.addColumn("Other Diseases");
        model.addColumn("Special Needs");
        model.addColumn("Admin");
        model.addColumn("Modify By");
         	        
		  for(Member list: DBInfo.getMember()){
			  model.addRow(new Object[]{
					  
		  list.getId(),
		  list.getFname(),
		  list.getLname(),
     	  list.getAge(),
      	  list.getDepartment(),
       	  list.getDate_of_join(),
          list.getDate_of_birth(),
          list.getGender(),
		  list.getEducation(),
		  list.getExperience(),
		  list.getNationality(),
		  list.getMother_language(),
		  list.getOther_language(),	
		  list.getFamily_email(),
		  list.getFamily_phone(),
		  list.getChronic_diseases(),
		  list.getOther_diseases(),
		  list.getSpecial_needs(),
		  list.getAdmin(),
		  list.getModify_By()
					  
					  
			  });

		  }
		JTable table_1 = new JTable();
		table_1.setBounds(1, 1, 0, 668);
	
		table_1.setForeground(Color.BLACK);
		table_1.setFillsViewportHeight(true);
		table_1.setCellSelectionEnabled(true);
		panel.add(table_1);
		table_1.setBackground(SystemColor.menu);
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		table_1.setColumnSelectionAllowed(true);
		
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	

		table_1.setRowHeight(30);
		table_1.setModel(model);

		TableColumnModel columnModel = table_1.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(120);
		columnModel.getColumn(2).setPreferredWidth(120);
		columnModel.getColumn(3).setPreferredWidth(50);
		columnModel.getColumn(4).setPreferredWidth(100);
		columnModel.getColumn(5).setPreferredWidth(250);
		columnModel.getColumn(6).setPreferredWidth(250);
		columnModel.getColumn(7).setPreferredWidth(50);
		columnModel.getColumn(8).setPreferredWidth(120);
		columnModel.getColumn(9).setPreferredWidth(120);
		columnModel.getColumn(10).setPreferredWidth(100);
		columnModel.getColumn(11).setPreferredWidth(100);
		columnModel.getColumn(12).setPreferredWidth(100);
		columnModel.getColumn(13).setPreferredWidth(130);
		columnModel.getColumn(14).setPreferredWidth(130);
		columnModel.getColumn(15).setPreferredWidth(100);
		columnModel.getColumn(16).setPreferredWidth(100);
		columnModel.getColumn(17).setPreferredWidth(230);
		columnModel.getColumn(18).setPreferredWidth(150);
		columnModel.getColumn(19).setPreferredWidth(150);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(0, 0, 1190, 644);
	    panel.add(scrollPane);
	
	
	
	
	}


	
	
	public void display(JPanel panel) {
		DefaultTableModel model = new DefaultTableModel();
	        model.addColumn("Id");
	        model.addColumn("First Name");
	        model.addColumn("Last name");
	        model.addColumn("Salary");
	        model.addColumn("Age");
	        model.addColumn("Department");
	        model.addColumn("Address");
	        model.addColumn("Date_of_birth");
	        model.addColumn("Gender");
	        model.addColumn("Education");
	        model.addColumn("Experience");
	        model.addColumn("Contract_Start");
	        model.addColumn("Contract_End");
	        model.addColumn("Nationality");
	        model.addColumn("Mother_Language");
	        model.addColumn("Other_Language");
	        model.addColumn("E-Mail");
	        model.addColumn("Phone");
	        model.addColumn("Admin");
	        model.addColumn("Modify By");
	         	        
			  for(Employee list: DBInfo.getEmployee()){
				  model.addRow(new Object[]{
						  
						  list.getId(),
						  list.getFname(),
						  list.getLname(),
						  list.getSalary(),
						  list.getAge(),
						  list.getDepartment(),
						  list.getAddress(),
						  list.getDate_of_birth(),
						  list.getGender(),
						  list.getEducation(),
						  list.getExperience(),
						  list.getContract_start(),
						  list.getContract_end(),
						  list.getNationality(),
						  list.getMother_language(),
						  list.getOther_language(),	
						  list.getemail(),
						  list.getphone(),
						  list.getAdmin(),
						  list.getModify_By()
						  
						  
				  });

			  }
  		JTable table = new JTable();
  		table.setBounds(1, 1, 0, 668);
		
		table.setForeground(Color.BLACK);
  		table.setFillsViewportHeight(true);
  		table.setCellSelectionEnabled(true);
  		panel.add(table);
  		table.setBackground(SystemColor.menu);
  		table.setSurrendersFocusOnKeystroke(true);
  		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
  		table.setColumnSelectionAllowed(true);
  		
  		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
  		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    	
 
  		table.setRowHeight(30);
  		table.setModel(model);

  		TableColumnModel columnModel = table.getColumnModel();
  		columnModel.getColumn(0).setPreferredWidth(100);
  		columnModel.getColumn(1).setPreferredWidth(120);
  		columnModel.getColumn(2).setPreferredWidth(120);
  		columnModel.getColumn(3).setPreferredWidth(100);
  		columnModel.getColumn(4).setPreferredWidth(50);
  		columnModel.getColumn(5).setPreferredWidth(120);
  		columnModel.getColumn(6).setPreferredWidth(150);
  		columnModel.getColumn(7).setPreferredWidth(310);
  		columnModel.getColumn(8).setPreferredWidth(50);
  		columnModel.getColumn(9).setPreferredWidth(200);
  		columnModel.getColumn(10).setPreferredWidth(100);
  		columnModel.getColumn(11).setPreferredWidth(310);
  		columnModel.getColumn(12).setPreferredWidth(310);
  		columnModel.getColumn(13).setPreferredWidth(100);
  		columnModel.getColumn(14).setPreferredWidth(110);
  		columnModel.getColumn(15).setPreferredWidth(100);
  		columnModel.getColumn(16).setPreferredWidth(250);
  		columnModel.getColumn(17).setPreferredWidth(230);
  		columnModel.getColumn(18).setPreferredWidth(150);
  		columnModel.getColumn(19).setPreferredWidth(150);
   		panel_3.setLayout(null);
  
   		JScrollPane scrollPane = new JScrollPane(table);
   		scrollPane.setBounds(0, 0, 1190, 645);
		panel.add(scrollPane);
	}
}