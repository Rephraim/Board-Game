import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LastSquare extends JFrame {
  	private Player p;
  
  	public LastSquare(Player player) {
		p = player;
		super ("Finale");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildWindow();
		setVisible(true);
  	}
	
	private void buildWindow() {
		JPanel mainPanel = new JPanel();
		JLabel description = new JLabel("You made it! You finished senior year, but did you graduate?");
		JLabel aa = new JLabel("Tardies: " + p.getTardies());
		if (p.getTardies() < 10) {
		  JLabel a = new JLabel("Wow, what kind of senior are you?");
		} else if (p.getTardies() < 20) {
		  JLabel a = new JLabel("You have to attend one of those Tardy Intervention things… But I guess it could be worse.");
		} else {
		  JLabel a = new JLabel("Sorry dude, they’re not letting you walk at graduation because of your horrendous attendance record.");
		}
		JLabel ba = new JLabel("Money: " + p.getMoney());
		if (p.getMoney() < 10) {
		  JLabel b = new JLabel("You have literally no money. Maybe you should drop college for a garbage-truck-driving job. I heard they pay pretty well.");
		} else if (p.getMoney() < 30) {
		  JLabel b = new JLabel("Goodbye carefree teenage years, hello college loans. Make sure to stock up on ramen.");
		} else if (p.getMoney() < 50) {
		  JLabel b = new JLabel("You’ll get through college okay, but grad school may be an issue...");
		} else {
		  JLabel b = new JLabel("Pfffft, loans?  You’re loaded!");	
		}
		JLabel ca = new JLabel("Happiness: " + p.getHappiness());
		if (p.getHappiness() < 10) {
		  JLabel c = new JLabel("You cry yourself to sleep every night while scrolling through Tumblr.");
		} else if (p.getMoney() < 30) {
		  JLabel c = new JLabel("You wonder what you’re doing with your life, but console yourself with steamed meat buns.");
		} else if (p.getMoney() < 50) {
		  JLabel c = new JLabel("Life is swell, but the future scares the soles off your feet.");
		} else {
		  JLabel c = new JLabel("A+ for having an awesome life. #yoloswag");	
		}
		JLabel da = new JLabel("Academics: " + p.getAcademics());
		if (p.getAcademics() < 25) {
		  JLabel d = new JLabel("You don’t have enough units to graduate. I guess you have to go through the fire again….");
		} else if (p.getAcademics() < 50) {
		  JLabel d = new JLabel("You get rescinded! Ohlone should be accepting more students.");
		} else {
		  JLabel d = new JLabel("Good job, you graduated!");	
		}
		mainPanel.add(description);
		mainPanel.add(aa);
		mainPanel.add(a);
		mainPanel.add(ba);
		mainPanel.add(b);
		mainPanel.add(ca);
		mainPanel.add(c);
		mainPanel.add(da);
		mainPanel.add(d);
		if (p.getAcademics() >= 25) {
			JLabel yes = new JLabel("Congratulations!");
			mainPanel.add(yes);
		}
		add(MainPanel);
	}
}
