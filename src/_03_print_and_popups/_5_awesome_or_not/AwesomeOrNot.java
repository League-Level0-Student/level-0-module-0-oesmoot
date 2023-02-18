package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
		
	
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int random = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		
		// 3. Print your variable to the console
	System.out.println(random);
		// 4. Get the user to enter something that they think is awesome
		String thingy = JOptionPane.showInputDialog("tell me something you think is awesome");
		// 5. If your variable is  0
	if (random == 0) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, "That's awesome!"); }
		// 6. If your variable is  1
	if (random == 1) {
			// -- tell the user whatever they entered is OK.
	JOptionPane.showMessageDialog(null, "that's ok."); }
		// 7. If your variable is  2
	if (random == 2) {
			// -- tell the user whatever they entered is boring.
	JOptionPane.showMessageDialog(null, "thats BORING."); }
		// 8. If your variable is  3
	if (random == 3) {
			// -- invent your own message to give to the user (be nice).
		JOptionPane.showMessageDialog(null, "you are an epok gamer"); }
	}
}
