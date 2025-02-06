class  AddOf4Digit 
{
	public static void main(String[] args) 
	{


		int num = 1234;
		int sum = 0;
	    int rem = num % 10;

		sum = sum + rem;                // 0 + 4

		rem = (num % 100) / 10;    // 3 
        sum = sum + rem;                // 4 + 3 = 7

		rem = (num % 1000) / 100;   //2
        sum = sum + rem;                    // 4 + 3 + 2 = 9

		rem = num / 1000;                //1
        sum = sum + rem;                  // 4 + 3 + 2 + 1 = 10
		System.out.println(sum);


	   // int num = 1234;
		//int sum = 0;
		//int rem = num / 1000;                      //1
       // int dup = rem;                                      // 1 is saved
		
		//sum = sum + rem;                          // 1

        //System.out.println(rem);

		//rem = (num % 1000) / 100;        //2
       //dup = rem;                                      //2 is saved
		//sum = sum + rem;                         // 2 + 1 = 3
      
        //rem = (((num / 1000) % 100) / 10);          //3
        //System.out.println(rem);
        
        //System.out.println(sum);
	}
}