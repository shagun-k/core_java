import java.util.*;
class Sumten
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,s;
		System.out.println("Enter Ten number\n");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		n6 = sc.nextInt();
		n7 = sc.nextInt();
		n8 = sc.nextInt();
		n9 = sc.nextInt();
		n0 = sc.nextInt();
		s = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n0;
		System.out.println("Sum is: " + s);
	}
}