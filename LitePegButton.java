import java.awt.Color;

import javax.swing.JButton;

public class LitePegButton extends JButton{
	private final Color[] COLORS = {  Color.BLACK, Color.RED, Color.ORANGE, Color.YELLOW,
			 Color.GREEN, Color.BLUE, Color.MAGENTA};
	private int count;
	
	public LitePegButton() {
		this.count= 0;
		setBackground(COLORS[count]);
	}
	
	public void reset() {
		this.count=0;
		setBackground(COLORS[0]);
	}
	public void change() {
		if(this.count < COLORS.length) {			
			count++;
		}else {
			count=0;			
		}
		setBackground(COLORS[count]);
	}

}
