import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class LiteBriteBoardPanel extends JPanel{
	private LitePegButton[][] pegs;
	private int height;
	private int width;
	
	
	public LiteBriteBoardPanel(ActionListener listener, int h, int w) {
		this.height = h;
		this.width = w;
		pegs = new LitePegButton[w][h];
		setLayout( new GridLayout(h, w));
		for(int row = 0; row < w; row++) {
			for( int col= 0; col < h; col++) {
				pegs[row][col] = new LitePegButton();
				add(pegs[row][col]);
				pegs[row][col].addActionListener(listener);
			}
		}
		
	}
	public void reset() {
		for(int row = 0; row < pegs.length; row++) {
			for( int col= 0; col < pegs[row].length; col++) {
				pegs[row][col].reset();
			}
		
		}
	}

}
