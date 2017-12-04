public class Star extends Shape{
	Line[] component= new Line[5];
	super();
	
	public Star(int height, int width, String color){
		this.height = height;
		this.width = width;
		this.color = color;		
	}
	
	public void draw(int x, int y){
		System.out.println("Drawing a square with the following attributes:");
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
		System.out.println("Color: "+color);
		System.out.println("Starting at ("+x+", "+y+")");
		component[0]= new Line(x, y, x, y-height);
		component[1]= new Line(x, y, x+width, y); // these parameters are only for testing purposes
		component[2]= new Line(x, y-height, x+width, y-height);
		component[3]= new Line(x+width, y, x+width, y-height);
		component[4]= new Line(x+width, y, x+width, y-height);
		
		component[0].elbowed(0,0);// 0,0 just for testing purposes
		component[1].elbowed(0,0);
		component[2].elbowed(0,0);
		component[3].elbowed(0,0);
		component[4].elbowed(0,0);
	}