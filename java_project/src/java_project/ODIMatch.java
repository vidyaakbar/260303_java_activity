package java_project;

import java.util.*;

public class ODIMatch extends Match {
    	
	public double calculateRunRate() {
		return (runs_remaining()/((50.0-getCurrentover())));
	}
	
	public int runs_remaining()
	{
		int current_score=getCurrentscore();
		int target_required=getTarget();
		int runs=target_required-current_score;
		return runs;
	}
	
	public  int calculateBalls() {
		int ball=6*(int)getCurrentover();
		return 300-ball;
		
	}
	
	public void display(double reqRunrate, int balls) {
	   System.out.println("Requirements:");
	   System.out.println("Needed "+runs_remaining()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}


}