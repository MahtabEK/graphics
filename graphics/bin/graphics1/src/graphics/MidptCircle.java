package graphics;
import java.applet.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
@SuppressWarnings("serial")
public class MidptCircle extends Applet
{
public void paint(Graphics g){
	JFrame frame = new JFrame("");
	String line = JOptionPane.showInputDialog(frame,  "Enter r");
    int r = Integer.parseInt(line);

int d =1-r;
int x = 0;
int y = r;

do
{
g.setColor(Color.MAGENTA);
g.drawLine(y+200,x+200,y+200,x+200);
g.drawLine(x+200,y+200,x+200,y+200);
g.drawLine(x+200,-y+200,x+200,-y+200);
g.drawLine(y+200,-x+200,y+200,-x+200);
g.drawLine(-y+200,-x+200,-y+200,-x+200);
g.drawLine(-x+200,-y+200,-x+200,-y+200);
g.drawLine(-x+200,y+200,-x+200,y+200);
g.drawLine(-y+200,x+200,-y+200,x+200);


if(d<0){
d = d+2*x+3;
}
else{
d +=2*(x-y)+5;                         
y--;             
}
x++;
}
while (x<y);
}
}
