public class Sbu {
	public static void main(String args[])
	{
		StringBuffer sb= new StringBuffer("teja");
		sb.append("sirigidi");
		
		System.out.println(sb);
		
		sb.insert(0, "T");
		
		System.out.println(sb);
		
		sb.replace(3, 5, "SI");
		
		System.out.println(sb);
		
		sb.delete(0, 4);
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(50);
		
		System.out.println(sb.capacity());
		
		String s=sb.substring(1, 6);
		
		System.out.println(s);
		
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(3));
		
		String s3="klu";
		
		StringBuffer sb2= new StringBuffer(s3);
		
		System.out.println(sb2);
		
		sb2.append("university");
		
		System.out.println(sb2);
		
	}

}