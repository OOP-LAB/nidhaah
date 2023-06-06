import java.util.Scanner;
public class method{
void area(int r1)
{
double area_val=3.14*r1*r1;
System.out.println("\n Area of circle is radius"+r1+"="+area_val);
}
void area(int a1,int b1)
{
int area_val=a1*b1;
System.out.println("\n Area of Rectangle with dimension"+a1+"X"+b1+"="+area_val);
}
void area(int a1,int b1,int c1)
{
int area_val=a1*b1*c1;
System.out.println("\n Area of Rectangle with dimension"+a1+"X"+b1+"X"+c1+"="+area_val);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter the length");
int l=sc.nextInt();
System.out.println("\n enter the breadth");
int b=sc.nextInt();
System.out.println("\n enter the radius");
int r=sc.nextInt();
method obj1=new method();
obj1.area(r);
obj1.area(l,b);
obj1.area(l,b,r);
}
}
