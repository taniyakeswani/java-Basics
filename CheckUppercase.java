import java.util.Scanner;
class CheckUppercase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any alphabet : ");
		char ch = sc.next().charAt(0) ;
		String check = (ch >= 'A'  && ch <= 'Z') ? ("character is uppercase") : ("character is not uppercase");
		System.out.println(check);
	}
}

