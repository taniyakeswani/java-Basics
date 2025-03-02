import java.util.Scanner;
class PracticeAutomorphic
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sq = num * num;
		int len = 0;
		int div =1 ;
		int last_digit = 0;
		for (int i = num ; i > 0 ; i /= 10 )
		{
			len++;
		}
		for (int i = 1; i <= len ; i++ )
		{
			div *= 10;
			last_digit = sq % div;
		}
		if (last_digit == num)
		{
			System.out.println("it is an automorphic number");
		}
		else
		{
			System.out.println("not  a automorphic number");
		}
	}
}
