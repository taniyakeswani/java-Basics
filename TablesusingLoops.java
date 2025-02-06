import java.util.Scanner;
class TablesusingLoops
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("	Enter a number:  ");
		int num = sc.nextInt();
		System.out.println("Enter a range: ");
		int range = sc.nextInt();

		for (int i = 1 ; i <= range ; i++ )
		{
			System.out.println(num + " X " + i + " = " + (num * i ) );
		}

	}
}
