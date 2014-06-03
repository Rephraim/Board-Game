//LAYOUT!!!!!!!!!!!!!!!!!!!!!!!!

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
		//grid of buttons
		//button to start game
		//add action listener that generates new move (move icon and and opens new board tile), if check first for rolleddice
		//display of score and person's name
		//if actionlistener detects that current tile + rolled dice > last tile, moves to last tile
		//at last tile, open new graduation last square jframe and displays if graduate or not
		
public class Board extends JFrame() {
  
	private int currentSquare;
<<<<<<< HEAD
	private Player player=null;
	private ArrayList<Event> events = null;
	private BoardTile currentTile=null;

  	public Board(Player p, ArrayList<Event> e) {
  		player = p;
  		events = e;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildWindow();
		setVisible(true);
		//MISC OTHER CONSTRUCTION!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public int rollDice(){
		return (int)Math.random()*4 + 1;
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
        				buttons[i][j] == count;
        			} else {
        				buttons[i][5-j] == count;
        			}
        			count++;
        		}
        	}
        	for (int i = 0; i < 6; i++) {
        		for (int j = 0; j < 6; j++) {
        			gridPanel.add(new JButton(buttons[i][j]));
        		}
        	}
        	mainPanel.add(gridPanel);
		//grid of buttons
		//button to roll dice
		//display score and name
		//title
		
	}

	private void move() {
		//create boardtile with given number
		currentSquare += rollDice();
		currentTile = new BoardTile(currentSquare, events, player);
	}
	
	private void lastSquare() {
		//pop up new lastSquare jframe
		//which displays everything
		//end game?
	}
	
	private class rollListener extends JButton implements ActionListener {
		public rollListener(String text) {
			super.setText(text);
			addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			if (rollDice() + currentSquare < 36) {
				move();
			} else {
				lastSquare();
			}
		}
	}
