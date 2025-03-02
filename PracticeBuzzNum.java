import java.util.Scanner;
class PracticeBuzzNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : " );
		int num = sc.nextInt();
		int rev = num % 10;

		System.out.println((num % 7 == 0 || rev == 7) ? (num + " is a buzz number ") : (num + " is not a buzz number "));
	}
}
