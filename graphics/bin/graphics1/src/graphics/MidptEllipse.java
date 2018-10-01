package graphics;

import java.applet.*;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MidptEllipse extends Applet{
        Graphics H;
    public void paint(Graphics g){
        H=g;
       JFrame frame = new JFrame("");
	 String line = JOptionPane.showInputDialog(frame,  "Enter xcenter,ycenter,Rx,Ry");
        String[] input =line.split(",");
        int xcenter=Integer.parseInt(input[0]);
        int ycenter=Integer.parseInt(input[1]);
        int Rx=Integer.parseInt(input[2]);
        int Ry=Integer.parseInt(input[3]);
        EllipseMidpoint(xcenter,ycenter,Rx,Ry);
        }
   
    public void EllipseMidpoint(int xcenter,int ycenter,int Rx,int Ry){
        int Rx2 = Rx*Rx;
        int Ry2 = Ry*Ry;
        int two_Rx2 = 2*Rx2;
        int two_Ry2 = 2*Ry2;
       
        int x=0;
        int y=Ry;
        int p;
        int px=0;
        int py = two_Rx2*y;
       
        EllipsePlotpoint(xcenter,ycenter,x,y);
       
        /*Region 1*/
        p = (int)(Ry2-(Rx2*Ry)+(0.25+Rx2));
        while(px<py){
            x++;
            px+=two_Ry2;
            if(p<0){
                p+=Ry2+px;
            }
            else{
                y--;
                py-=two_Rx2;
                p+=Ry2+px-py;
            }
            EllipsePlotpoint(xcenter,ycenter,x,y);   
     }
       
        /* Region2 */
        p = (int)(Ry2*(x+0.5)*(x+0.5)+Rx2*(y-1)*(y-1)-Rx2*Ry2);
       while(y>0){
            y--;
            py-=two_Rx2;
            if(p>0){
                p+=Rx2-py;
            }
            else{
                x++;
                px+=two_Ry2;
                p+=Rx2+px-py;
            }
            EllipsePlotpoint(xcenter,ycenter,x,y);   
     }
       
    }
   
     public void EllipsePlotpoint(int xcenter,int ycenter,int x,int y){
        setPixel(xcenter+x,ycenter+y);
        setPixel(xcenter-x,ycenter+y);
        setPixel(xcenter+x,ycenter-y);
        setPixel(xcenter-x,ycenter-y);
       
    }
    
    public void setPixel(int x,int y){
       H.fillOval(x,y,1,1);
       H.setColor(Color.pink);
    }  
   
}