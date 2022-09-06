

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberPointPanel extends JPanel {
	private JTextField textField_points;
	private JTextField textField_amount;
	private JTextField textField_totalamount;

	/**
	 * Create the panel.
	 */
	public MemberPointPanel() {
		setLayout(null);
		
		JLabel lblYourPoints = new JLabel("Your Points:");
		lblYourPoints.setBounds(10, 42, 115, 14);
		add(lblYourPoints);
		
		JLabel lblYourAmount = new JLabel("Your Amount:");
		lblYourAmount.setBounds(10, 114, 115, 14);
		add(lblYourAmount);
		
		/*textField_points = new JTextField();
		textField_points.setEditable(false);
		textField_points.setBounds(190, 39, 86, 20);
		add(textField_points);
		textField_points.setColumns(10);
		
		textField_amount = new JTextField();
		textField_amount.setBounds(190, 111, 86, 20);
		add(textField_amount);
		textField_amount.setColumns(10);*/
		
		JLabel lblYourTotalAmount = new JLabel("Your Total Amount:");
		lblYourTotalAmount.setBounds(10, 192, 115, 14);
		add(lblYourTotalAmount);
		
		/*textField_totalamount = new JTextField();
		textField_totalamount.setBounds(190, 189, 86, 20);
		add(textField_totalamount);
		textField_totalamount.setColumns(10);*/
		
		/*JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(190, 248, 89, 23);
		add(btnConfirm);*/

	}

}

