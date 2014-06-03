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
		if (p.getTardies() < 10) {
		  JLabel a = new JLabel("Wow, what kind of senior are you?");
		} else if (p.getTardies() < 20) {
		  JLabel a = new JLabel("You have to attend one of those Tardy Intervention things… But I guess it could be worse.");
		} else {
		  JLabel a = new JLabel("Sorry dude, they’re not letting you walk at graduation because of your horrendous attendance record.");
		}
		if (p.getMoney() < 10) {
		  JLabel b = new JLabel("You have literally no money. Maybe you should drop college for a garbage-truck-driving job. I heard they pay pretty well.");
		} else if (p.getMoney() < 30) {
		  JLabel b = new JLabel("Goodbye carefree teenage years, hello college loans. Make sure to stock up on ramen.");
		} else {
		  JLabel b = new JLabel("Sorry dude, they’re not letting you walk at graduation because of your horrendous attendance record.");
		}
		JLabel b = new JLabel(d2.getDescrip);
		JLabel c = new JLabel(d3.getDescrip);
		option1 = new JButton("A");
		option1.addActionListener(new abuttonListener);
		option2 = new JButton("B");
		option1.addActionListener(new bbuttonListener);
		option3 = new JButton("C");
		option1.addActionListener(new cbuttonListener);
		mainPanel.add(description);
		mainPanel.add(a);
		mainPanel.add(b);
		mainPanel.add(c);
		mainPanel.add(option1);
		mainPanel.add(option2);
		mainPanel.add(option3);

		add(MainPanel);
	}
}
