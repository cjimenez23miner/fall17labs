public class Font {
	private String fontName; 
	private int size; 
	private int orientation;
	
	public Font() {
		this.size = 12;
		this.fontName = "calibri";
		this.orientation = 90;
	}
	
	//SETTERS
	public void setFont(String fontName) {
		this.fontName = fontName;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	
	//GETTERS
	public String getFont() {
		return this.fontName;
	}
	public int getsize() {
		return this.size;
	}
	public int getOrientation() {
		return this.orientation;
	}
	
	public void write(String text) {
		System.out.print("print: " + text+ " using font: " + fontName + " of size "+ size + " and degree of orientation: " + orientation);
	}	
}