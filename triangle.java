import java.util.*;
class Triangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a1,a2,a3;
		System.out.println("Enter First Angle of triangle\n");
		a1 = sc.nextDouble();
		System.out.println("Enter Second Angle of triangle\n");
		a2 = sc.nextDouble();
		a3 = 180.0 -a1 - a2;
		System.out.println("Third Angle of Triangle: " + a3);
	}
}