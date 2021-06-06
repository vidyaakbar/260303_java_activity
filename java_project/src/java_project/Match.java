package java_project;

import java.util.*;
public abstract class Match {
	int currentscore;
	float currentover;
	int target;
	

	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public abstract double calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(double reqRunrate, int balls);

}
