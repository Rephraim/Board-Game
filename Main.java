import java.util.*;
import java.io.*;

public class Main {

	//arraylist of all events
	static ArrayList<Event> events = new ArrayList<Event>();

	public static void main (String args[])throws FileNotFoundException {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Player Name: ");
		Player player = new Player(console.nextLine());
		parseEvents();
		Board board = new Board(player, events);
	}

	//parse in all events as objects into arrayist events
	
	public static void parseEvents() throws FileNotFoundException{
		File file = new File("info2.txt");
		Scanner input = new Scanner(file);
		Event e=null;
		Option one=null;
		Option two=null;
		Option three=null;
		String y=null; //filler
		int z=0;
		String title=null;
		boolean req=true;


		events.add(null);

			//parse in Event objects into arraylist events
			for (int i=1; i<36; i++){
				z = Integer.parseInt(input.next()); //for ref on txt file, not needed
				input.nextLine();
				title = input.nextLine();
				y = input.nextLine(); //for ref on txt file, not needed
				int num=0;

				for(int j=0; j<3; j++){

					String s1=input.nextLine();
					String s2=input.nextLine();

					int i1=Integer.parseInt(input.next());
					int i2=Integer.parseInt(input.next());
					int i3=Integer.parseInt(input.next());
					int i4=Integer.parseInt(input.next());
					input.nextLine();

					//parse in the Option objects
					if (num==0){
						one = new Option(s1, s2, i1, i2, i3, i4);
						num++;
					} else if (num==1){
						two = new Option(s1, s2, i1, i2, i3, i4);
						num++;
					} else {
						three= new Option(s1, s2, i1, i2, i3, i4);
					}
				}

				//parse in the Event objects into arraylist events
				events.add( new Event(title, one, two, three, req) );

				//stop parsing in at the last object
				if(i!=35){
					y=input.nextLine();
					y=input.nextLine();
				}
			}
	}
}
