import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class BoardTile extends JFrame {
	private JButton option1;
	private JButton option2;
	private JButton option3;
	private Option opt1;
	private Option opt2;
	private Option opt3;
	private int number;
	private Event event;
	
	private Player player;

  	public BoardTile(int tileNumber, ArrayList<Event> list, Player p) {
		super ("Square" + tileNumber);
		number = tileNumber;
		event = list.get(tileNumber);
		player = p;
		opt1 = event.getChoiceA();
		opt2 = event.getChoiceB();
		opt3 = event.getChoiceC();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildWindow();
		setVisible(true);
	}

	private void buildWindow() {
		JPanel mainPanel = new JPanel();
		JLabel description = new JLabel(event.getDescrip());
		JLabel a = new JLabel(opt1.getDescrip());
		JLabel b = new JLabel(opt2.getDescrip());
		JLabel c = new JLabel(opt3.getDescrip());
		option1 = new JButton("A");
		option1.addActionListener(new abuttonListener());
		option2 = new JButton("B");
		option2.addActionListener(new bbuttonListener());
		option3 = new JButton("C");
		option3.addActionListener(new cbuttonListener());
		mainPanel.add(description);
		mainPanel.add(a);
		mainPanel.add(b);
		mainPanel.add(c);
		mainPanel.add(option1);
		mainPanel.add(option2);
		mainPanel.add(option3);

		add(mainPanel);
	}

	private class abuttonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.changeTardies(opt1.getChangeT());
			player.changeMoney(opt1.getChangeM());
			player.changeHappiness(opt1.getChangeH());
			player.changeAcademics(opt1.getChangeA());
			JOptionPane.showMessageDialog(null, opt1.getStatChanges(), "Option A", JOptionPane.PLAIN_MESSAGE);
		}
	}
	private class bbuttonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.changeTardies(opt2.getChangeT());
			player.changeMoney(opt2.getChangeM());
			player.changeHappiness(opt2.getChangeH());
			player.changeAcademics(opt2.getChangeA());
			JOptionPane.showMessageDialog(null, opt2.getStatChanges(), "Option B", JOptionPane.PLAIN_MESSAGE);
		}
	}
	private class cbuttonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.changeTardies(opt3.getChangeT());
			player.changeMoney(opt3.getChangeM());
			player.changeHappiness(opt3.getChangeH());
			player.changeAcademics(opt3.getChangeA());
			JOptionPane.showMessageDialog(null, opt3.getStatChanges(), "Option C", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
