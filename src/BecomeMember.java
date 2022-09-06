


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class BecomeMember extends JFrame {

	private JPanel contentPane;
	private JTextField textField_NameSurname;
	private JTextField textField_PhoneNumber1;
	private JTextField textField_PhoneNumber2;
	private JTextField textField_EmailAddress;
	private JTextField textField_Gender;
	private JTextField textField_Address;
	private JTextField textField_Age;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BecomeMember frame = new BecomeMember();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public BecomeMember() throws IOException {
		Member m = new Member();
		m.readFile();
		setTitle("Become Member");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNamesurname = new JLabel("Name - Last Name:");
		lblNamesurname.setBounds(10, 11, 99, 14);
		contentPane.add(lblNamesurname);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(10, 64, 99, 14);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblEmailAddress = new JLabel("email Address:");
		lblEmailAddress.setBounds(10, 105, 99, 14);
		contentPane.add(lblEmailAddress);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(10, 142, 99, 14);
		contentPane.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 176, 99, 14);
		contentPane.add(lblAddress);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(10, 236, 99, 14);
		contentPane.add(lblAge);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 261, 99, 14);
		contentPane.add(lblPassword);
		
		textField_NameSurname = new JTextField();
		textField_NameSurname.setBackground(new Color(255, 250, 250));
		textField_NameSurname.setBounds(119, 8, 86, 20);
		contentPane.add(textField_NameSurname);
		textField_NameSurname.setColumns(10);
		String NewMemberName = textField_NameSurname.getText();
		
		textField_PhoneNumber1 = new JTextField();
		textField_PhoneNumber1.setBackground(new Color(255, 250, 250));
		textField_PhoneNumber1.setBounds(119, 61, 86, 20);
		contentPane.add(textField_PhoneNumber1);
		textField_PhoneNumber1.setColumns(10);		
		String PhoneNumberFirst = textField_PhoneNumber1.getText();
		
		
		textField_PhoneNumber2 = new JTextField();
		textField_PhoneNumber2.setBackground(new Color(255, 250, 250));
		textField_PhoneNumber2.setBounds(217, 61, 86, 20);
		contentPane.add(textField_PhoneNumber2);
		textField_PhoneNumber2.setColumns(10);
		String PhoneNumberSecond = textField_PhoneNumber2.getText();
		
		textField_EmailAddress = new JTextField();
		textField_EmailAddress.setBackground(new Color(255, 250, 250));
		textField_EmailAddress.setBounds(119, 102, 131, 20);
		contentPane.add(textField_EmailAddress);
		textField_EmailAddress.setColumns(10);
		String NewMemberEmail = textField_EmailAddress.getText();
		
		textField_Gender = new JTextField();
		textField_Gender.setBackground(new Color(255, 250, 250));
		textField_Gender.setBounds(119, 139, 86, 20);
		contentPane.add(textField_Gender);
		textField_Gender.setColumns(10);
		String NewGender = textField_Gender.getText();
		
		textField_Address = new JTextField();
		textField_Address.setBackground(new Color(255, 250, 250));
		textField_Address.setBounds(119, 173, 305, 49);
		contentPane.add(textField_Address);
		textField_Address.setColumns(10);
		String NewAddress = textField_Address.getText();
		
		textField_Age = new JTextField();
		textField_Age.setBackground(new Color(255, 250, 250));
		textField_Age.setBounds(119, 233, 86, 20);
		contentPane.add(textField_Age);
		textField_Age.setColumns(10);
		String NewAge = textField_Age.getText();
		
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 250, 250));
		passwordField.setBounds(119, 258, 86, 20);
		contentPane.add(passwordField);
		String NewPassword = new String(passwordField.getPassword());
		
		JLabel lblFirstNumber = new JLabel("First 6 number");
		lblFirstNumber.setBounds(119, 46, 86, 14);
		contentPane.add(lblFirstNumber);
		
		JLabel lblLastNumber = new JLabel("Last 5 number");
		lblLastNumber.setBounds(217, 46, 86, 14);
		contentPane.add(lblLastNumber);
		
		
		String NewPhoneNumber = PhoneNumberFirst + PhoneNumberSecond;
		
		
		
		JButton btnEnter = new JButton("Sign Up");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Member newmember = new Member(NewMemberName,NewPhoneNumber,NewMemberEmail,NewGender,NewAddress,NewAge,NewPassword);
				m.addMember(newmember);
				try {
					m.addToFile();
					String message = "You become our member.Welcome!";
					JOptionPane.showMessageDialog(null, message);
					 int dialogButton =  JOptionPane.showConfirmDialog (null, "Do you want do shopping?","Warning",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					 if (dialogButton == JOptionPane.YES_OPTION) {
						 
						 Shopping shopping = new Shopping();
						 shopping.setVisible(true);
						
					 }
					 if (dialogButton == JOptionPane.NO_OPTION) {	
						 
						String message1 = "We Wait for Shopping! :)";
						JOptionPane.showMessageDialog(null, message1);
						
					 }
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnEnter.setBounds(161, 281, 89, 23);
		contentPane.add(btnEnter);
		
		
		
		
	}
}
