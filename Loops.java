class Loops
{
public static void main(String args[])
{
	int i;
	for(i=0;i<10;i++)
	{
		System.out.println(i);
	}
	System.out.println("i value="+i);
	
	while(i<=0)
	{
		System.out.println(i);
		i--;
	}
	
	do
	{
		System.out.println("teja");
		i--;
	}while (i<=0);
	
	if(i==0)
	{
		System.out.println("hii");
		
	}
	else
	{
		System.out.println("hola");
	}
	
	switch(i){
		case 0:
			System.out.println("program");
		case 1:
			System.out.println("ur in second case");
		default:
			System.out.println("this is default");
			
	}
	

}
}