import java.util.Scanner;
class SquareRootForLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		boolean flag ;
		for (int i = 1; i <= num  ;  i++)
		{
			if(i * i == num)
			{
				flag = true;
				System.out.println(num + " is a perfect square of " + i);
			}
			else if (i * i > num)
			{
				break;
			}
			else if (flag = false)
			{
				System.out.println(num + " is not a perfect square " );
			}
		}
	}
}
