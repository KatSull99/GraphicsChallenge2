import java.awt.*;

import javax.swing.*;
 
public class Horizontally extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        Horizontally canvas = new Horizontally();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.green);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		
	        graphics.setColor(Color.magenta);
	        graphics.fillRect(0, 10, 50, 50);
	     int mx=1; 
	     int x=0;
	       while(true)
	        	{
	        		 x= x+mx;
		        graphics.setColor(Color.magenta);
		        graphics.fillRect(x, 10, 50, 50);
		        
		        delay();
		        graphics.setColor(Color.green);
		        graphics.fillRect(x, 10, 50, 50);
		        	
		        		        
		    if (x==950)
		        {
		        	mx=--mx;
		        }
		    else if (x==0)
		    	{
		    		mx=++mx;
		    	}
		         }
    		}
    	
    		public void delay()
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
	