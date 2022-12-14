//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
    public List<Alien> aliens;

	public AlienHorde()
	{
		aliens = new ArrayList<>();
	}

	public void add(Alien al)
	{
        aliens.add(al);
	}
	
	public List<Alien> getList(){
		return aliens; 
	}

	public Alien getAlien(int index)
	{
		return aliens.get(index);
	}
	
	public void drawEmAll( Graphics window )
	{
        for (Alien a : aliens) {
            a.draw(window);
        }
	}

	public void moveEmAll()
	{
        for (Alien b : aliens) {
            if (b.getX() >= 740) {
                b.setBool(true);
            }
            if (b.getX() <= 0) {
                b.setBool(false);
            }
            if (b.getBool()) {
                b.move("LEFT");
            } else {
                b.move("RIGHT");
            }
        }
	}

	public void removeDeadOnes(boolean bool, Alien c)
	{
        if (bool) {
            c.setPos(-100, -100);
        }
	}

	public String toString()
	{
		return "";
	}
}