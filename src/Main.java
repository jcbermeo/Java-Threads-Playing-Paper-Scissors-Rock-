import java.util.Random;
import java.util.Scanner;

// Welcome to my first approach of AI 

// This program consists of using two java threads on playing Rock, Scissors and Paper 

public class Main {
	
	static Random dice = new Random();
	static Scanner scanner = new Scanner(System.in);
	static String playerName; 
	static int countPlayer = 1; 
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome to Scissors Paper Rock!\nby Juan C. Bermeo");
		mainMenu(); 
	
	}
	
	private static void mainMenu() throws InterruptedException {
		System.out.println("\nPlease Input a Number and press enter");
		int variable = 0; 
		System.out.println("1) Start Game\n2) About the Software\n3) Exit Game");
		String option = scanner.next(); 

		switch (option) {
			case "1":
				startGame();
				break; 
			case "2":
				aboutSoftware();
				break;
			case "3":
			// exit game 
				System.out.println("Thank you come again :)\nby. Juan C. Bermeo");
				System.exit(0);
				
			default:
				System.out.println("Try Again :( ");
		}
			
	}
	private static void startGame() throws InterruptedException {
		
		countPlayer = 1;
		Player1 player1 = new Player1();
		Player2 player2 = new Player2();
		
		player1.setName(setPlayerName());
		player2.setName(setPlayerName());
		
		player1.start();
		player2.start();
		
		System.out.println("\n** GAME STARTED **");
		
		player1.setTurn(getRandomTurn());
		
		if(player1.getTurn() == true) {
			System.out.println(player1.getName() + " goes First");
			// Player 1
			System.out.println("... " +player1.getName() + " is thinking*"); 
				player1.sleep(getRandomTime() * 1000);
				player1.setGameObject(getRandomObject());
			System.out.println(player1.getName() + " chose: " + player1.getGameObject());
			
			// Player 2 
			System.out.println("... " +player2.getName() + " is thinking*"); 
				player2.sleep( getRandomTime() * 1000);
				player2.setGameObject(getRandomObject());
			System.out.println(player2.getName() + " chose: " + player2.getGameObject());
		}
		else {
			System.out.println(player1.getName() + " goes First");
			
			// Player 2
			System.out.println("... " +player2.getName() + " is thinking*"); 
				player2.sleep(getRandomTime() * 1000);
				player2.setGameObject(getRandomObject());
			System.out.println(player2.getName() + " chose: " + player2.getGameObject());
			
			// Player 1
			System.out.println("... " +player1.getName() + " is thinking*"); 
				player1.sleep( getRandomTime()* 1000);
				player1.setGameObject(getRandomObject());
			System.out.println(player1.getName() + " chose: " + player1.getGameObject());
			
		}
		
		if(player1.getGameObject() != player2.getGameObject()) {
			
			if(player1.getGameObject() == "SCISSORS" && player2.getGameObject() == "PAPER") {
				System.out.println("** "+  player1.getName() + " Wins! **");
				playAgainMenu();
			}
			if(player2.getGameObject() == "SCISSORS" && player1.getGameObject() == "PAPER") {
				System.out.println("** "+player2.getName() + " Wins!");
				playAgainMenu();
				
			}
			if(player1.getGameObject() == "ROCK" && player2.getGameObject() == "PAPER") {
				System.out.println("** "+player2.getName() + " Wins!");
				playAgainMenu();
			}
			if(player2.getGameObject() == "ROCK" && player1.getGameObject() == "PAPER") {
				System.out.println("** "+  player1.getName() + " Wins! **");
				playAgainMenu();
	
			}
			if(player1.getGameObject() == "PAPER" && player2.getGameObject() == "SCISSORS") {
				System.out.println("** "+player2.getName() + " Wins!");
				playAgainMenu();
			}
			if(player2.getGameObject() == "PAPER" && player1.getGameObject() == "SCISSORS") {
				System.out.println("** "+  player1.getName() + " Wins! **");
				playAgainMenu();
		
			}
			if(player1.getGameObject() == "SCISSORS" && player2.getGameObject() == "ROCK") {
				System.out.println("** "+player2.getName() + " Wins!");
				playAgainMenu();
		
			}
			if(player2.getGameObject() == "SCISSORS" && player1.getGameObject() == "ROCK") {
				System.out.println("** "+  player1.getName() + " Wins! **");
				playAgainMenu();
			}
		}
		else {
			System.out.println(" *** DRAW GAME *** ");
			playAgainMenu();
			
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
	private static int getRandomTime() {
		
		// Random number between 0 and 10
		
		int number = 0;
		
		number = 0+dice.nextInt(10);	
		
		return number;
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
	
	private static String setPlayerName() {
		
		System.out.println("Set player "+ countPlayer++ +" name: ");
			playerName = scanner.next();
		return playerName; 
		
	}
	
	private static void playAgainMenu() throws InterruptedException {

		System.out.println("\nPlay Again?\n1) Yes\n2) Main Menu\n3) Exit");
		String againOption = scanner.next();
			switch (againOption) {
				case "1":
					startGame();
					break; 
				case "2":
					mainMenu();
					break; 
				case "3":
					System.out.println("Thank you come again :)\nby. Juan C. Bermeo");
					System.exit(0);
				break;
			
			default:
				System.out.println(againOption + " not in the Options");
		}
	}
	
	private static void aboutSoftware() throws InterruptedException {	
		System.out.println("Explanation goes here");
		mainMenu();
	}
	
}
