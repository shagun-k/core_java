import java.util.*;
class Sumofd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,sum,rem;
		System.out.println("Enter Five Digit number\n");
		num = sc.nextInt();
		
		rem = num%10;
		sum = rem;
		num = num/10;
		
		rem = num%10;
		sum += rem;
		num = num/10;

		rem = num%10;
		sum += rem;
		num = num/10;
		
		rem = num%10;
		sum += rem;
		num = num/10;
		
		System.out.println("Sum of digits is: " + sum);
	}
}