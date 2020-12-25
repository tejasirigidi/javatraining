import java.lang.String;
class Convert
{
public static void main(String args[])
  {
    int a = 25;
    int b = -10;
    String str1 = Integer.toString(a);
    String str2 = Integer.toString(b);
    System.out.println("String str1 = " + str1); 
    System.out.println("String str2 = " + str2);
	
	String str3 = String.valueOf(a);
	System.out.println("String str3 = " + str3);
	
	String s="500";
	int i=Integer.parseInt(s);
	int j=Integer.valueOf(s);
	
	System.out.println(i+10);
	System.out.println(j+50);
  }
}