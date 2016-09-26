package com.marsrover;

import org.junit.Test;
import static org.junit.Assert.*;

public class RoversTest {

	@Test
	public void itShouldProvideCurrentLocation(){
		//given
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingCoordinates = new Coordinates(3, 3);

		//when
		MarsRover marsRover = new MarsRover(plateau, Direction.N, startingCoordinates);
		
		//then
		assertEquals("3 3 N", marsRover.currentLocation());
		
	}
	
	@Test
	public void itShouldMoveLeft(){
		//given
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingCoordinates = new Coordinates(3, 3);
		MarsRover marsRover = new MarsRover(plateau, Direction.N, startingCoordinates);
		
		//when
		marsRover.moveLeft();
		
		//then
		assertEquals("3 3 W", marsRover.currentLocation());	
	}
	
	@Test
	public void itShouldMoveRight(){
		//given
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingCoordinates = new Coordinates(3, 3);
		MarsRover marsRover = new MarsRover(plateau, Direction.N, startingCoordinates);
		
		//when
		marsRover.moveRight();
		
		//then
		assertEquals("3 3 E", marsRover.currentLocation());	
	}
	
	@Test
	public void itShouldMoveForwardInYDirection(){
		//given
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingCoordinates = new Coordinates(3, 3);
		MarsRover marsRover = new MarsRover(plateau, Direction.N, startingCoordinates);
		
		//when
		marsRover.move();
		
		//then
		assertEquals("3 4 N", marsRover.currentLocation());	
	}
	
	@Test
	public void itShouldMoveForwardInXDirection(){
		//given
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingCoordinates = new Coordinates(3, 3);
		MarsRover marsRover = new MarsRover(plateau, Direction.W, startingCoordinates);
		
		//when
		marsRover.move();
		
		//then
		assertEquals("2 3 W", marsRover.currentLocation());	
	}
	
	@Test
	public void itShouldMoveRoverAccordingToGivenCommands(){
		//given
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingCoordinates = new Coordinates(1, 2);
		MarsRover marsRover = new MarsRover(plateau, Direction.N, startingCoordinates);
		
		//when
		marsRover.run("L");
		
		//then
		assertEquals("1 2 W", marsRover.currentLocation());	
	}
}
