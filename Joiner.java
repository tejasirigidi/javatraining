import java.util.StringJoiner;

public class Joiner {
	public static void main(String args[])
	{
		StringJoiner sj= new StringJoiner(",");
		
		sj.add("teja").add("sirigidi");
		
		System.out.println(sj);
		
		StringJoiner sj2= new StringJoiner(" ","[","]");
		
		sj2.add("tudip").add("technologies");
		
		System.out.println(sj2);
		
		StringJoiner m=sj.merge(sj2);
		
		System.out.println(m);
	}

}