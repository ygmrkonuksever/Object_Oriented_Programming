

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreditCart extends JFrame {

	private JPanel contentPane;
	private JTextField textField_creditcartFirst;
	private JTextField textField_creditcartSecond;
	private JTextField textField_creditcartThird;
	private JTextField textField_creditcartLast;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditCart frame = new CreditCart();
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
	public CreditCart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterYour = new JLabel("Enter Your Credit Card Numbers First 4 Number");
		lblEnterYour.setBounds(10, 32, 293, 14);
		contentPane.add(lblEnterYour);
		
		JLabel lblEnterYourCredit = new JLabel("Enter Your Credit Card Numbers Second 4 Number");
		lblEnterYourCredit.setBounds(10, 70, 293, 14);
		contentPane.add(lblEnterYourCredit);
		
		JLabel lblEnterYourCredit_1 = new JLabel("Enter Your Credit Card Numbers Third 4 Number");
		lblEnterYourCredit_1.setBounds(10, 116, 293, 14);
		contentPane.add(lblEnterYourCredit_1);
		
		JLabel lblEnterYourCredit_2 = new JLabel("Enter Your Credit Card Numbers Last 4 Number");
		lblEnterYourCredit_2.setBounds(10, 165, 293, 14);
		contentPane.add(lblEnterYourCredit_2);
		
		textField_creditcartFirst = new JTextField();
		textField_creditcartFirst.setBounds(313, 29, 86, 20);
		contentPane.add(textField_creditcartFirst);
		textField_creditcartFirst.setColumns(10);
		
		textField_creditcartSecond = new JTextField();
		textField_creditcartSecond.setBounds(313, 67, 86, 20);
		contentPane.add(textField_creditcartSecond);
		textField_creditcartSecond.setColumns(10);
		
		textField_creditcartThird = new JTextField();
		textField_creditcartThird.setBounds(313, 113, 86, 20);
		contentPane.add(textField_creditcartThird);
		textField_creditcartThird.setColumns(10);
		
		textField_creditcartLast = new JTextField();
		textField_creditcartLast.setBounds(313, 162, 86, 20);
		contentPane.add(textField_creditcartLast);
		textField_creditcartLast.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String message = "Your payment is complete";
				JOptionPane.showMessageDialog(null, message);
				System.exit(0);
			}
		});
		btnConfirm.setBounds(310, 214, 89, 23);
		contentPane.add(btnConfirm);
	}

}

