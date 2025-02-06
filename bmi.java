import java.util.Scanner;
class Bmi 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter weight : ");
		double weight_pounds =sc.nextDouble();

		System.out.println("enter height : ");
		double height_inch = sc.nextDouble();

		double inchto_meter = height_inch * 0.0254;
		double poundto_kg = weight_pounds * 0.4535;

		double bmi = poundto_kg / (inchto_meter * inchto_meter);
		System.out.println("the bmi is " + bmi);
	}
}

