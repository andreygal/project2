package gameObjects;

/**
 * This class abstracts the behaviors common to ships. 
 * 
 * @author Andrey Galper
 * 
 *
 */
public abstract class Ship extends GameObject {
	//uses the superclass' constructor 
	public Ship(int xSpeed, int ySpeed){
		super(xSpeed, ySpeed);
	}
	/**
	 * Moves the ship to the right. 
	 * Allows the ship to move from the extreme right to the left corner of the screen
	 */
	public void moveRight(){
		objectPosition.move(((objectPosition.x+this.xSpeed)%(Main.WIDTH+1)), objectPosition.y);
	}
	/**
	 * Moves the ship to the left.
	 * Allows the ship to move from the extreme left to the right corner of the screen.
	 */
	public void moveLeft(){
		if(objectPosition.x<(0-objectSize.width))
			objectPosition.move((Main.WIDTH+objectPosition.x), objectPosition.y);
		
		objectPosition.move((objectPosition.x-this.xSpeed), objectPosition.y);
	}
	//ships have to be able to shoot bullets 
	public abstract Bullet shoot();
}
