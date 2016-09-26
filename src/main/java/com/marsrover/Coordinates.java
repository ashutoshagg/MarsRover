package com.marsrover;

public class Coordinates {

	private int xCoordinate, ycoordinate;
	
	public Coordinates(int xCoordinate, int ycoordinate) {
		this.xCoordinate = xCoordinate;
		this.ycoordinate = ycoordinate;
	}

	public String getStartingCoordinates() {
		return String.valueOf(xCoordinate) + " " + String.valueOf(ycoordinate);	
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate += xCoordinate;
	}

	public void setYcoordinate(int ycoordinate) {
		this.ycoordinate += ycoordinate;
	}



}
