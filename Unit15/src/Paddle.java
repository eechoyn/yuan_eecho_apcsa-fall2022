//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
      speed =5;
   }
   public Paddle(int x, int y) {
	   setPos(x,y); 
   }
   public Paddle(int x, int y, int w, int h) {
	   setPos(x,y); 
	   setWidth(w); 
	   setHeight(y); 
	   
   }
   public Paddle(int x, int y, int w, int h, Color color) {
	   setPos(x,y); 
	   setWidth(w); 
	   setHeight(y); 
	   setColor(color); 
	   
   }
   public Paddle(int x, int y, int w, int h, Color color, int sp) {
	   setPos(x,y); 
	   setWidth(w); 
	   setHeight(y); 
	   setColor(color); 
	   setSpeed(sp); 
	   
   }
   public Paddle(int x, int y, int w, int h, int sp) {
	   setPos(x,y); 
	   setWidth(w); 
	   setHeight(y); 
	   setSpeed(sp); 
	   
   }
   public Paddle(int x, int y, int sp) {
	   setPos(x,y);
	   setSpeed(sp); 
	   
   }
   //add the other Paddle constructors


   public void setSpeed(int s)
   {
     speed = s; 
 
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE); 
	   setY(getY()+speed);
	   draw(window,getColor()); 

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE); 
	   setY(getY()-speed);
	   draw(window,getColor()); 
   }

   //add get methods
   public int getSpeed() {
	   return speed; 
   }
   
   //add a toString() method
   public String toString() {
		 return getX() + ", " + getY() + ", " + getWidth() + ", " + getHeight() + ", " + getColor() + ", " + speed;
	 }
}