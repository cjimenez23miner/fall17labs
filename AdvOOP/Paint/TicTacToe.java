import java.awt.Graphics;
import javax.swing.JApplet;

public class TicTacToe extends JApplet{

	public void paint(Graphics g) {
    	super.paint(g);
        g.drawLine(this.getWidth()/3, 0, this.getWidth()/3, this.getHeight());
        g.drawLine(2*this.getWidth()/3, 0, 2*this.getWidth()/3, this.getHeight());

        g.drawLine(0, this.getHeight()/3, this.getWidth(), this.getHeight()/3);
        g.drawLine(0, 2*this.getHeight()/3, this.getWidth(), 2*this.getHeight()/3);
    }

    public void click(){
        
    }
}