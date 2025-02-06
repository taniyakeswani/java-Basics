import java.util.Scanner;
class HiTwoFive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();

		//String ans = ((num % 2 == 0) ? (" hi two ") : ("")) || ((num % 5 == 0) ? ("hi five") : ("")) || ((num % 2 == 0 && num  % 5 == 0) ? ("hi two hi five") : ("")); 

		String ans = ((num % 2 == 0 && num % 5 == 0) ? (" hi two hi five" ) : ((num % 2 == 0) ?( "Hi two ") : ((num % 5 == 0) ? ("hi five") : ("   " ) ) ));
        System.out.println( ans);

	}
}
