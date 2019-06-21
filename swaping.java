import java.util.*;
class Swaping
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,m,s;
		System.out.println("Enter First number\n");
		n = sc.nextInt();
		System.out.println("Enter Second number\n");
		m = sc.nextInt();
		s = n;
		n = m;
		m = s;
		System.out.println("Numbers after interchange\n");
		System.out.println("n: " + n + "m:" + m);
	}
}