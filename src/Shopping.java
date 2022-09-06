

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Shopping extends JFrame {

	private JPanel contentPane;	
	private JPanel contentPane1;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shopping frame = new Shopping();
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
	
	public Shopping() {
		
		//ShoppingCart sc=new ShoppingCart();		
		ShoppingCart sc = ShoppingCart.getInstance();
		ProductFactory productFactory = new ProductFactory();
		Product apple = productFactory.getProduct("APPLE");
		Product banana = productFactory.getProduct("BANANA");
		Product beefmeat = productFactory.getProduct("BEEFMEAT");
		Product biscuit = productFactory.getProduct("BÝSCUÝT");
		Product buttermilk = productFactory.getProduct("BUTTERMÝLK");
		Product chicken = productFactory.getProduct("CHÝCKEN");
		Product cola = productFactory.getProduct("COLA");
		Product detergent = productFactory.getProduct("DETERGENT");
		Product mincedbeefmeat = productFactory.getProduct("MÝNCEDBEEFMEAT");
		Product orange = productFactory.getProduct("ORANGE");
		Product peas = productFactory.getProduct("PEAS");
		Product spinach = productFactory.getProduct("SPÝNACH");
		Product tomato = productFactory.getProduct("TOMATO");
		Product water = productFactory.getProduct("WATER");
		/*
		Apple apple = new Apple();
		Banana banana = new Banana();
		BeefMeat beefmeat = new BeefMeat();
		Biscuit biscuit = new Biscuit();
		ButterMilk buttermilk = new ButterMilk();
		Chicken chicken = new Chicken();
		Cola cola = new Cola();
		Detergent detergent = new Detergent();
		MincedBeefMeat mincedbeefmeat = new MincedBeefMeat();
		Orange orange = new Orange();
		Peas peas = new Peas();
		Spinach spinach = new Spinach();
		Tomato tomato = new Tomato();
		Water water = new Water();
		*/
		setTitle("System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnApple = new JRadioButton("Apple");
		rdbtnApple.setBackground(new Color(253, 245, 230));
		rdbtnApple.setForeground(Color.BLACK);
		rdbtnApple.setBounds(6, 20, 109, 23);
		contentPane.add(rdbtnApple);
		
		JRadioButton rdbtnBanana = new JRadioButton("Banana");
		rdbtnBanana.setBackground(new Color(253, 245, 230));
		rdbtnBanana.setBounds(6, 46, 109, 23);
		contentPane.add(rdbtnBanana);
		
		JRadioButton rdbtnBeefMeat = new JRadioButton("Beef Meat");
		rdbtnBeefMeat.setBackground(new Color(253, 245, 230));
		rdbtnBeefMeat.setBounds(6, 72, 109, 23);
		contentPane.add(rdbtnBeefMeat);
		
		JRadioButton rdbtnBiscuit = new JRadioButton("Biscuit");
		rdbtnBiscuit.setBackground(new Color(253, 245, 230));
		rdbtnBiscuit.setBounds(6, 98, 109, 23);
		contentPane.add(rdbtnBiscuit);
		
		JRadioButton rdbtnButtterMilk = new JRadioButton("Buttter Milk");
		rdbtnButtterMilk.setBackground(new Color(253, 245, 230));
		rdbtnButtterMilk.setBounds(6, 124, 109, 23);
		contentPane.add(rdbtnButtterMilk);
		
		JRadioButton rdbtnChicken = new JRadioButton("Chicken");
		rdbtnChicken.setBackground(new Color(253, 245, 230));
		rdbtnChicken.setBounds(6, 149, 109, 23);
		contentPane.add(rdbtnChicken);
		
		JRadioButton rdbtnCola = new JRadioButton("Cola");
		rdbtnCola.setBackground(new Color(253, 245, 230));
		rdbtnCola.setBounds(6, 175, 109, 23);
		contentPane.add(rdbtnCola);
		
		JRadioButton rdbtnDetergent = new JRadioButton("Detergent");
		rdbtnDetergent.setBackground(new Color(253, 245, 230));
		rdbtnDetergent.setBounds(6, 201, 109, 23);
		contentPane.add(rdbtnDetergent);
		
		JRadioButton rdbtnMincedBeefMeat = new JRadioButton("Minced Beef Meat");
		rdbtnMincedBeefMeat.setBackground(new Color(253, 245, 230));
		rdbtnMincedBeefMeat.setBounds(6, 225, 109, 23);
		contentPane.add(rdbtnMincedBeefMeat);
		
		JRadioButton rdbtnOrange = new JRadioButton("Orange");
		rdbtnOrange.setBackground(new Color(253, 245, 230));
		rdbtnOrange.setBounds(6, 251, 109, 23);
		contentPane.add(rdbtnOrange);
		
		JRadioButton rdbtnPeas = new JRadioButton("Peas");
		rdbtnPeas.setBackground(new Color(253, 245, 230));
		rdbtnPeas.setBounds(6, 277, 109, 23);
		contentPane.add(rdbtnPeas);
		
		JRadioButton rdbtnSpinach = new JRadioButton("Spinach");
		rdbtnSpinach.setBackground(new Color(253, 245, 230));
		rdbtnSpinach.setBounds(6, 303, 109, 23);
		contentPane.add(rdbtnSpinach);
		
		JRadioButton rdbtnTomato = new JRadioButton("Tomato");
		rdbtnTomato.setBackground(new Color(253, 245, 230));
		rdbtnTomato.setBounds(6, 329, 109, 23);
		contentPane.add(rdbtnTomato);
		
		JRadioButton rdbtnWater = new JRadioButton("Water");
		rdbtnWater.setBackground(new Color(253, 245, 230));
		rdbtnWater.setBounds(6, 355, 109, 23);
		contentPane.add(rdbtnWater);	
		
		
		JComboBox comboBoxApple = new JComboBox();
		comboBoxApple.setForeground(new Color(0, 0, 0));
		comboBoxApple.setBackground(new Color(255, 255, 255));
		comboBoxApple.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxApple.setBounds(121, 21, 36, 20);
		contentPane.add(comboBoxApple);
		
		JComboBox comboBoxBanana = new JComboBox();
		comboBoxBanana.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxBanana.setBounds(121, 47, 36, 20);
		contentPane.add(comboBoxBanana);
		
		JComboBox comboBoxBeefMeat = new JComboBox();
		comboBoxBeefMeat.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxBeefMeat.setBounds(121, 73, 36, 20);
		contentPane.add(comboBoxBeefMeat);
		
		JComboBox comboBoxBiscuit = new JComboBox();
		comboBoxBiscuit.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxBiscuit.setBounds(121, 99, 36, 20);
		contentPane.add(comboBoxBiscuit);
		
		JComboBox comboBoxButterMilk = new JComboBox();
		comboBoxButterMilk.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxButterMilk.setBounds(121, 125, 36, 20);
		contentPane.add(comboBoxButterMilk);
		
		JComboBox comboBoxChicken = new JComboBox();
		comboBoxChicken.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxChicken.setBounds(121, 150, 36, 20);
		contentPane.add(comboBoxChicken);
		
		JComboBox comboBoxCola = new JComboBox();
		comboBoxCola.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxCola.setBounds(121, 176, 36, 20);
		contentPane.add(comboBoxCola);
		
		JComboBox comboBoxDetergent = new JComboBox();
		comboBoxDetergent.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxDetergent.setBounds(121, 202, 36, 20);
		contentPane.add(comboBoxDetergent);
		
		JComboBox comboBoxMincedBeefMeat = new JComboBox();
		comboBoxMincedBeefMeat.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxMincedBeefMeat.setBounds(121, 226, 36, 20);
		contentPane.add(comboBoxMincedBeefMeat);
		
		JComboBox comboBoxOrange = new JComboBox();
		comboBoxOrange.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxOrange.setBounds(121, 252, 36, 20);
		contentPane.add(comboBoxOrange);
		
		JComboBox comboBoxPeas = new JComboBox();
		comboBoxPeas.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxPeas.setBounds(121, 278, 36, 20);
		contentPane.add(comboBoxPeas);
		
		JComboBox comboBoxSpinach = new JComboBox();
		comboBoxSpinach.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxSpinach.setBounds(121, 304, 36, 20);
		contentPane.add(comboBoxSpinach);
		
		JComboBox comboBoxTomato = new JComboBox();
		comboBoxTomato.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxTomato.setBounds(121, 330, 36, 20);
		contentPane.add(comboBoxTomato);
		
		JComboBox comboBoxWater = new JComboBox();
		comboBoxWater.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBoxWater.setBounds(121, 356, 36, 20);
		contentPane.add(comboBoxWater);	
		
		JTextArea textAreaShoppingList = new JTextArea();
		textAreaShoppingList.setBackground(new Color(224, 255, 255));
		textAreaShoppingList.setBounds(177, 46, 236, 152);
		contentPane.add(textAreaShoppingList);
		
		JTextArea textAreaNull = new JTextArea();
		textAreaNull.setBackground(new Color(255, 255, 240));
		textAreaNull.setBounds(177, 303, 236, 65);
		contentPane.add(textAreaNull);
		
		JButton btnEnter = new JButton("Show Shopping List");
		btnEnter.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				textAreaShoppingList.setText("");
				try {
					sc.removeShoppingCart(apple);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnApple.isSelected()) {
						
					double amount = Double.parseDouble((String)comboBoxApple.getSelectedItem()); 					
					apple.decreaseFromStock(amount);
					sc.addShoppingCart(apple,amount);
					
				}				
				try {
					sc.removeShoppingCart(banana);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnBanana.isSelected()) {
						
					double amount = Double.parseDouble((String)comboBoxBanana.getSelectedItem());				
					banana.decreaseFromStock(amount);
					sc.addShoppingCart(banana,amount);					
				}				
				try {
					sc.removeShoppingCart(beefmeat);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnBeefMeat.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxBeefMeat.getSelectedItem());					
					beefmeat.decreaseFromStock(amount);
					sc.addShoppingCart(beefmeat,amount);					
				}
				try {
					sc.removeShoppingCart(biscuit);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnBiscuit.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxBiscuit.getSelectedItem());					
					biscuit.decreaseFromStock(amount);
					sc.addShoppingCart(biscuit,amount);					
				}			
				try {
					sc.removeShoppingCart(buttermilk);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnButtterMilk.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxButterMilk.getSelectedItem());					
					buttermilk.decreaseFromStock(amount);
					sc.addShoppingCart(buttermilk,amount);					
				}
				try {
					sc.removeShoppingCart(chicken);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnChicken.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxChicken.getSelectedItem());					
					chicken.decreaseFromStock(amount);
					sc.addShoppingCart(chicken,amount);					
				}
				try {
					sc.removeShoppingCart(cola);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnCola.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxCola.getSelectedItem());				
					cola.decreaseFromStock(amount);
					sc.addShoppingCart(cola,amount);					
				}		
				try {
					sc.removeShoppingCart(detergent);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnDetergent.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxDetergent.getSelectedItem());				
					detergent.decreaseFromStock(amount);
					sc.addShoppingCart(detergent,amount);					
				}	
				try {
					sc.removeShoppingCart(mincedbeefmeat);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnMincedBeefMeat.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxMincedBeefMeat.getSelectedItem());					
					mincedbeefmeat.decreaseFromStock(amount);
					sc.addShoppingCart(mincedbeefmeat,amount);					
				}
				try {
					sc.removeShoppingCart(orange);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnOrange.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxOrange.getSelectedItem());				
					orange.decreaseFromStock(amount);
					sc.addShoppingCart(orange,amount);					
				}
				try {
					sc.removeShoppingCart(peas);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnPeas.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxPeas.getSelectedItem());					
					peas.decreaseFromStock(amount);
					sc.addShoppingCart(peas,amount);					
				}
				try {
					sc.removeShoppingCart(spinach);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnSpinach.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxSpinach.getSelectedItem());					
					spinach.decreaseFromStock(amount);
					sc.addShoppingCart(spinach,amount);					
				}
				try {
					sc.removeShoppingCart(tomato);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnTomato.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxTomato.getSelectedItem());					
					tomato.decreaseFromStock(amount);
					sc.addShoppingCart(tomato,amount);					
				}
				try {
					sc.removeShoppingCart(water);
				} catch (QueueEmpty e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(rdbtnWater.isSelected()) {
					
					double amount = Double.parseDouble((String)comboBoxWater.getSelectedItem());					
					water.decreaseFromStock(amount);
					sc.addShoppingCart(water,amount);					
				}								
				try {						
					textAreaShoppingList.setText(sc.displayShoppingCart());	
					textAreaNull.setText(sc.calculateShoppingCart());					
				} catch (QueueEmpty e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}		
			
		});	
		
		btnEnter.setBounds(6, 397, 151, 23);
		contentPane.add(btnEnter);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				 int dialogButton =  JOptionPane.showConfirmDialog (null, "Would you continue the shopping?","Warning",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				    
				 if (dialogButton == JOptionPane.YES_OPTION) {
					 
				 }	
				 else if (dialogButton == JOptionPane.NO_OPTION) {						 
					 int dialogButton2 =  JOptionPane.showConfirmDialog (null, "Are you our member?","Warning",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					 if (dialogButton2 == JOptionPane.YES_OPTION) {						 
						 
						 MemberLogin memberlogin = null;
						try {
							memberlogin = new MemberLogin();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						 memberlogin.setVisible(true);
					 }
					 else if (dialogButton2 == JOptionPane.NO_OPTION) {					 
						 
						 JFrame f = new JFrame("Payment Screen");
						 PointPanel pointpanel = new PointPanel();
						 getContentPane().setLayout(null);					 
						 
						 JLabel totalamount = new JLabel("Total Amount: ");
						 totalamount.setBounds(10, 54, 164, 23);
						 pointpanel.add(totalamount);
							  
					 	 JTextArea textfieldtotalamount = new JTextArea();
					 	 textfieldtotalamount.setBounds(252, 58, 164, 16);
					 	 textfieldtotalamount.setText(sc.calculateShoppingCart());
					 	 pointpanel.add(textfieldtotalamount);
					 	 
					 	 JButton btnNewButton = new JButton("Pay");
						 btnNewButton.setBounds(165, 215, 106, 23);
						 pointpanel.add(btnNewButton);
						 btnNewButton.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									 
									CreditCart creditcard = new CreditCart();
									creditcard.setVisible(true);
								}
							});
						 
						 f.getContentPane().add(pointpanel);
						 f.setBounds(100, 100, 447, 479);
						 f.setVisible(true);						
					 }					 
				 }
				 //calculate(sc);
			}			
			
		});
		btnConfirm.setBounds(246, 379, 89, 23);
		contentPane.add(btnConfirm);
		
		JLabel lblShoppingList = new JLabel("Shopping List");
		lblShoppingList.setBounds(246, 24, 89, 14);
		contentPane.add(lblShoppingList);
		
		JLabel lblTotalAmount = new JLabel("Total Amount");
		lblTotalAmount.setBounds(246, 281, 89, 14);
		contentPane.add(lblTotalAmount);
		
		
		
	}	
	/*public String calculate(ShoppingCart s) {
		
		String calculate1 = s.calculateShoppingCart();
		return calculate1;
    }*/
}


