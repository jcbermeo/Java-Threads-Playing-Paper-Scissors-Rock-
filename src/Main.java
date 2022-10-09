import java.util.Random;
import java.util.Scanner;

// Welcome to my first approach of AI 

// This program consists of using two java threads on playing Rock, Scissors and Paper 

public class Main {
	
	static Random dice = new Random();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		
		mainMenu(); 
	
	}
	
	private static void mainMenu() throws InterruptedException {
		System.out.println("\nPlease Input a Number and press enter");
		int variable = 0; 
		System.out.println("1) Watch two objects play\n2) Read the Rules\n3) About the Developer\n0) Exit Game");
		String option = scanner.next(); 

		switch (option) {
			case "1":
				startGame();
				break; 
			case "2":
			// Display the Rules
				break; 
			case "3":
			// Display your biography and social media
				break;
			case "4":
			// exit game 
				System.out.println("Thank you come again :)\nby. Juan C. Bermeo");
				System.exit(0);
				
			default:
				System.out.println("Try Again :( ");
		}
			
	}
	private static void startGame() throws InterruptedException {
		Player1 player1 = new Player1();
		Player2 player2 = new Player2();
		
		System.out.println("Game started!");
		
		player1.start();
		player2.start();
		
		player1.setTurn(getRandomTurn());
		
		if(player1.getTurn() == true) {
			//player2.interrupt();
			System.out.println("Player 1 goes First");
			player1.setGameObject(getRandomObject());
			System.out.println("Player 1 got: " + player1.getGameObject());
				player1.sleep(3* 1000);
			player2.setGameObject(getRandomObject());
			System.out.println("Player 2 got: " + player2.getGameObject());
		}
		else {
			System.out.println("Player 2 goes First");
			//player1.interrupt();
			player2.setGameObject(getRandomObject());
			System.out.println("Player 2 got: " + player2.getGameObject());
				player2.sleep(3* 1000);
			player1.setGameObject(getRandomObject());
			System.out.println("Player 1 got: " + player1.getGameObject());
			
		}
		
		if(player1.getGameObject() != player2.getGameObject()) {
			
			if(player1.getGameObject() == "SCISSORS" && player2.getGameObject() == "PAPER") {
				System.out.println("Player 1 Wins!");
			}
			if(player2.getGameObject() == "SCISSORS" && player1.getGameObject() == "PAPER") {
				System.out.println("Player 2 Wins!");
				
			}
			if(player1.getGameObject() == "ROCK" && player2.getGameObject() == "PAPER") {
				System.out.println("Player 2 Wins!");
			}
			if(player2.getGameObject() == "ROCK" && player1.getGameObject() == "PAPER") {
				System.out.println("Player 1 Wins!");
	
			}
			if(player1.getGameObject() == "PAPER" && player2.getGameObject() == "SCISSORS") {
				System.out.println("Player 2 Wins!");
			
			}
			if(player2.getGameObject() == "PAPER" && player1.getGameObject() == "SCISSORS") {
				System.out.println("Player 1 Wins!");
		
			}
			if(player1.getGameObject() == "SCISSORS" && player2.getGameObject() == "ROCK") {
				System.out.println("Player 2 wins!");
		
			}
			if(player2.getGameObject() == "SCISSORS" && player1.getGameObject() == "ROCK") {
				System.out.println("Player 1 wins!");
			}
		}
		else {
			System.out.println("=== DRAW ===");
		}
		
	}
	
	// How to ensure Mutual Exclusion?
	
	// Based on the turn of the player (if true then set the other one to false) 
	
	private static String getRandomObject() {
		
		String options[] = {"SCISSORS", "PAPER", "ROCK"};
		
		int number; // Store the output of the Random()
		number = 0+dice.nextInt(3);	// Dice between 1 to 3
		
		return options[number];
	}
	
	private static boolean getRandomTurn() {
		int options[] = {1, 0};
		
		int ranNumber; // Store the output of the Random()
		int optionNum;
		
		optionNum = 0+dice.nextInt(1);	
		
		ranNumber = options[optionNum];
		
		if(ranNumber == 1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	private static void scissorFigure() {
		System.out.println("SCISSORS");
	}
	private static void paperFigure() {
		System.out.println("PAPER");
	}
	private static void rockFigure() {
		System.out.println("ROCK");
	}

}
