/**********************************
 * CIS 433 Fall, 2015 - Section 50
 * Homework #1 - Dice game
 * NAME: James Saporito
 * CSU ID: 2614539
 * DATE & Time: 9/2/15
 **********************************/

import java.util.Random;

public class Die {
	
	private int faceValue;
	final int MAX = 6;
	
	public Die() {
		
	}
	
	//Generates a number between 1 and 6 and sets faceValue
	public int roll() {
		Random random = new Random();

		setFaceValue(random.nextInt((MAX-1) +1) + 1);
	
		return faceValue;
	}
	
	public void setFaceValue(int x) {
		faceValue = x;
	}
	
	public int getFaceValue() {
		return faceValue;
	}

	public String toString() {
		String a = "You rolled a "+ faceValue;
		System.out.println(a);
		return a;
	}
	
	public boolean equals(Die x) {
		if (x.faceValue == faceValue) {
			return true;
		}else{
			return false;
		}
	}
}
