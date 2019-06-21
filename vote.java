import java.util.*;
class Vote
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int age;
		System.out.println("Enter age of person");
		age = sc.nextInt();
		if(age>18)
		{
			System.out.println("Person can cast vote");
		}
		else
		{
			System.out.println("Person cannot cast vote");
		}
	}
}