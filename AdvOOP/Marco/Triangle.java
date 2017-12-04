public class Triangle{	
	Line[] component= new Line[3];
	super();
	
	public Triangle(int height, int width, String color){
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
		component[0]= new Line(x, y, x, y-height); // These parameters are not the correct ones
		component[1]= new Line(x, y, x+width, y);	// parameters for testing purpooses only
		component[2]= new Line(x, y-height, x+width, y-height);
		
		component[0].Straight();
		component[1].Straight();
		component[2].Straight();
	}
}