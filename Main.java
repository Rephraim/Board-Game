import java.util.*;

public class Main {

	static Scanner console=  new Scanner(System.in);

	//arraylist of all events
	static ArrayList<Event> events = new ArrayList<Event>;

	public static void main String(args[]){

		System.out.print("Player Name: ");
		Player player = new Player( console.next() );
		parseEvents();
		Board board = new Board(player, events);
	}

	public int rollDice(){
		return (int)Math.random()*4 + 1;
	}

	//parse in all events as objects into arrayist events
	public void parseEvents(){
			File file = new File("InputFile.txt");
			Scanner input = new Scanner(file);
			Event e=null;
			Option one=null;
			Option two=null;
			Option three=null;
			int x=null; //filler
			String y=null; //filler
			String title=null;
			boolean req=true;

			events.add(null);
			for (int i=1; i<36; i++){
					x = input.nextInt(); //for ref on txt file, not needed
					title = input.nextLine();
					y = input.nextLine(); //for ref on txt file, not needed
					one = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
					two = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
					three = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
					events.add( new Event(title, one, two, three, req) );
			}



	}


}
