package br.ufpb.movable;

public class MovableCircle implements Movable{
	private MovablePoint center;
	private int radius;
	
	public MovableCircle(int x,int y,int xSpeed,int ySpeed, int radius) {
		center = new MovablePoint(x,y,xSpeed, ySpeed);
		this.radius = radius;
	}
	
	public void moveUp() {
		// TODO Auto-generated method stub
		center.moveUp();
	}

	public void moveDown() {
		// TODO Auto-generated method stub
		center.moveDown();
	}
	
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.moveLeft();
	}
	
	public void moveRight() {
		// TODO Auto-generated method stub
		center.moveRight();
	}

}
