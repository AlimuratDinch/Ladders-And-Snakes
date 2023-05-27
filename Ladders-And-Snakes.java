import java.util.Scanner;



public class LadderAndSnake {
	/** Defining the start as a 0
	 * Defining the variablesPlayer 1 and Player 2 
	 * 
	 */
    int start = 0;     //starting point outside of the box
    int player1;
    int player2;
    /**
     * This is default constructor that takes initialize player 1 and player 2 as a value of 0
     */
    LadderAndSnake(){  //default constructor that brings the players to the start
		player1 = 0;
		player2 = 0;
	}
   
   
	/**
	 * This method gives a random number from 1 to 6
	 * @return integer from 1 to 6
	 */
    public int flipDice() {      //flip dice method
		double randomNumber = Math.random()*6+1;                  //gives a float number between 1 and 7
		int flooredRandomNumber = (int) Math.floor(randomNumber);  //gives an integer of the range 1-6
		return flooredRandomNumber;
	}
    /**
     * This method decides who will start first by comparing the dice value from flip dice level, the players roll the dice
     * till one player gets high value than the other player.
     * It starts by asking the user by how many people this game will be played, since there can be only
     * 2 people eligible to player, if the user input is not 2, the system will automatically assign it to 2.
     */
    public void start() {
    	System.out.println("Welcome to Ladder And Snake game"); //should be included at the beginning
    	System.out.print("Please, enter the number of players: ");
    	Scanner input = new Scanner(System.in);
        int numberOfPlayers = input.nextInt();
        
        if((numberOfPlayers != 2)) {
        	System.out.println("\nSorry, the game can be only played by 2 players\nSo lets play with 2 player!");
        	numberOfPlayers = 2;   //setting a variable of 2 players
        }
        else {
        	System.out.println("Good choice, now let's start the game!");
        	System.out.println("\nFor simplicity Player 1 will be called P1 and Player will be called P2");
        }
         System.out.println("To choose who starts first, let's throw a dice");  //deciding who starts
    	 
    	 
    	 
         boolean sentinel = true;
         while(sentinel){
         	System.out.print("\nP1 flip a dice by entering 1: ");
         	int p1_turn = input.nextInt(); //player 1 rolling a dice
             int p1_output = flipDice();
             System.out.println("The output is " + p1_output);
             System.out.print("P2 flip a dice by entering 2: ");
             int p2_turn = input.nextInt(); //player 2 rolling a dice
             int p2_output = flipDice();
             System.out.println("The output is " + p2_output);
             
         if(p1_output > p2_output) {
              System.out.println("\nP1 starts");
              sentinel = false;
            }
         else if(p1_output < p2_output) {
         	 System.out.println("\nP2 starts");
         	 sentinel = false;
            }
         else {
         	System.out.println("It is a tie! Let's start again");
         }
         
         }
    }
    /**
     * This method gives the maid objective of the game. It moves the player from one cell to another by ladder or snakes
     * This method will change the player1 and player2 (that are integers) to another integer that cannot be determined by a dice
     * If the player goes to the cell indicated by a ladder, he will go to the top of that ladder
     * If the player goes to the snake head, he will go to its tail
     * This method is implemented by comparing player values and assigning new values to them appropriately. 
     */
    
