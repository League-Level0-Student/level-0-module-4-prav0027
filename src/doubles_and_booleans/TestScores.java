package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog("What is your test score?");
	double score = Double.parseDouble(question);
	if(score>85.00) {
		JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
	}
	if(score<85.00&&score>70.00) {
		JOptionPane.showMessageDialog(null, "You should study more next time!");
	}
	if(score<70.00) {
		JOptionPane.showMessageDialog(null, "Better luck next time!");
	}
}
}
