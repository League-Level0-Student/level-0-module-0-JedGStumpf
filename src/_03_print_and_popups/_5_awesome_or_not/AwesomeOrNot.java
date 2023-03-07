package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.*;

public class AwesomeOrNot {
	
	public static void main(String[] args) {
	
	JFrame frame = new JFrame("");
	frame.setSize(0, 0);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);

	// 1. Make a main method that includes everything below

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int wholeInt = ran.nextInt(4);
		
	
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
//		wholeInt = ran.nextInt(4);
	
		// 3. Print your variable to the console
		System.out.println(wholeInt);
	
		// 4. Get the user to enter something that they think is awesome
		String prompt = "What is something Awesome?";
		String awesome = JOptionPane.showInputDialog(null, prompt);
	
		// 5. If your variable is  0
		if (wholeInt == 0){
			JOptionPane.showMessageDialog(null, awesome + " is Awesome!");
		} else if (wholeInt ==1) {
			JOptionPane.showMessageDialog(null, awesome + " is ok.");
		} else if (wholeInt == 2) {
			JOptionPane.showMessageDialog(null, awesome + " is boring");
		} else {
			JOptionPane.showMessageDialog(null, awesome + " needs another look.");
		}
	
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).
	}
}
