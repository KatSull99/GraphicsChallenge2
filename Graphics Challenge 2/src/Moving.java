import java.awt.*;

import javax.swing.*;
 
public class Moving extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        Moving canvas = new Moving();
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
	        graphics.fillRect(0, 0, 20, 20);
	        
	       for (int i = 0; i < 1000; i++)
	        	{
		        graphics.setColor(Color.magenta);
		        graphics.fillRect(i, i, 20, 20);
		        
		        delay();
		        graphics.setColor(Color.green);
		        graphics.fillRect(i, i, 20, 20);
		       
		        
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
	