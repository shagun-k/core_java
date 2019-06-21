import java.util.*;
class Circle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double r,l,b,ar,pr,cr,arc;
		System.out.println("Enter Radius of Circle\n");
		r = sc.nextDouble();
		arc = (3.14*r*r);
		cr = (2*3.14*r);
		System.out.println("Area of Circle is: " + arc);
		System.out.println("\nCircumference of Circle is: " + cr);
		System.out.println("Enter length and breadth of rectangle");
		l = sc.nextDouble();
		b = sc.nextDouble();
		ar = l*b;
		pr = 2*(l+b);
		System.out.println("Area of Rectangle is: " + ar);
		System.out.println("Perimeter of Circle is: " + pr);
	}
}