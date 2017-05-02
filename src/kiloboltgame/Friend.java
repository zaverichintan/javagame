package kiloboltgame;

import java.awt.Rectangle;

public class Friend {

	private int  power, speedX, centerX, centerY;
	private Background bg = StartingClass.getBg1();
	// private static Robot robot;
	private Robot robot = StartingClass.getRobot();

	public Rectangle r = new Rectangle(0,0,0,0);
	
	private int movementSpeed;

	
	
	public void update() {
		//follow();
	centerX += speedX;// to make it look stationery 
	speedX = bg.getSpeedX() * 5 + movementSpeed;
	
	r.setBounds(centerX - 25, centerY-25, 50, 60);
	
	if (r.intersects(Robot.yellowRed)){
		checkCollision();
	}
	}
	
	private void checkCollision() {
		if (r.intersects(Robot.rect) || r.intersects(Robot.rect2) || r.intersects(Robot.rect3) || r.intersects(Robot.rect4)){
			System.out.println("cabbage collision");
			StartingClass.score += 5;
			die();

			}
		}
	

	public void die() {
		this.setCenterX(-100);
	}

	public int getPower() {
		return power;
	}

	public int getSpeedX() {
		return speedX;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public Background getBg() {
		return bg;
	}

	

	public void setPower(int power) {
		this.power = power;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public void setBg(Background bg) {
		this.bg = bg;
	}

}

