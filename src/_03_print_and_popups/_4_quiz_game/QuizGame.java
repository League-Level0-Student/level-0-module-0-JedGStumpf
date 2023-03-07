package _03_print_and_popups._4_quiz_game;

import javax.swing.*;

public class QuizGame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("");
		frame.setSize(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		String question = "What is my age";
				// 2.  Ask the user a question 
		String prompt = JOptionPane.showInputDialog(null, question);
				
				// 3.  Use an if statement to check if their answer is correct
		if (prompt.equals("44")) {
			score += 1;
		}
		
		JOptionPane.showMessageDialog(null, score);
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
