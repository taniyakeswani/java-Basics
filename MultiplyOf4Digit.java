class MultiplyOf4Digit 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int product = 1;
	    int rem = num % 10;

		product = product * rem;                // 1 * 4 = 4

		rem = (num % 100) / 10;    // 3 
        product = product * rem;                // 4 * 3 = 12

		rem = (num % 1000) / 100;   //2
        product = product * rem;                    // 4 * 3 * 2 = 24

		rem = num / 1000;                //1
        product = product * rem;                  // 4 * 3 * 2 * 1 = 24
		System.out.println(product);
	}
}
