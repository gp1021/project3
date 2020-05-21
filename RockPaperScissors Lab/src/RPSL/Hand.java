package RPSL;

public class Hand {
	//instance variable
	private String _move;

	//constructor
	//contains the move the hand makes, whether it's rock, paper, or scissors
    	Hand(String move) {
        	_move = move;
    	}
	
	//getter
    	public String getHandMove() {
        	return _move;
    	}
    
	//picks a random move for the hand
    	public String randomMove() {
    		String[] x = {"rock", "paper", "scissors"};
    		int y = (int)(Math.random() * 3);
    		return x[y];
    	}
}
