import java.util.*;
class Distance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double km,m,cm,ft,inch;
		System.out.println("Enter Distance in kms");
		km = sc.nextDouble();
		m = km*1000;
		cm = km*1000*100;
		ft = km*3280.839;
		inch = km*39370.079;
		System.out.println(km + "km=" + m + "m");
		System.out.println(km + "km=" + cm + "cm");
		System.out.println(km + "km=" + ft + "ft");
		System.out.println(km + "km=" + inch + "inch");
	}
}