

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PointFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PointFrame frame = new PointFrame();
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
	public PointFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_amount = new JLabel("Alisveris Tutari:");
		label_amount.setBounds(49, 41, 300, 34);
		contentPane.add(label_amount);
		
		
		JLabel label_point = new JLabel("Hesaptaki toplam puan:");
		label_point.setBounds(49, 106, 300, 34);
		contentPane.add(label_point);
		
		JLabel label_lastamount = new JLabel("Puan kullanimi sonrasi alisveris tutari");
		label_lastamount.setBounds(49, 169, 300, 34);
		contentPane.add(label_lastamount);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(151, 243, 89, 23);
		contentPane.add(btnConfirm);  
	}

}

