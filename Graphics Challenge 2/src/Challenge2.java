import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
	
	public class Challenge2 extends Canvas 
	{
		private static final long	serialVersionUID	= 1L;
		static int height;
		static int width;
		static int colorOfSquare1;
		
		public static void main(String[] args) 
			{

	  			Scanner userInput=new Scanner (System.in);
    			System.out.println("How big would you like the square to be?");
    			System.out.println("Please choose a height no larger than 1000!");
    			height=userInput.nextInt();
    			System.out.println("Please choose a width no larger than 1000!");
    			width=userInput.nextInt();
    			System.out.println("Would you like your square to be (1)red or (2)blue?" );
    			
        		colorOfSquare1=userInput.nextInt();
	        		
		        Challenge2 canvas = new Challenge2();
		        JFrame frame = new JFrame();
		        frame.setSize(500, 500);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);
				}
		
			
		public void paint(Graphics graphics)
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
    	    		}
	}
    		
						
//				graphics.setColor(Color.white);
//				graphics.fillRect(0, 0, 100, 100);
//				graphics.setColor(Color.black);
//				graphics.fillRect(0, 100, 100, 100);
//				graphics.setColor(Color.white);
//			    graphics.fillRect(0, 200, 100, 100);
//			  	graphics.setColor(Color.black);
//				graphics.fillRect(0, 300, 100, 100);
//				graphics.setColor(Color.white);
//				graphics.fillRect(0, 400, 100, 100);
//				graphics.setColor(Color.black);
//			    graphics.fillRect(0, 500, 100, 100);
//			  	graphics.setColor(Color.white);
//				graphics.fillRect(0, 600, 100, 100);
//				graphics.setColor(Color.black);
//				graphics.fillRect(0, 700, 100, 100);
//				graphics.setColor(Color.white);
//			    graphics.fillRect(0, 800, 100, 100);
//			  	graphics.setColor(Color.black);
//				graphics.fillRect(0, 900, 100, 100);
//				graphics.setColor(Color.white);
//				graphics.fillRect(0, 1000, 100, 100);
//				        
//				
//				graphics.setColor(Color.black);
//				graphics.fillRect(100, 0, 100, 100);		
//				graphics.setColor(Color.white);
//	    		graphics.fillRect(100, 100, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(100, 200, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(100, 300, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(100, 400, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(100, 500, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(100, 600, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(100, 700, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(100, 800, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(100, 900, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(100, 1000, 100, 100);
//	  	        
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(200, 0, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(200, 100, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(200, 200, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(200, 300, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(200, 400, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(200, 500, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(200, 600, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(200, 700, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(200, 800, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(200, 900, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(200, 1000, 100, 100);
//		        
//		        
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(300, 0, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(300, 100, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(300, 200, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(300, 300, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(300, 400, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(300, 500, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(300, 600, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(300, 700, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(300, 800, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(300, 900, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(300, 1000, 100, 100);
//	  	        
//		       
//	    		graphics.setColor(Color.white);
//		        graphics.fillRect(400, 0, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(400, 100, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(400, 200, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(400, 300, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(400, 400, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(400, 500, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(400, 600, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(400, 700, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(400, 800, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(400, 900, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(400, 1000, 100, 100);
//		        
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(500, 0, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(500, 100, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(500, 200, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(500, 300, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(500, 400, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(500, 500, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(500, 600, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(500, 700, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(500, 800, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(500, 900, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(500, 1000, 100, 100);
//	  	        
//		       
//	    		graphics.setColor(Color.white);
//		        graphics.fillRect(600, 0, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(600, 100, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(600, 200, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(600, 300, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(600, 400, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(600, 500, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(600, 600, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(600, 700, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(600, 800, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(600, 900, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(600, 1000, 100, 100);
//		        
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(700, 0, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(700, 100, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(700, 200, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(700, 300, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(700, 400, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(700, 500, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(700, 600, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(700, 700, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(700, 800, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(700, 900, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(700, 1000, 100, 100);
//	  	        
//		       
//	    		graphics.setColor(Color.white);
//		        graphics.fillRect(800, 0, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(800, 100, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(800, 200, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(800, 300, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(800, 400, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(800, 500, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(800, 600, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(800, 700, 100, 100);
//	  	        graphics.setColor(Color.white);
//	    		graphics.fillRect(800, 800, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(800, 900, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(800, 1000, 100, 100);
//		        
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(900, 0, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(900, 100, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(900, 200, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(900, 300, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(900, 400, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(900, 500, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(900, 600, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(900, 700, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(900, 800, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(900, 900, 100, 100);
//		        graphics.setColor(Color.black);
//				graphics.fillRect(900, 1000, 100, 100);
//	  	        
//		       
//	    		graphics.setColor(Color.white);
//		        graphics.fillRect(1000, 0, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(1000, 100, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(1000, 200, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(1000, 300, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(1000, 400, 100, 100);
//		        graphics.setColor(Color.black);
//	    		graphics.fillRect(1000, 500, 100, 100);
//	  	        graphics.setColor(Color.white);
//		        graphics.fillRect(1000, 600, 100, 100);
//		        graphics.setColor(Color.black);
//		        graphics.fillRect(1000, 700, 100, 100);
//		        graphics.setColor(Color.white);
//	    		graphics.fillRect(1000, 800, 100, 100);
//	  	        graphics.setColor(Color.black);
//		        graphics.fillRect(1000, 900, 100, 100);
//		        graphics.setColor(Color.white);
//		        graphics.fillRect(1000, 1000, 100, 100);
//		        
//					}
//			
//			}
//    			
//    		
//	
//    	
//	
//
//
//
//
//
//
