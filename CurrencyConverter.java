import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("        Currencu Converter");
		System.out.println();
		System.out.println(" Enter the amount(INR) : " );
		float inr = sc.nextFloat();      
		System.out.println();


		System.out.println(" LIST OF CURRENCY ");
		System.out.println(" 1 . USD");
		System.out.println(" 2 . EUR");
		System.out.println(" 3 . GBP");
		System.out.println(" 4 . EAST AFRICA");
		System.out.println(" 5.  IRAN");
		System.out.println(" 6.   PAK");
		System.out.println();
		System.out.println(" Enter the currency : ");
		String curr = sc.next().toUpperCase();


		float conCurr = 0;
		if(curr.equals ("USD")) 
		{
			conCurr = inr/86.56f ;
			System.out.println(inr + "INR = " + conCurr + "USD");
		}
		else if(curr.equals ("EUR")) 
		{
			conCurr = inr/90.25f ;
			System.out.println(inr + "INR = " + conCurr + "EUR");
		}
		else if(curr.equals ("GBP")) 
		{
			conCurr = inr/107.61f ;
			System.out.println(inr + "INR = " + conCurr + "GBP");
		}
		else if(curr.equals ("EAST AFRICA")) 
		{
			conCurr = inr/0.1375f ;
			System.out.println(inr + "INR = " + conCurr + "EAST AFRICA");
		}
		else if(curr.equals ("IRAN")) 
		{
			conCurr = inr/0.00205f ;
			System.out.println(inr + "INR = " + conCurr + "IRAN");
		}
		else if(curr.equals ("PAK")) 
		{
			conCurr = inr/0.310f ;
			System.out.println(inr + "INR = " + conCurr + "PAK");
		}
	}
}
