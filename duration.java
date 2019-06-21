import java.util.*;
class Duration
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int hrs,min,dur;
		System.out.println("Enter Duration\n");
		dur = sc.nextInt();
		hrs = dur / 60;
		min = dur % 60;
		System.out.println("\nhrs: " + hrs + "minutes: " + min);
	}
}