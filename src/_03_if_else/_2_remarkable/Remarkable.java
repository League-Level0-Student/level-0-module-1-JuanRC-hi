package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

import com.sun.beans.introspect.PropertyInfo.Name;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String remarkable= "You're a truly remarkable teen";
String Dany= "You have remarkable coding skills";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String Name= JOptionPane.showInputDialog("what's your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(Name.equals("Dany")) {
	JOptionPane.showMessageDialog(null, Dany);
}
if (Name.equals("Juan")) {
	JOptionPane.showMessageDialog(null, remarkable);
}
	}
}

