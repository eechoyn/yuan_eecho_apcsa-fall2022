//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String first = a.substring(0, 1);
       String last = a.substring(a.length() - 1);
       String vowel = "AEIOUaeiou";
       
	   if (vowel.contains(first) || vowel.contains(last)) {
		   return "yes";
	   }
	   else {
		   return "no"; 
	   }
	}
}