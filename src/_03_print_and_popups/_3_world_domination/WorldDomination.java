package _03_print_and_popups._3_world_domination;


import javax.swing.*;

public class WorldDomination {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("");
		frame.setSize(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		String prompt = "Do you know how to write code?";
		// 1. Ask the user if they know how to write code.
//		JOptionPane.showMessageDialog(null, prompt);
		
		String codeMuch = JOptionPane.showInputDialog(null, prompt);
		// 2. If they say "yes", tell them they will rule the world.
		String reply;
		
		if (codeMuch.equals("yes")) {
			reply = "You Will Rule The World!!!";
			
		}else {
			reply = "Sign up for classes at The League";
		}
		JOptionPane.showMessageDialog(null, reply);

		
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

