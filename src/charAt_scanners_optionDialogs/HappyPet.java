package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	static int happiness = 0;
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		int CUDDLE = 0;
		int WALK = 1;
		int GROOM = 2;
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=-0; i<5; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your "+ pet+ " happy?", "Happy "+ pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "take a walk", "groom" }, null);
			
			// 5. Use user input to call the appropriate method created in step 4
			if(task==CUDDLE) {
				cuddle();
			}
			if(task == WALK) {
				walk();
			}
			if(task==GROOM) {
				groom();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

if(happiness>30) {
	JOptionPane.showMessageDialog(null, "Congratulations! You love your pet and your pet loves you!");
	break;
}


		}
	}


	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void cuddle() {
	JOptionPane.showMessageDialog(null, "Your pet falls asleep happily!");
	happiness=happiness+10;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happiness);
	}
	static void walk() {
		JOptionPane.showMessageDialog(null, "Your pet loved the walk!");
		happiness=happiness+7;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happiness);
	}
	static void groom() {
		JOptionPane.showMessageDialog(null, "Your pet feels very loved now!");
		happiness=happiness+9;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happiness);
	}
}