package br.ufpb.movable;

public class MovableRectangle implements Movable{
	private MovablePoint p1;
	private MovablePoint p2;
	
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		p1 = new MovablePoint(x1,y1,xSpeed,ySpeed);
		p2 = new MovablePoint(x2,y2,xSpeed,ySpeed);
	}
	
	public void moveUp() {
		p1.y += p1.ySpeed;
		p2.y += p2.ySpeed;
	}
	
	public void moveDown() {
		p1.y -= p1.ySpeed;
		p2.y -= p2.ySpeed;
	}
	
	public void moveLeft() {
		p1.x -= p1.xSpeed;
		p2.x -= p2.xSpeed;
	}
	
	public void moveRight() {
		p1.x += p1.xSpeed;
		p2.x += p2.xSpeed;
	}
}
