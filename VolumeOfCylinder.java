import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius: ");
		int radius = sc.nextInt();
        System.out.println("enter the height: ");
		int height = sc.nextInt();
        final float pi = 22/7;
		float area = pi *  radius * radius;
		System.out.println("Area of cylinder is : " + area);

		float volume = area * height;
		System.out.println("volume of cylider is : " + volume);
	}
}
