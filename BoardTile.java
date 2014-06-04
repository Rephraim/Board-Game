import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;


public class BoardTile extends JFrame {
	private JButton option1;
	private JButton option2;
	private JButton option3;
	private Option opt1;
	private Option opt2;
	private Option opt3;
	private int number;
	private Event event;
	private JFrame frame;
	
	private Player player;

  	public BoardTile(int tileNumber, ArrayList<Event> list, Player p) {
		super ("Square" + tileNumber);
		frame = this;
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
		JPanel options = new JPanel();
		JPanel buttons = new JPanel();
		JPanel optionPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(new EmptyBorder(new Insets(40,40,40,40)));
		options.setLayout(new BoxLayout(options, BoxLayout.Y_AXIS));
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.Y_AXIS));
		optionPanel.setLayout(new BoxLayout(optionPanel, BoxLayout.X_AXIS));
		JLabel description = new JLabel(event.getDescrip());
		JLabel a = new JLabel("A. " + opt1.getDescrip());
		JLabel b = new JLabel("B. " + opt2.getDescrip());
		JLabel c = new JLabel("C. " + opt3.getDescrip());
		option1 = new JButton("A");
		option1.addActionListener(new abuttonListener());
		option2 = new JButton("B");
		option2.addActionListener(new bbuttonListener());
		option3 = new JButton("C");
		option3.addActionListener(new cbuttonListener());
		mainPanel.add(description);
		options.add(a);
		options.add(Box.createRigidArea(new Dimension(0,10)));
		options.add(b);
		options.add(Box.createRigidArea(new Dimension(0,10)));
		options.add(c);
		buttons.add(option1);
		buttons.add(option2);
		buttons.add(option3);
		optionPanel.add(options);
		optionPanel.add(Box.createRigidArea(new Dimension(25,0)));
		optionPanel.add(buttons);
		mainPanel.add(optionPanel);
		setLocationRelativeTo(null);
		setSize(700,250);
		add(mainPanel);
	}

	private class abuttonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.changeTardies(opt1.getChangeT());
			player.changeMoney(opt1.getChangeM());
			player.changeHappiness(opt1.getChangeH());
			player.changeAcademics(opt1.getChangeA());
			JOptionPane.showMessageDialog(null, opt1.getStatChanges(), "Option A", JOptionPane.PLAIN_MESSAGE);
			frame.dispose();
		}
	}
	private class bbuttonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.changeTardies(opt2.getChangeT());
			player.changeMoney(opt2.getChangeM());
			player.changeHappiness(opt2.getChangeH());
			player.changeAcademics(opt2.getChangeA());
			JOptionPane.showMessageDialog(null, opt2.getStatChanges(), "Option B", JOptionPane.PLAIN_MESSAGE);
			frame.dispose();
		}
	}
	private class cbuttonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.changeTardies(opt3.getChangeT());
			player.changeMoney(opt3.getChangeM());
			player.changeHappiness(opt3.getChangeH());
			player.changeAcademics(opt3.getChangeA());
			JOptionPane.showMessageDialog(null, opt3.getStatChanges(), "Option C", JOptionPane.PLAIN_MESSAGE);
			frame.dispose();
		}
	}
}
