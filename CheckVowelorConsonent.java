import java.util.Scanner;
class CheckVowelorConsonent 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
		char ch = sc.next().charAt(0);
		String ans = (( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? (ch + " is a vowel") : (ch + " is consonent"));
		System.out.println(ans);
	}
}
