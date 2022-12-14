import java.awt.Graphics;
import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Bullets
{
	private ArrayList<Ammo> ammo;

	public Bullets()
	{
        ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
        ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
        for (Ammo a : ammo) {
            a.draw(window);
        }
	}

	public void moveEmAll()
	{
        if (ammo.size() > 0) {
            for (Ammo b : ammo) {
                b.move("UP");
            }
        }
	}

	public void cleanEmUp()
	{
        if (ammo.size() > 0) {
            for (Ammo d : ammo) {
                if (d.getY() < -1) {
                    d.setPos(-1000, -1000);
                }
            }
        }
	}

	public ArrayList<Ammo> getList()
	{
		return ammo;
	}
	
    public boolean collision(Alien a) {
        if (ammo.size() > 0) {
            for (Ammo c : ammo) {
                if ((c.getY() > a.getY()) && (c.getY() < a.getY() + a.getHeight()) && (c.getX() > a.getX()) && (c.getX() < a.getX() + a.getWidth())) {
                    return true;
                }
            }
        }
        return false;
    }

	public String toString()
	{
		return "";
	}
}