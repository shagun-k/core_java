import java.util.*;
class Marks
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double m1,m2,m3,m4,m5,pr,agg;
		System.out.println("Enter marks for five subjects");
		m1 = sc.nextDouble();
		m2 = sc.nextDouble();
		m3 = sc.nextDouble();
		m4 = sc.nextDouble();
		m5 = sc.nextDouble();
		pr = ((m1+m2+m3+m4+m5)/500)*100;
		agg = (m1+m2+m3+m4+m5)/5;
		System.out.println("Percentage: " + pr +"% \n Aggregate: " + agg);
	}
}