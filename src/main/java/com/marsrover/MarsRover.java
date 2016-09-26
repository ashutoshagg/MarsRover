package com.marsrover;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {
	
	private Plateau plateau;
	private Direction currentDirection;
	private Coordinates currentCoordinates;	

	public MarsRover(Plateau plateau, Direction startingDirection, Coordinates startingCoordinates) {
		this.plateau = plateau;
		this.currentCoordinates = startingCoordinates;
		this.currentDirection = startingDirection;
	}

	public String currentLocation() {
		return currentCoordinates.getStartingCoordinates() + " " + this.currentDirection;
	}

	public void moveLeft() {
		this.currentDirection = this.currentDirection.left();
	}

	public void moveRight() {	
		this.currentDirection = this.currentDirection.right();
	}

	public void move() {
		this.currentCoordinates.setxCoordinate(this.currentDirection.getStepSizeOnXAxis());
		this.currentCoordinates.setYcoordinate(this.currentDirection.getStepSizeOnYAxis());
	}

	public void run(String command) {
		
		
	}

	

}
