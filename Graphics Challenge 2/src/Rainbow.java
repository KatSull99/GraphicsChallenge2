import java.awt.*;

import javax.swing.*;
 
public class Rainbow extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        Rainbow canvas = new Rainbow();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	
    	public void paint(Graphics graphics) 
    		{
    				{
    			int b = 0; int j =0; int r =0;
    			for(b=0; b<255; b++)
    				{
    					graphics.setColor(new Color(b, j, r));
    		        graphics.fillRect(400, 400, 200, 200);
    		        delay();
    				}
    			
    		       for(j=0; j<255; j++)	
    		    	   {
    		    		   graphics.setColor(new Color(b, j, r));
   		        	   graphics.fillRect(400, 400, 200, 200);
   		        	   delay();   		        	   
    		    	   }
   		        		for(r=0; r<255; r++)
   		        			{
   		        			graphics.setColor(new Color(b, j, r));
   		        			graphics.fillRect(400, 400, 200, 200);
    						delay();
   		        			}
   		        		}
					}

private void delay()
{
try
		{
		Thread.sleep(5);
		} catch (InterruptedException e)
		{
		e.printStackTrace();
		}

}
}


















