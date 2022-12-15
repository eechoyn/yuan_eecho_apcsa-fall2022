//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private AlienHorde horde;
	private Bullets shots;
	
	private boolean end;
	private boolean[] keys;
	private boolean pressed;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(400, 400, 50, 50, 10);
		horde = new AlienHorde(10);
		shots = new Bullets();
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		horde.moveEmAll();
		horde.removeDeadOnes(shots.getList());
		shots.cleanEmUp();
		
		if (end) 
		{
			graphToBack.setColor(Color.WHITE);
			if (horde.getList().size()==0)
		   	{
				graphToBack.drawString("You won!", 375, 350);
		   	}
			else graphToBack.drawString("You lost!", 375, 350);
		}
		
		if(keys[0] == true && ship.getX()>ship.getSpeed())
		{
			ship.move("LEFT");
		}
		if (keys[1] == true && ship.getX()<(800-ship.getSpeed()-ship.getWidth()))
		{
			ship.move("RIGHT");
		}
		if (keys[2] == true && ship.getY()>ship.getSpeed())
		{
			ship.move("UP");
		}
		if (keys[3] == true && ship.getY()<(600-ship.getSpeed()-ship.getHeight()-20))
		{
			ship.move("DOWN");
		}
		if (keys[4] == true && !end && !pressed)
		{
			pressed = true; 
			shots.add(new Ammo((ship.getX()+ship.getWidth()/2), ship.getY()-5, 5, 5, 5));
			keys[4]=false;
		}
		
		
		
		for (Alien alien : horde.getList())
		{
			if (shots.collision(alien))
			{
				horde.stopHorde();
				ship.setSpeed(0);
				shots.clear();
				end=true;
			}	
		}

		
		if (horde.getList().size()==0) 
		{
			end=true;
			ship.setSpeed(0);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_H)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_K)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_U)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_J)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_H)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_K)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_U)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_J)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
			pressed = false;
			
		}
		repaint();
	}


	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}