public class Circle{
	Line[] component=new Line[2];
	super();
	
	public Circle(int height, int width, String color){
		this.height = height;
		this.width = width;
		this.color = color;		
	}
	
	public void draw(int h, int w, String c, int x, int y){
		System.out.println("Drawing a square with the following attributes:");
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
		System.out.println("Color: "+color);
		System.out.println("Starting at ("+x+", "+y+")");
		component[0]= new Line(x, y, x, y-height);//hlaf of the circle
		component[1]= new Line(x, y, x, y-height);// the other half
		component[0].Curved(0,0);// 0,0 are used for testing purposes only and are not correctlty calculated values
		component[1].Curved(0,0);// 0,0 are used for testing purposes only and are not correctlty calculated values
	}
}