package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
	String birthday= JOptionPane.showInputDialog("what's your birthday?");
		if (birthday.equals("3-9-2021")) {
			JOptionPane.showMessageDialog(null, "!HAPPY BIRTHDAY!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "!HAVE A GOOD DAY!");
		}
		
	}
}
