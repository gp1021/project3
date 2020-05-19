package RPSL;

import java.util.ArrayList;
import java.util.List;

public class HLuser {
	public static final String[] BUTTONS = {"rock", "paper", "scissors", "exit"}; 
	public static final String[] BUTTONS2 = {"Play again", "exit"}; 
	private HLWindow _w;
	private HLview _view;
	private Hand _hand;
	int correct;
	int lost;
	int roundsWon;
	int roundsLost;
	
	public HLuser() {
		_w = new HLWindow();
		_view = new HLview();
		
		correct = 0;
		lost = 0;
		
		while (lost != 3) {
			int x = _w.option(BUTTONS, _view.toString(_hand, correct, lost, roundsWon, roundsLost));
			_hand = new Hand(BUTTONS[x]);
			int y = choice(x);
			if (correct >= 3) {
				_w.msg1("You WON ! :D");
				roundsWon++;
				end();
			}
		}
		_w.msg1("You lost :(");
		roundsLost++;
		end();
	}
	
	public int choice(int x) {
		String comp = _hand.randomMove();
		if (x == 0) { //rock
			if (comp.equalsIgnoreCase("rock")) {
				_w.msg1("Tie !");
			} else if (comp.equalsIgnoreCase("paper")) {
				_w.msg1("You lose this round !");
				lost++;
			} else {
				_w.msg1("You win this round !");
				correct++;
			}
		} else if (x == 1) { //paper
			if (comp.equalsIgnoreCase("paper")) {
				_w.msg1("Tie !");
			} else if (comp.equalsIgnoreCase("scissors")) {
				_w.msg1("You lose this round !");
				lost++;
			} else {
				_w.msg1("You win this round !");
				correct++;
			}
		} else if (x == 2) { //scissors
			if (comp.equalsIgnoreCase("scissors")) {
				_w.msg1("Tie !");
			} else if (comp.equalsIgnoreCase("rock")) {
				_w.msg1("You lose this round !");
				lost++;
			} else {
				_w.msg1("You win this round !");
				correct++;
			}
		} else if (x == 3){
			System.exit(0);
		} else {
			
		}
		return 0;
	}
	
	public void end() {
		int x1 = _w.option(BUTTONS2, "Would you like to play again?");
		if (x1 == 0) {
			correct = 0;
			lost = 0;
			while (lost != 3) {
				int x = _w.option(BUTTONS, _view.toString(_hand, correct, lost, roundsWon, roundsLost));
				_hand = new Hand(BUTTONS[x]);
				int y = choice(x);
				if (correct >= 3) {
					_w.msg1("You WON ! :D");
					roundsWon++;
					end();
				}
			}
			_w.msg1("You lost :(");
			roundsLost++;
			end();
		} else if (x1 == 1) {
			System.exit(0);
		} else {
			
		}
	}
}
