package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle= JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
if (riddle.equals("A candle")) {
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
	JOptionPane.showMessageDialog(null,"correct!");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
	else {
		JOptionPane.showMessageDialog(null,"wrong(A candle)");
	}
JOptionPane.showMessageDialog(null, score);
		// 6. Add some more riddles
String riddle2= JOptionPane.showInputDialog(null, "Who makes it, has no need of it."
		+"Who buys it, has no use for it."
		 +"Who uses it can neither see nor feel it."
		+ "What is it?");
if (riddle2.equals("A coffin")){
	
	JOptionPane.showMessageDialog(null,"correct!");
	score++;	
}

else {
	JOptionPane.showMessageDialog(null,"wrong(A coffin)");
}		
	
JOptionPane.showMessageDialog(null, score);

	}
	
}
		
	
	


