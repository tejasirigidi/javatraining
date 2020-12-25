class OperatorExample{  
public static void main(String args[]){  
int a=10,b=15;  
boolean c=true,d=false;
System.out.println("Unary operators");
System.out.println(a++);  
System.out.println(++a); 
System.out.println(b--);  
System.out.println(--b);
System.out.println(++a + a++);
System.out.println(a);
System.out.println(--b + b--);
System.out.println(b);
b=-b;
System.out.println(~a);
System.out.println(~b);
System.out.println(!c);
System.out.println(!d);

System.out.println("Arthmetic operators");

a=15;
b=25;
System.out.println("a+b=" + (a+b) + " a-b=" + (a-b) + " a*b=" + (a*b) + " a/b=" + (a/b) + " a%b=" + (a%b));

System.out.println("Shift operator");

System.out.println("10<<2 " + (10<<2) + " 10>>2 " + (10>>2));

System.out.println("bitwise and logical");

int e=5;

System.out.println(a>b&&++a>e);
System.out.println(a);

System.out.println(a>b&++a>e);
System.out.println(a);

System.out.println(a>e||--a>b);
System.out.println(a);

System.out.println(a>e|--a>b);
System.out.println(a);

System.out.println("ternary operator");

a=10;
b=20;
int min,max;
min=(a>b)?b:a;
System.out.println("min="+min);

max=(a>b)?a:b;
System.out.println("max="+max);

System.out.println("Assignment operator");

a+=4;
System.out.println(a);

b-=4;
System.out.println(b);

a*=2;
System.out.println(a);

b/=4;
System.out.println(b);

}}  