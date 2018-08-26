package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class CreateOwnAdventure {
	public static void main(String[] args) {
		int clean = JOptionPane.showOptionDialog(null,
				"Once upon a time, there was a girl who lived in a village. Her father died, and her stepmother made her clean the house everyday. She didn't like to clean, but she ______.",
				"Option 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Do it anyways and hope that things will get better.",
						"Refuse to clean the house because her father had never made her clean." },
				null);
		if (clean == 0) {
			int hope = JOptionPane.showOptionDialog(null, "She did everything her stepmother told her with a good heart and high hopes. One day, the messenger of the king came by. He was inviting every woman in the land to go to the palace for a dance for the prince! The girl's stepmother said she could not go, even though the prince demanded that every maiden go to the ball. The girl should_____",
					"Option 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Sneak out to the ball anyways; the king's order was more important than her stepmother's.", "Obey her stepmother and stay home from the ball." }, null);
			if(hope==0) {
			JOptionPane.showMessageDialog(null, "She sneaks out to the ball and meets the prince. They dance all night long, and they fall in love. Against her stepmother's wishes, they get married and live happily ever after!");
			}
			if(hope==1) {
				JOptionPane.showMessageDialog(null, "Since the girl didn't take her chance, she ended up serving her stepmother for 3 more years. Over the years, the prince went to check on each house to make sure they were following the rules, and he saw the girl! They fell in love, got married, and lived happily ever after!");
			}
		}
		if(clean==1) {
			JOptionPane.showMessageDialog(null, "Since she refused to clean the house, the stepmother turned her out onto the streets. She did not have a good heart and was not willing to help or love those that were a part of her father's life. She journeyed far away, and her stepmother never saw her again.");
		}
	}
}
