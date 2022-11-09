//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
	}

	public Block(int x, int y, int w, int h, Color col) {
		setPos(x,y); 
		setWidth(w); 
		setHeight(h); 
		setColor(col); 
	}
	public Block(int x, int y, int w, int h) {
		setPos(x,y); 
		setWidth(w); 
		setHeight(h); 
	}
	public Block(int x, int y) {
		setPos(x,y); 
		setPos(x, y);
		setColor(Color.BLACK);
		setWidth(10);
		setHeight(10);
	}
	//add other Block constructors - x , y , width, height, color
	
   //add the other set methods
   public void setX(int x) {
	   xPos=x; 
   }
   public void setY(int y) {
	   yPos=y; 
   }
   public void setPos(int x, int y) {
	   xPos=x; 
	   yPos=y; 
   }
   public void setWidth(int w) {
	   width=w; 
   }
   public void setHeight(int h) {
	   height=h; 
   }
   public void setColor(Color col)
   {
	   color=col; 
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Block obj)
	{
		if(this.getX()==obj.getX() && this.getY()==obj.getY() &&
				this.getWidth()==obj.getWidth() && this.getHeight()==obj.getHeight()
				&& this.getColor().equals(obj.getColor())) {
			return true; 
		}
		else{
			return false;
		}
	}   

   //add the other get methods
	public int getX() {
		return xPos; 
	}
    public int getY() {
    	return yPos; 
    }
    public int getWidth() {
		return width; 
	}
    public int getHeight() {
		return height; 
	}
    public Color getColor() {
		return color; 
	}

   //add a toString() method  - x , y , width, height, color
    public String toString() {
    	return xPos+" , "+yPos+" , "+width+" , "+height+" , "+color.toString(); 
    }
}