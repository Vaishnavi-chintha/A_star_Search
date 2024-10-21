package uk.ac.hw.macs.search;

/**
 * Represents a state in the search space. You need to include a method for determining whether a state is a 
 * goal state, and one for computing the heuristic value.
 */
public interface State {

	public int x;
	public int y;

	public static int Goalx;
	public static int Goaly;

	public State (int x, int y, boolean goal) {
		this.x = x;
		this.y = y;
		if (x == Goalx && y == Goaly){
			this.goal = true;
		}
	}


	public boolean isGoal(int x, int y){
		this.x = x;
		this.y = y;
		if (x == Goalx && y == Goaly){
			return true;
		} else {
			return false;
		}
	}
	public int getHeuristic(int x, int y){
		this.x = x;
		this.y = y;
		int h = Math.abs(Goalx - x) + Math.abs(Goaly - y);
		return h;
	};
}
