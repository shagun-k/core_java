import java.util.*;
class Minute
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int hrs,min,dur;
		System.out.println("Enter Hours\n");
		hrs = sc.nextInt();
		System.out.println("Enter Minutes\n");
		min = sc.nextInt();
		dur = hrs * 60;
		dur += min;
		System.out.println("Duration is: " + dur);
	}
}