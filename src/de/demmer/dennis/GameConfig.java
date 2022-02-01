package de.demmer.dennis;

import java.io.Serializable;

public class GameConfig implements Serializable{
	
	

	private static final long serialVersionUID = 1L;
	
	
	private int gameSpeed;
	private int difficulty;
	
	
	public GameConfig(int gameSpeed, int difficulty) {
		super();
		this.gameSpeed = gameSpeed;
		this.difficulty = difficulty;
	}
	
	public GameConfig() {
		
	}
	
	
	public int getGameSpeed() {
		return gameSpeed;
	}
	public void setGameSpeed(int gameSpeed) {
		this.gameSpeed = gameSpeed;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	@Override
	public String toString() {
		return "GameConfig [gameSpeed=" + gameSpeed + ", difficulty=" + difficulty + ", getGameSpeed()="
				+ getGameSpeed() + ", getDifficulty()=" + getDifficulty() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
