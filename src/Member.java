
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Member {

	private String nameSurname, phoneNumber, emailAdress, gender, address;
	String age;
	private String password;
	public int point;
	public int counter = 0;
	public static String members[][];
	private String splittedmembers[];
	static int count = 0;
	

	public Member(String nameSurname, String phoneNumber, String emailAdress, String gender, String address,
			String age, String password) {
		// super();

		this.nameSurname = nameSurname;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.password = password;
	}

	public Member() {
	}

	public void readFile() throws FileNotFoundException {

		members = new String[10][10];
		splittedmembers = new String[10];
		// dosya okuma iþlemleri
		File file = new File("Members.txt");
		Scanner sc = new Scanner(file);
		String str ="";
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			str = str.toLowerCase();
			splittedmembers = str.split(",");
			members[count] = splittedmembers;
			count++;
		}
		sc.close();

	}
	public void addMember(Member m1) {

		members[count][0]=String.valueOf(1000+count);
		members[count][1]=m1.nameSurname;
		members[count][2]=m1.phoneNumber;
		members[count][3]=m1.emailAdress;
		members[count][4]=m1.gender;
		members[count][5]=m1.address;
		members[count][6]=m1.age;
		members[count][7]=m1.password;
		members[count][8]="0";
		count++;
	}

	public boolean checkingMember(String input, String inputPassword) {
		// kullanýcý bilgileri kontolü
		boolean correct = false;
		counter = count;
		/////////////////////////////// validation check
		for (int i = 0; i < count; i++) {
			if (((input.equals(members[i][1]) || (input == members[i][3])))) {
				if ((inputPassword.equals(members[i][7]))) {

					correct = true;
				}
			}

		}
		if(correct==true) {
			
			String message = "Valid Login";
			JOptionPane.showMessageDialog(null, message);
			//System.out.println("Valid Login");
			return true;
		}
		else {
			
			String message = "Invalid Login";
			JOptionPane.showMessageDialog(null, message);
			//System.out.println("Invalid Login");
			return false;
		}
		

	}

	public void addPointToMember(String ID, double gainedpoint, String usingPoint) {
		double point;
		for (int i = 0; i < count; i++) {
		    if(ID.equals(members[i][0])) {
		    	if(usingPoint.equals("yes"))
		    	members[i][8]=Double.toString(gainedpoint);
		    	else {
		    		point=Double.valueOf(members[i][8])+gainedpoint;
		    		members[i][8]=Double.toString(point);
		    	}
		    }

		}

	}

	public int point(String memberID) {

		for (int i = 0; i < counter; i++) {
			if (memberID == members[i][0]) {
				point =Integer.parseInt((members[i][8]));
			}
		}
		return point;
	}
	
	public String getMemberID(String s, String password) {
		String ID = null;
		for (int i = 0; i < count; i++) {
			if (((s.equals(members[i][1]) || s == members[i][3]))) {
				if ((password.equals(members[i][7]))) {

					ID=members[i][0];
				}
			}

		}
		return ID;
		
	}
	
	public void addToFile() throws IOException {
		File file = new File("Members.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file);
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < 9; j++) {
				if(j!=8)
				writer.write(members[i][j] + ",");		
				else 
					writer.write(members[i][j] + System.getProperty("line.separator"));
			}
		}
		writer.flush();
		writer.close();
	}

}
