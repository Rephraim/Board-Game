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

  	public Board() {
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
		//grid of buttons
		//button to roll dice
		//display score and name
		//title
		add(MainPanel);
	}

	private void move() {
		
	}
	
	private void lastSquare() {
		//pop up new lastSquare jframe
		//
	}
	
	private class rollListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (rollDice() + currentSquare < 36) {
				move();
			} else {
				lastSquare();
			}
		}
	}
}
