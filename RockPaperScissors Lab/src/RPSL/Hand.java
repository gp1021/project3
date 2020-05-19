package RPSL;

public class Hand {
	private String _move;

    Hand(String move) {
        _move = move;
    }

    public String getHandMove() {
        return _move;
    }
    
    public String randomMove() {
    	String[] x = {"rock", "paper", "scissors"};
    	int y = (int)(Math.random() * 3);
    	return x[y];
    }
}
