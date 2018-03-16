package adventure;

import java.util.ArrayList;
import java.util.Scanner;

public class Grid {
	
	
	
	public void  method(Player maincharacter, Treasure treasure) {
		
	
	
	int arrayMain[][] = new int [10] [10];
	
	//ro
	for( int rows = 0; rows<arrayMain.length; rows++) {
	//columns
		
	
	arrayMain[maincharacter.getPositionx()][maincharacter.getPositiony()] = 1;
	arrayMain[treasure.getPositionx()][treasure.getPositiony()] = 8;
	
	System.out.println();
	for (int columns = 0; columns<arrayMain.length; columns++) {
	System.out.print(arrayMain [rows] [columns] );	
	
	}
	}
	
	}
	
	
	
	
	
	
	
	}
	

	
	

	



	

