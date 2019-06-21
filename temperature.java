import java.util.*;
class Temperature
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double f,c;
		System.out.println("Enter Temperature in Fahrenheit degrees");
		f = sc.nextDouble();
		c = ((f-32.0)*5)/9;
		System.out.println(f + " Fahrenheit = " + c + " Celsius");
		
	}
}