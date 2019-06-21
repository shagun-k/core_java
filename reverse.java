import java.util.*;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,rev,rem;
		System.out.println("Enter Five Digit number\n");
		num = sc.nextInt();//12345
		
		rem = num%10;//5
		rev = rem*10000;//50000
		num = num/10;//1234
		
		rem = num%10;//4
		rev += (rem*1000);//4000+50000=54000
		num = num/10;//123

		rem = num%10;//3
		rev += (rem*100);//300+54000=54300
		num = num/10;//12
		
		rem = num%10;//2
		rev += (rem*10);//20+54300=54320;
		num = num/10;//1;
		
		rem = num%10;
		rev +=(rem);
		
		System.out.println("Reverse of number is: " + rev);
	}
}