//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>(); 
	}

	public void loadToys( String toys )
	{
		int loc = toys.indexOf(" "); 
		String lastToy = ""; 
		while (loc>-1) {
			String thisToyString = toys.substring(0,loc); 
			if (getThatToy(thisToyString)!=null) {
				int num = getThatToy(thisToyString).getCount() + 1; 
				getThatToy(thisToyString).setCount(num);
			}
			else {
				Toy thisToy = new Toy(thisToyString); 
				thisToy.setCount(1);
				toyList.add(thisToy); 
			}
			
			toys = toys.substring(loc+1); 
			loc = toys.indexOf(" "); 
			lastToy = thisToyString; 
		}
		if (getThatToy(lastToy)!=null) {
			int num = getThatToy(lastToy).getCount() + 1; 
			getThatToy(lastToy).setCount(num);
		}
		else {
			Toy thisToy = new Toy(lastToy); 
			thisToy.setCount(1);
			toyList.add(thisToy); 
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		int loc = 0; 
  		for (int i = 0; i<toyList.size(); i++) {
  			if (toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i); 
  			}
  		}
		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
//  		int count = 0; 
//  		for (int i = 0; i<toyList.size(); i++) {
//  			if (toyList.get(i).getCount()>count) {
//  				count=i; 
//  			}
//  		}
//  		return toyList.get(count).getName();
  		this.sortToysByCount(); 
  		return toyList.get(toyList.size()-1).getName(); 
  	}  
  
  	public void sortToysByCount()
  	{
  		for (int i = 0; i<toyList.size(); i++) {
  			for (int j = 0; j<toyList.size()-1; j++) {
  				if (toyList.get(j).getCount()>toyList.get(j+1).getCount()) {
  					Toy z = toyList.get(j); 
	  				toyList.set(j, toyList.get(j+1));
	  				toyList.set(j+1, z);
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   return toyList.toString() + "\n max ==" + getMostFrequentToy();
	}
}