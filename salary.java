import java.util.*;
class Salary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float bs,gs,da,hr;
		System.out.println("Enter Basic Salary\n");
		bs = sc.nextFloat();
		da = (40 * bs)/100;
		hr = (20 * bs)/100;
		gs = bs-hr-da;
		System.out.println("Gross Salary: " + gs);
	}
}