import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;

public class LastSquare extends JFrame {
  	private Player p;
  
  	public LastSquare(Player player) {
		super("Finale");
		p = player;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildWindow();
		setVisible(true);
  	}
	
	private void buildWindow() {
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(new Insets(15,15,15,15)));
		JLabel description = new JLabel("You made it! You finished senior year, but did you graduate?");
		JLabel aa = new JLabel("Tardies: " + p.getTardies());
		aa.setFont(aa.getFont().deriveFont(Font.BOLD));
		JLabel a = new JLabel("");
		//theLabel.setText("" + num);
		if (p.getTardies() < 10) {
		  a.setText("Wow, what kind of senior are you?");
		} else if (p.getTardies() < 20) {
		  a.setText("You have to attend one of those Tardy Intervention things… But I guess it could be worse.");
		} else {
		  a.setText("Sorry dude, they’re not letting you walk at graduation because of your horrendous attendance record.");
		}
		JLabel ba = new JLabel("Money: " + p.getMoney());
		ba.setFont(ba.getFont().deriveFont(Font.BOLD));
		JLabel b = new JLabel("");
		if (p.getMoney() < 10) {
		  b.setText("You have literally no money. Maybe you should drop college for a garbage-truck-driving job. I heard they pay pretty well.");
		} else if (p.getMoney() < 30) {
		  b.setText("Goodbye carefree teenage years, hello college loans. Make sure to stock up on ramen.");
		} else if (p.getMoney() < 50) {
		  b.setText("You’ll get through college okay, but grad school may be an issue...");
		} else {
		  b.setText("Pfffft, loans?  You’re loaded!");	
		}
		JLabel ca = new JLabel("Happiness: " + p.getHappiness());
		ca.setFont(ca.getFont().deriveFont(Font.BOLD));
		JLabel c = new JLabel("");
		if (p.getHappiness() < 10) {
		  c.setText("You cry yourself to sleep every night while scrolling through Tumblr.");
		} else if (p.getMoney() < 30) {
		  c.setText("You wonder what you’re doing with your life, but console yourself with steamed meat buns.");
		} else if (p.getMoney() < 50) {
		  c.setText("Life is swell, but the future scares the soles off your feet.");
		} else {
		  c.setText("A+ for having an awesome life. #yoloswag");	
		}
		JLabel da = new JLabel("Academics: " + p.getAcademics());
		da.setFont(da.getFont().deriveFont(Font.BOLD));
		JLabel d = new JLabel("");
		if (p.getAcademics() < 25) {
		  d.setText("You don’t have enough units to graduate. I guess you have to go through the fire again….");
		} else if (p.getAcademics() < 50) {
		  d.setText("You get rescinded! Ohlone should be accepting more students.");
		} else {
		  d.setText("Good job, you graduated!");	
		}
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
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
			yes.setFont(yes.getFont().deriveFont(Font.BOLD));
			mainPanel.add(yes);
		}
		add(mainPanel);
		setSize(300,200);
		setLocationRelativeTo(null);
	}
}
