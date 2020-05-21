package RPSL;
import java.util.List;

import java.util.ArrayList;

public class HLview {

	//contains all the information that is printed out to the user (rounds lost/won, number of correct/incorrect, etc)
	 public String toString(Hand card, int correct, int lost, int totalwon, int totallost) {
		 return "Rounds Won: " + totalwon + "\n" + 
				 "Rounds Lost: " + totallost + "\n\n" +
				 "Number of Correct Guesses: " + correct + "\n" + 
				 "Number of Incorrect Guesses: " + lost + "\n" +
				 "Rock, Paper, or Scissors?";
	 }
}

	