    public void SnakesOrLadders() {
    	
    	if(player1 == 1) { //ladders
    		player1 = 38;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 4) {
    		player1 = 14;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 9) {
    		player1 = 31;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 21) {
    		player1 = 42;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 28) {
    		player1 = 84;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 36) {
    		player1 = 44;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 51) {
    		player1 = 67;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 71) {
    		player1 = 91;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 80) {
    		player1 = 100;
    		System.out.println("It is a ladder, Player 1 possition is on " + player1 + " cell now!");
    	}
    	
    	if(player1 == 16) { //Snakes
    		player1 = 6;
    		System.out.println("It is a Snake, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 48) { 
    		player1 = 30;
    		System.out.println("It is a Snake, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 64) { 
    		player1 = 60;
    		System.out.println("It is a Snake, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 79) { 
    		player1 = 19;
    		System.out.println("It is a Snake, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 93) { 
    		player1 = 68;
    		System.out.println("It is a Snake, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 95) { 
    		player1 = 24;
    		System.out.println("It is a Snake, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 97) { 
    		player1 = 76;
    		System.out.println("It is a Snake, Player 1 possition is on " + player1 + " cell now!");
    	}
    	else if(player1 == 98) { 
    		player1 = 78;
    		System.out.println("It is a Snake, Player 1 possition is on " + player1 + " cell now!");
    	}
    	
    	
    	if(player2 == 1) { //ladders
    		player2 = 38;
    		System.out.println("It is a ladder, Player 2 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 4) {
    		player1 = 14;
    		System.out.println("It is a ladder, Player 2 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 9) {
    		player2 = 31;
    		System.out.println("It is a ladder, Player 2 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 21) {
    		player2 = 42;
    		System.out.println("It is a ladder, Player 2 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 28) {
    		player2 = 84;
    		System.out.println("It is a ladder, Player 2 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 36) {
    		player2 = 44;
    		System.out.println("It is a ladder, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 51) {
    		player2 = 67;
    		System.out.println("It is a ladder, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 71) {
    		player1 = 91;
    		System.out.println("It is a ladder, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 80) {
    		player2 = 100;
    		System.out.println("It is a ladder, Player 1 possition is on " + player2 + " cell now!");
    	}
    	
    	if(player2 == 16) { //Snakes
    		player2 = 6;
    		System.out.println("It is a Snake, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 48) { 
    		player2= 30;
    		System.out.println("It is a Snake, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 64) { 
    		player2 = 60;
    		System.out.println("It is a Snake, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 79) { 
    		player2 = 19;
    		System.out.println("It is a Snake, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 93) { 
    		player2 = 68;
    		System.out.println("It is a Snake, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 95) { 
    		player2 = 24;
    		System.out.println("It is a Snake, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 97) { 
    		player2 = 76;
    		System.out.println("It is a Snake, Player 1 possition is on " + player2 + " cell now!");
    	}
    	else if(player2 == 98) { 
    		player2 = 78;
    		System.out.println("It is a Snake, Player 1 possition is on " + player2 + " cell now!");
    	}
    	
    	
   
    }
    /**
     * This is a play method. The most important one of the whole class
     * It initially creates a border by 10 rows and 10 columns
     * It always print the board after one player makes a move 
     * Since the player value will be determined as an integer of the addition of a dice flip or ladder and snake, the players will be shown a P1 for Player1 and P2 for player 2.
     * Therefore, it will print them to their assigned values.
     * Once the player does a move, there is a switcher that controls the other player move.
     * There is a while loop that prints the actual table every single time after a movement has been done.It repeats till one player goes to the cell 100 to win the game
     * 
     */
    public void play() {
    	int[][] Board = new int[10][10]; //creating a board 10x10
    	int boardStart = 1;
    	for (int i = 0; i < 10; i++) {
        	for(int j = 0; j <10;j++) {
        		Board[i][j] = boardStart;
        		boardStart++;
        	}	
        }
		
    	//Scanner input = new Scanner(System.in);
       
    	 boolean switcher = true;
    	 boolean sentinel2 = true;
         
         while(sentinel2 == true) {// works like (player1 != 100) || (player2 != 100)
         
         	SnakesOrLadders(); //switching the moves
         	System.out.println("|----------Ladder And Snakes-----------|");
         	for (int i = 0; i < 10; i++) {    //representing the board
             	
             		for(int j = 0; j <10;j++) {
             
             		   
             			if (Board[i][j] == player1) {
             				System.out.print("|P1|");
             			}
             			else if(Board[i][j] == player2){
             				System.out.print("|P2|");
             			}
             			else if (Board[i][j] < 10) {
                          	System.out.print("|0"+Board[i][j]+"|");
                          }
                         else {
                         	System.out.print("|"+Board[i][j]+"|");
                         }
                 	}
             	
             	
             	System.out.println();
         	}
         
         	int additioner = flipDice();
         	
         	
         	if (switcher) {  //switching between 2 players
         		player1 += additioner;
         		switcher = false;
         
         		if (player1 <100) {
         			System.out.println();
         			System.out.println("Player 1 got a dice value of " + additioner+ ". Right now Player 1 is on "+ player1 + " cell\n");
         		}
         		
         		else if (player1 == 100) { //finishing the game
         			System.out.println("\nPlayer 1 got a dice value of " + additioner+ ". Right now Player 1 is on "+ player1 + " cell");
         			System.out.println("Player 1 won the Game. Congratulations!");
         			sentinel2 = false;
         		}
         		else if (player1 > 100){
         			System.out.println("\nThe game is not over, Player 1 got the value that does not add up to 100\n");
         			player1 -= additioner; //returns to the same cell that it was before
         			
         		}
         		if(player1 == player2) {  //special condition, will bring Player 2 at the beginning
         			System.out.println("Player 1 came to the same cell where Player 1 is. Player 2 moved at the beginning");
         			player2 = 0;
         		}
         		
         	}
         	else if(switcher == false) {
         		player2 += additioner;
         		switcher = true;
         		
         		if(player2 < 100) {
         			System.out.println();
         		    System.out.println("Player 2 got a dice value of " + additioner+ ". Right now Player 2 is on "+ player2 + " cell\n");
         		    }
         		
         		else if (player2 == 100) { //finishing the game
         			System.out.println("\nPlayer 2 got a dice value of " + additioner+ ". Right now Player 2 is on "+ player2 + " cell");
         			System.out.println("Player 2 won the Game. Congratulations!");
         			sentinel2 = false;
         		}
         		else if (player2 > 100){
         			System.out.println("\nThe game is not over, Player 2 got the value that does not add up to 100\n");
         			player2 -= additioner; //returns to the same cell that it was before
         			
         		}
         		if(player2 == player1) {  //special condition, will bring Player 1 at the beginning
         			System.out.println("Player 2 came to the same cell where Player 1 is. Player 1 moved at the beginning");
         			player1 = 0;
         		}
         		
         		
         	}
         	
         	
         	
         	//int a = input.nextInt(); we can use this too see 1 output of a time
         }
    }
   

}
