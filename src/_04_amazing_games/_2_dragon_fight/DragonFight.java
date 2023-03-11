package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		
			// playerHealth to store your health - set it equal to 100
	int playerHealth = 100;
			// dragonHealth to store the dragon's health - set it equal to 100
	int dragonHealth = 100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
			int playerAttack = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
			int dragonAttack = 0;
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
				String attackP = JOptionPane.showInputDialog("attack with yell or kick?");
				// 4. If they typed in "yell":
				if (attackP.equals ("yell")) {
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
					playerAttack = ran.nextInt(10); }
				// 5. If they typed in "kick":
				if (attackP.equals ("kick")) {
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
					playerAttack = ran.nextInt(25);}
				// 6. Subtract the player attack value from the dragon's health
				dragonHealth -= playerAttack;
				
				if (attackP.equals("reprogram")) {
					dragonReprogram();
					}
				
			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
						dragonAttack = ran.nextInt(35);
				// 8. Subtract the dragon attack value from the player's health
						playerHealth-= dragonAttack;
			// ASSESS THE DAMAGE

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
						if (playerHealth <1){
							playerLost();
							}
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
						if (dragonHealth <1) {
							dragonLost(); 
							}
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
							JOptionPane.showMessageDialog(null, "dragon health: "+dragonHealth+", player health: "+playerHealth);}
							
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

			}// this is the end of the while loop

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null, "The dragon has defeated you, he proceeds to tear off all your remaining limbs except "
				+ "for your head, then, he decides to bandage them up, leaving you alive, but completely disabled, his final move "
				+ "is to cast a spell of immortality on you, so you will live on miserably with no penny, as deflation has become a huge problem."
				+ " (the end lol you got the bad ending.)");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null, "YESYESYESYESYESYESYESYESYEYSYEYSYESYESYEYSYESYES!!!!!!! IHAVEAPENNY!!!!! (good ending lol)");
		System.exit(0);   //This code ends the program
	}
	static void dragonReprogram() {
		JOptionPane.showMessageDialog(null, "You type a few lines of code into your computer, and suddenly, the dragon magically dissapears! But you know it wasn't any kind of magic, you reprogrammed it to nonexist! Now the beautiful penny is all yours. (secret ending, good job!)");
		System.exit(0);
	}
	}

