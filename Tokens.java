import java.util.*; 
public class Tokens 
{ 
    public static void main(String args[]) 
    { 
		String s="Hi this is teja";
		String s1="Hi : this : is : teja";
        System.out.println("First type"); 
        StringTokenizer st1 = new StringTokenizer(s, " "); 
        
		while (st1.hasMoreTokens()) 
			System.out.println(st1.nextToken()); 
  
        System.out.println("second type"); 
        StringTokenizer st2 = new StringTokenizer(s1, " :"); 
        
		while (st2.hasMoreTokens()) 
			System.out.println(st2.nextToken()); 
  
        System.out.println("third type"); 
        StringTokenizer st3 = new StringTokenizer(s1, " :",  true); 
        
		while (st3.hasMoreTokens()) 
            System.out.println(st3.nextToken()); 
    } 
} 