


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MemberLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnEnter;
	public static String members[][];
	int memberId, password;
    double  bill;
	int pointGainedFromShopping;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberLogin frame = new MemberLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public MemberLogin() throws FileNotFoundException {
		
		//readFile();
		//boolean member = false;
		
		Member m = new Member();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameOrEmail = new JLabel("Name:");
		lblNameOrEmail.setBounds(44, 42, 123, 14);
		contentPane.add(lblNameOrEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(44, 91, 112, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(177, 39, 119, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(177, 88, 119, 20);
		contentPane.add(passwordField);
		
		btnEnter = new JButton("Login");
		btnEnter.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Scanner scan1 = new Scanner(System.in);
				try {
					m.readFile();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String input = textField.getText();
				input = input.toLowerCase();				
				String inputPassword = new String(passwordField.getPassword());
				inputPassword = inputPassword.toLowerCase();				
				boolean member = m.checkingMember(input, inputPassword);
				if(member == true) {
					
					String ID = m.getMemberID(input, inputPassword);
					int memberpoint = m.point(ID);
					
					JFrame pointpanelmember = new JFrame("Point Screen");
					MemberPointPanel memberpointpanel = new MemberPointPanel();
					getContentPane().setLayout(null);
					
					/*JLabel lbltotalamount = new JLabel("Total Amount: ");
					lbltotalamount.setBounds(10, 54, 164, 23);
					memberpanel.add(lbltotalamount);
					
					JLabel lblpoint = new JLabel("Your Point: ");
					lblpoint.setBounds(10, 147, 164, 14);
					memberpanel.add(lblpoint);*/
					
					
					
					JTextArea textfieldamount = new JTextArea();
					textfieldamount.setBounds(190, 111, 86, 20);
					textfieldamount.setEditable(false);
				 	memberpointpanel.add(textfieldamount);
				 	
				 	JTextArea textfieldpoint = new JTextArea();
				 	textfieldpoint.setBounds(190, 39, 86, 20);
				 	textfieldpoint.setEditable(false);
				 	textfieldpoint.setText(Integer.toString(memberpoint));
				 	//textfield1.setText(hadi);				 	
				 	memberpointpanel.add(textfieldpoint);
				 	
				 	JTextArea textfieldtotalamount = new JTextArea();
					textfieldtotalamount.setBounds(190, 192, 86, 20);
					textfieldtotalamount.setEditable(false);
				 	memberpointpanel.add(textfieldtotalamount);
				 	
				 	JButton btnNewButtonOK = new JButton("Confirm");
					btnNewButtonOK.setBounds(190, 248, 89, 23);
					memberpointpanel.add(btnNewButtonOK);
					btnNewButtonOK.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 int dialogButton =  JOptionPane.showConfirmDialog (null, "Dou you want to use your point?","Warning",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
							 if (dialogButton == JOptionPane.YES_OPTION) { 
								 	 
								 	
								 
							 }
							 if (dialogButton == JOptionPane.NO_OPTION) {
								 
								 CreditCart creditcard = new CreditCart();
								 creditcard.setVisible(true);
							 }
						}
					});
				 	 
					pointpanelmember.getContentPane().add(memberpointpanel);
					pointpanelmember.setBounds(100, 100, 447, 479);
					pointpanelmember.setVisible(true);
					
					/*PointFrame point = new PointFrame(); 
					point.setVisible(true);*/
					
				}
				if(member == false) {
					
					String message = "Invalid Login";
					JOptionPane.showMessageDialog(null, message);					
				}
				
			}
			
		});
		btnEnter.setBounds(144, 149, 89, 23);
		contentPane.add(btnEnter);
		setVisible(false);
	}
	
}
