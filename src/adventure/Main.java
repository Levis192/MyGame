package adventure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Grid grid = new Grid();
	//Player player = new Player;
	
	Player maincharacter = new Player(4,2);
	Treasure treasure = new Treasure (9,9);
	
	maincharacter.getPositionx();
	treasure.getPositionx();
	
	grid.method(maincharacter, treasure);
	}
	
	public Main(String input) {
		Scanner scanner= new Scanner (System.in);
		switch (input) {
		case "north":
			System.out.println("The player moving up north");
			break;
		case "east":
			System.out.println("The player moving up east" );
			break;
		case "west":
			System.out.println("The player moving up west");
			break;
		case "south":
			System.out.println("The player moving up south"  );
			break;
		default:
			System.out.println("No movememnt ");
			break;
		}
		
		
		
	
	

	
	
	

	}

}
