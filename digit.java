import java.util.*;
class Digit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,sum,rem;
		System.out.println("Enter Four Digit number\n");
		num = sc.nextInt();//1234
		
		rem = num%10;//4
		sum = rem;
		num = num/10;//123
		
		rem = num%10;//3
		num = num/10;//12

		rem = num%10;//2
		num = num/10;//1
		
		rem = num%10;
		sum += rem;
		
		System.out.println("Sum of first and last digit of number is: " + sum);


		}
}