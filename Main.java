import java.util.*;
import java.io.*;
import javax.swing.*;

public class Main {

	//arraylist of all events
	static ArrayList<Event> events = new ArrayList<Event>();

	public static void main (String args[])throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.print("Player Name: ");
		final Player player = new Player(console.nextLine());
		parseEvents();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Board board = new Board(player, events);
				board.setVisible(true);
			}
		});
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
			for (int i=1; i<36; i++){
				z = Integer.parseInt(input.next());
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

				//one = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
				//two = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
				//three = new Option(input.nextLine(), input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() );
				events.add( new Event(title, one, two, three, req) );

					if(i!=35){
					y=input.nextLine();
					y=input.nextLine();
				}
			}
	}
}
