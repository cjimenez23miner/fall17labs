public class Line{
	//origin
	private int x_o;
	private int y_o;
	//destination
	private int x_d;
	private int y_d;
	
	public Line(int x_o, int y_o, int x_d, int x_d){
		this.x_o = x_o;
		this.y_o = y_o;

		this.x_d = x_d;
		this.y_d = y_d;
	}

	public void Straight(){
		System.out.print("Drawing a straight line ");
		System.out.println("with endpoints at ("+x_o+", "+y_o+") and ("+x_d+", "+y_d+").");
	}
	public void Curved(int x, int y){
		System.out.print("Drawing a curved line ");
		System.out.print("with endpoints at ("+x_o+", "+y_o+") and ("+x_d+", "+y_d+")");
		System.out.print(" and curvature at ("+x+", "+y+").");
	}
	public void Elbowed(int x, int y){
		System.out.print("Drawing a eldowed line ");
		System.out.print("with endpoints at ("+x_o+", "+y_o+") and ("+x_d+", "+y_d+")");
		System.out.print(" and curvature at ("+x+", "+y+").");
	}
}