import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
	
	public class Challenge2 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        Challenge2 canvas = new Challenge2();
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
    			
    			
    			Scanner userInput=new Scanner (System.in);
    			System.out.println("How big would you like the square to be? Please choose a height no larger than 500!");
    			int height=userInput.nextInt();
    			System.out.println("Please choose a width no larger than 500!");
    			int width=userInput.nextInt();
    			System.out.println("Would you like your square to be 1.red or 2.blue?" );
    			int colorOfSquare1=userInput.nextInt();
    			       
    	
    	
    		{
    			if (colorOfSquare1==1)
     						{
						graphics.setColor(Color.red);
				        graphics.fillRect(0, 0, width, height);
				    }
				else if(colorOfSquare1==2)
					{
						graphics.setColor(Color.blue);
				        graphics.fillRect(0, 0, width, height);
					}
				graphics.fillRect( 0, 0, width, height);
				while(true)
					{
						for (int i=0; i<600; i++)
							{
								graphics.setColor(Color.magenta);
								graphics.fillRect(i, 0, 20, 20);
							}
				
				graphics.setColor(Color.white);
	    		graphics.drawRect(0, 0, 100, 100);
	  	        graphics.setColor(Color.black);
		        graphics.fillRect(100, 300, 100, 100);
		        graphics.setColor(Color.blue);
		        graphics.drawRect(900, 900, 100, 100);
		        
			}
			
    		
					}
			}
    		}
	}






