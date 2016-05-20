import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.color.ColorSpace;
import java.util.Scanner;

import javax.swing.JFrame;
public class RedBlue extends Canvas
{

	
			    public static void main(String[] args)
					
			    
			    {
			   
			  
				RedBlue canvas = new RedBlue();
			        JFrame frame = new JFrame();
			        frame.setSize(600, 500);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);

			}
			    public void paint(Graphics graphics) 
			    {
			    	Scanner userInput=new Scanner(System.in);
			    System.out.println("Choose the heigth no bigger than 500!");
			    int height=userInput.nextInt();
			    System.out.println("Choose the width no bigger than 500!");
			    int width=userInput.nextInt();
			    System.out.println("Would you like 1.blue or 2. red?");
			    int color1=userInput.nextInt();
			    	 
					   
						if (color1==1)
					    	{
					    		graphics.setColor(Color.blue);
					    		graphics.fillRect(0, 0, width, height);
					    	}
					    else if (color1==2)
					    	{
					    		graphics.setColor(Color.red);
					    		 graphics.fillRect(0, 0, width, height);
					    	}
					    graphics.fillRect(0, 0, width, height);  
					    while (true)
					    	{
					   
					    
					  		
				        				
				        			}
					        
							      
							   
				        	
					    	
					    

		
						    
			    }  	
			   
		
				private void delay()
					{
						try
		    					{
		    					Thread.sleep(50);
		    					} catch (InterruptedException e)
		    					{
		    					e.printStackTrace();
		    					}
						
					}
}
				


