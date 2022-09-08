//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
//		int firstOdd = 0; 
//		int firstEven = 0; 
//		int dist = 0; 
//		int location1 = 0; 
//		int location2 = 0; 
//		
//		while (ray[location1]%2==0) {
//			if(location1>ray.length-1) {
//				return -1; 
//			}
//			location1++; 
//		}
//	
//		firstOdd=location1+1; 
//		location2=firstOdd; 
//	
//		while(ray[location2]%2==1) {
//			if(location2>ray.length-1) {
//				return -1; 
////			}
//			location2++; 
//		}
//		firstEven=location2+1; 
//		dist=firstEven-firstOdd; 
//		return dist;
//		
		for (int i1 = 0; i1 < ray.length; i1++) {
	        if (ray[i1] % 2 == 1) {
	            for (int i2 = i1 + 1; i2 < ray.length; i2++) {
	                if (ray[i2] % 2 == 0) {
	                    return i2 - i1;
	                }
	            }
	            break;
	        }
	    }
	    return -1;
	}
}