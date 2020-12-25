class OperatorExample{  

public void Unary(){
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
}
public void Arthmetic(){

System.out.println("Arthmetic operators");

int a=15;
int b=25;
System.out.println("a+b=" + (a+b) + " a-b=" + (a-b) + " a*b=" + (a*b) + " a/b=" + (a/b) + " a%b=" + (a%b));
}
public void Shift(){
System.out.println("Shift operator");

System.out.println("10<<2 " + (10<<2) + " 10>>2 " + (10>>2));
}
public void BitwiseLogical(){
System.out.println("bitwise and logical");

int e=5;
int a=15;
int b=25;

System.out.println(a>b&&++a>e);
System.out.println(a);

System.out.println(a>b&++a>e);
System.out.println(a);

System.out.println(a>e||--a>b);
System.out.println(a);

System.out.println(a>e|--a>b);
System.out.println(a);
}
public void Ternary(){
System.out.println("ternary operator");

int a=10;
int b=20;
int min,max;
min=(a>b)?b:a;
System.out.println("min="+min);

max=(a>b)?a:b;
System.out.println("max="+max);

}

public void Assignment(){
System.out.println("Assignment operator");
int a=10;
int b=20;
a+=4;
System.out.println(a);

b-=4;
System.out.println(b);

a*=2;
System.out.println(a);

b/=4;
System.out.println(b);
}
public static void main(String args[]){  
OperatorExample oe= new OperatorExample();
oe.Assignment();
oe.Ternary();
oe.Arthmetic();
oe.Unary();
oe.Shift();
oe.BitwiseLogical();

}
}

