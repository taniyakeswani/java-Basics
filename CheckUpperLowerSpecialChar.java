import java.util.Scanner;
class CheckUpperLowerSpecialChar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter : " );
		char ch = sc.next().charAt(0);

		String op = ( ch >= 'a' && ch <= 'z' )?(  ch  + "  lowercase"  ):((ch >= 'A' && ch <= 'Z')? (ch +  " uppercase"): ( (ch >= '1' && ch <= '9') ? (ch + " digit") : (ch + " not a digit nor character")));


		System.out.println(op);
	}
}
