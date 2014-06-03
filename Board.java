//LAYOUT!!!!!!!!!!!!!!!!!!!!!!!!

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;

		//grid of buttons
		//button to start game
		//add action listener that generates new move (move icon and and opens new board tile), if check first for rolleddice
		//display of score and person's name
		//if actionlistener detects that current tile + rolled dice > last tile, moves to last tile
		//at last tile, open new graduation last square jframe and displays if graduate or not
		
public class Board extends JFrame {
  
	private int currentSquare;
	private Player player;
	private ArrayList<Event> events;
	private BoardTile currentTile;

  	public Board(Player p, ArrayList<Event> e) {
  		player = p;
  		events = e;
  		currentSquare = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildWindow();
		setVisible(true);
		//MISC OTHER CONSTRUCTION!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public int rollDice(){
		return ((int) (Math.random()*4)) + 1;
	}

	private void buildInstructions() {
		JPanel mainPanel = new JPanel();
		JLabel label1 = new JLabel("Welcome to your senior year at MSJHS.");
		JLabel label2 = new JLabel("Get through the year, while gathering");
		JLabel label3 = new JLabel("as many $$$, happiness, and academic");
		JLabel label4 = new JLabel("points as you can, without getting too");
		JLabel label5 = new JLabel("many tardies. Are you ready?");
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		mainPanel.add(label1);
		mainPanel.add(label2);
		mainPanel.add(label3);
		mainPanel.add(label4);
		mainPanel.add(label5);
		
		JPanel secondPanel =  new JPanel();
		JLabel name = new JLabel("What's your name?");
		JTextField playerName = new JTextField(15);
		JButton startGame = new JButton("START");
		
		startGame.addActionListener(new startGameListener);
		
		secondPanel.add(name);
		secondPanel.add(playerName);
		secondPanel.add(startGame);
		
		add(mainPanel);
		add(secondPanel);
	}
	
	private void buildWindow() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(new EmptyBorder(new Insets(40, 40, 40, 40)));
		add(mainPanel);
		JPanel top = new JPanel();
		top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));
		top.add(new JLabel(":) - " + player.getHappiness()));
		top.add(Box.createRigidArea(5, 0));
		top.add(new JLabel("academics - " + player.getAcademics()));
		top.add(Box.createRigidArea(5, 0));
		top.add(new JLabel("$$$ - " + player.getMoney()));
		top.add(Box.createRigidArea(5, 0));
		top.add(new JLabel("tardies - " + player.getTardies()));
		top.add(Box.createRigidArea(10, 0));
		top.add(new rollListener("Roll Dice"));
		JPanel gridPanel = new JPanel();
		gridPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        	gridPanel.setLayout(new GridLayout(6, 6, 5, 5));
        	String[][] buttons = new String[6][6];
        	int count = 1;
        	for (int i = 0; i < 6; i++) {
        		for (int j = 0; j < 6; j++) {
        			if(i % 2 == 0) {
        				buttons[i][j] = Integer.toString(count);
        			} else {
        				buttons[i][5-j] = Integer.toString(count);
        			}
        			count++;
        		}
        	}
        	for (int i = 0; i < 6; i++) {
        		for (int j = 0; j < 6; j++) {
        			gridPanel.add(new JButton(buttons[i][j]));
        		}
        	}
        	mainPanel.add(top);
        	mainPanel.add(gridPanel);
		mainPanel.add(new JLabel("Player - " + player.getName()));
		mainPanel.add(new JLabel("You are at square # - " + (currentSquare + 1)));
		//grid of buttons
		//button to roll dice
		//display score and name
		//title
		setTitle("Senioritis: the Game");
		setLocationRelativeTo(null);
	}

	public void move() {
		//create boardtile with given number
		currentSquare += rollDice();
		invalidate();
		validate();
		currentTile = new BoardTile(currentSquare, events, player);
	}
	
	private void lastSquare() {
		currentSquare = -1;
 		LastSquare tile = new LastSquare (player);
	}
	
	private class rollListener extends JButton implements ActionListener {
		public rollListener(String text) {
			super.setText(text);
			addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			if (currentSquare == -1) {
 			} else if (rollDice() + currentSquare < 36) {
				move();
			} else {
				lastSquare();
			}
		}
	}
	
	private class startGameListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			Player player = new Player(playerName.getText());
		}
	}
}
