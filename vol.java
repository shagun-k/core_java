import java.util.*;
class Vol
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double rad,vol;
		System.out.println("Enter Radius of sphere\n");
		rad = sc.nextDouble();
		vol = (4*3.14*rad*rad*rad)/3;
		System.out.println("Volume of Sphere is: " + vol);
	}
}