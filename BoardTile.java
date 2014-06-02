import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BoardTile extends JFrame {
	private JButton option1;
	private JButton option2;
	private JButton option3;
	private String d1;
	private String d2;
	private String d3;
	private int tilenumber;
	private Event event;
	
	private Player p;

  public BoardTile(int tileNumber, ArrayList<Event> list, Player p) {
		event = list.get(tileNumber);
		d1 = event.getChoice1();
		d2 = event.getChoice2();
		d3 = event.getChoice3();
		super ("Square" + tilenumber);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildWindow();
		setVisible(true);
	}

	private void buildWindow() {
		JPanel mainPanel = new JPanel();
		JLabel a = new JLabel(d1);
		JLabel b = new JLabel(d2);
		JLabel c = new JLabel(d3);
		option1 = new JButton("A");
		option1.addActionListener(new buttonListener);
		option2 = new JButton("B");
		option1.addActionListener(new buttonListener);
		option3 = new JButton("C");
		option1.addActionListener(new buttonListener);
		mainPanel.add(a);
		mainPanel.add(b);
		mainPanel.add(c);
		mainPanel.add(option1);
		mainPanel.add(option2);
		mainPanel.add(option3);

		add(MainPanel);
	}

	private class buttonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			p.changeTardies(event.getChangeT());
			p.changeMoney(
			p.changeHappiness(
			p.changeAcademics(
}
