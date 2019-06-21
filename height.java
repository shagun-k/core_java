import java.util.*;
class Height
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h;
		System.out.println("Enter height in Cetimetres:");
		h = sc.nextInt();
		if(h<=134)
		{
			System.out.println("Dwarf person");
		}
		else
		{
			if(h<=160)
			{
				System.out.println("Short person");
			}
			else
			{
				if(h<=180)
				{
					System.out.println("Normal heighted person");
				}
				else
				{
					if(h<=190)
					{
						System.out.println("Tall person");
					}
					else
					{
						System.out.println("Abnormal heighted person");
					}
				}
			}
		}
	}
}