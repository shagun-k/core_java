import java.util.*;
class Diff
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,m,s;
		System.out.println("Enter First number\n");
		n = sc.nextInt();
		System.out.println("Enter Second number\n");
		m = sc.nextInt();
		s = n - m;
		System.out.println("Difference is: " + s);
	}
}