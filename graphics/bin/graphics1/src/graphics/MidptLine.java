package graphics;
import java.awt.*;
import java.applet.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class MidptLine extends Applet
{
	int x0,x1,y0,y1;
	int dx,dy,d,incE,incNE,x,y;
	
    public void paint(Graphics g){
    	JFrame frame = new JFrame("");
   	 String line = JOptionPane.showInputDialog(frame,  "Enter x0,y0 ,x1 ,y1");
           String[] input =line.split(",");
            x0 = Integer.parseInt(input[0]);
            y0 = Integer.parseInt(input[1]);
            x1 = Integer.parseInt(input[2]);
            y1 = Integer.parseInt(input[3]);
          	
	
	dx = x1 - x0;
	dy = y1 - y0;
	d = (2 * dy) - dx;
	incE = 2 * dy;
	incNE = 2 * (dy - dx);
	x = x0;
	y = y0;
	while (x < x1){
		if ( d <= 0){
			d += incE;
			x++;
		}
		
		else{
			
			d+= incNE;
			x++;
			y++;
		}
		
		g.fillOval(x,y,1,1);
		g.setColor(Color.blue);
		}
	
}
}
