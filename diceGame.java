import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		int computerScore = 0;
		int playerScore = 0;
		int turnCounter = 0;
		String word;
		Scanner toRoll = new Scanner(System.in);
		Cup cup = new Cup();
		
		System.out.println("Computer goes first...\n");
		
		//Computers turn
		while (cup.one.getFaceValue() != 1 && cup.two.getFaceValue() != 1 && turnCounter < 100) {
			cup.rollDice(cup.one, cup.two);
			computerScore = cup.getDiceSum(cup.one, cup.two);
			turnCounter++;
		}
		
		//Calculates/prints computers total
		System.out.print("Their ");
		cup.toString();
		computerScore = cup.getTotal();
		cup.setValue(0, 0, 0);
		turnCounter = 0;
		
		System.out.println("Your turn. Enter 'r' to roll the dice or 'q' to quit.");
		
		//Players turn
		while (cup.one.getFaceValue() != 1 && cup.two.getFaceValue() != 1 && turnCounter < 100 ) {
			word = toRoll.next();
			
			if (word.equals("r")) {
				cup.rollDice(cup.one, cup.two);
				playerScore = cup.getDiceSum(cup.one, cup.two);
				turnCounter++;
				cup.one.toString();
				cup.two.toString();
			}else if (word.equals("q")) {
				System.out.println("Game has been quit.\n");
				System.exit(0);
			}else{
				System.out.println("Not a valid command.");
			}
		}
		
		//Calculates/prints players total.
		playerScore = cup.getTotal();
		System.out.print("Your ");
		cup.toString();
		
		//Final outcome of who wins the game
		if (playerScore > computerScore) {
			System.out.println("You win!");
		}else if (playerScore < computerScore) {
			System.out.println("You lose.");
		}else{
			System.out.println("It's a tie.");
		}
	}
}
