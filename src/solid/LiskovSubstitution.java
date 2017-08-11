package solid;

public class LiskovSubstitution {
	public static void main(String[] args) {
		Rectangle rectangle = getRect();
		rectangle.setWidth(10);
		rectangle.setHeight(5);
		System.out.println(rectangle.getSquare());
	}
	static Rectangle getRect() {
		return new Rectangle();
	}
}

interface Shape{
	int getSquare();
}

class Rectangle implements Shape{
	int width;
	int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getSquare() {
		return width * height;
	}
}

class Squere implements Shape{
	int width;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getSquare() {
		return width * width;
	}
}