public class Shape{
	
	private int height;
	private int width;
	private String color;

	
	public Shape(int height, int width, String color){
		this.height = height;
		this.width = width;
		this.color = color;		
	}
	
	public void draw(int x, int y){
		System.out.println("Drawing a shape with the following attributes:");
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
		System.out.println("Color: "+color);
		System.out.println("Starting at ("+x+", "+y+")");
	}
	
	public String getColor(){
		return color;
	}
	public String getHeight(){
		return height;
	}
	public String getWidth(){
		return width;
	}
}