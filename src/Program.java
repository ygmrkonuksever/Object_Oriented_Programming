

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Program {

	int memberId, password;
	double bill;
	int pointGainedFromShopping;

	static boolean flagcreditcard = false;

	public static double calculatePoint(double last_bill) { // alýþveriþten kazanýlan puan

		double pointGainedFromShopping = (int) (last_bill * 10 / 100); // %10 olarak attým

		return pointGainedFromShopping;
	}

	private JFrame MenuScreen;	
	private JPanel contentPane;
	
	public static void main(String[] args) throws QueueEmpty, IOException {
		
		EventQueue.invokeLater(new Runnable() {    //Ana menünün görünürlüðü
			public void run() {
				try {
					Program menuscreen = new Program();						
					menuscreen.MenuScreen.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
	
	public Program() { 
		
		MenuScreen = new JFrame();
		MenuScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuScreen.setTitle("Menu Screen");
		MenuScreen.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		MenuScreen.setContentPane(contentPane);
		MenuScreen.getContentPane().setLayout(null);
		
		JLabel welcomemessage = new JLabel("Welcome the Online Market Shopping System!");
		welcomemessage.setBounds(98,  30, 300, 23);
		contentPane.add(welcomemessage);
		
		
		JButton btnBegintheshopping = new JButton("Begin the Shopping");
		btnBegintheshopping.setBackground(Color.WHITE);
		btnBegintheshopping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Shopping system = new Shopping(); 
				system.setVisible(true);	
				
			}
		});
		btnBegintheshopping.setBounds(98, 70, 240, 23);
		contentPane.add(btnBegintheshopping);		
		
		JButton btnBecomeAMember = new JButton("Become a Member");
		btnBecomeAMember.setBackground(Color.WHITE);
		btnBecomeAMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				BecomeMember becomemember = null;
				try {
					becomemember = new BecomeMember();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				becomemember.setVisible(true);				
				
			}
		});
		btnBecomeAMember.setBounds(98, 140, 240, 23);
		contentPane.add(btnBecomeAMember);
		
	}

	
	
}