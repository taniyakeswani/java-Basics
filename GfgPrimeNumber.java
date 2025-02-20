import java.util.Scanner;
class GfgPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
        
		for (int num = 2; num <= n ; num++)
		{
			int count = 0;
			for (int i = 1; i <= num; i++)
			{
				if (num % i == 0)
					count++;
			}
			if (count == 2)
			{
                System.out.print(num + " " );
			}
		}
		//System.out.println("total prime numbers between " + num + " to " + n + " are : " + count);
	}
}
