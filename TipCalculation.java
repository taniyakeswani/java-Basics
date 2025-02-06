import java.util.Scanner;
class TipCalculation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter bill : ");
		float bill = sc.nextFloat();
		System.out.print("enter TipRate: ");
		float TipRate = sc.nextFloat();

		float TipAmount = (bill * TipRate) / 2;
        float TotalBill = bill + TipAmount;
		System.out.println(" total bill is : " + TotalBill);
		System.out.println(" total tip is : " + TipAmount);


	}
}
