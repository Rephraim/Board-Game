import java.util.*;
import java.io.*;

public class Main {

	//arraylist of all events
	ArrayList<Event> events = new ArrayList<Event>();

	public static void main (String args[])throws FileNotFoundException {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Player Name: ");
		Player player = new Player(console.nextLine());
		parseEvents();
		Board board = new Board(player, events);
	}

	//parse in all events as objects into arrayist events
	
	public void parseEvents() throws FileNotFoundException{
		File file = new File("InputFile.txt");
		Scanner input = new Scanner(file);
		Event e;
		Option one;
		Option two;
		Option three;
		String y; //filler
		String title;
		boolean req=true;

		events.add(null);
		while (input.hasNextLine()) {
			for (int i=1; i<36; i++){
				title = input.nextLine();
				y = input.nextLine(); //for ref on txt file, not needed
				
				if (y.equals("N"))
					req=false;
			
				one = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
				two = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
				three = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
				events.add( new Event(title, one, two, three, req) );
			}
		}
	}
}
