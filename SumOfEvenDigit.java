class  SumOfEvenDigit
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int even = 0;
		int rem = num % 10;                         // 4
		
        int add = (rem%2 == 0) ? rem : 0;            //4
		even = even + add;
		
		rem = (num % 100) / 10;                  //3
		add = (rem%2 == 0) ? rem : 0;           //3
        even = even + add;
		
        rem = (num % 1000) / 100;           //2       
	    add = (rem%2 == 0) ? rem: 0;           
        even = even + add;                          //6
		
        rem = num /1000;                         //   1   
	    add = (rem%2 == 0) ? rem: 0;           
        even = even + add;      
		System.out.println(even);
		
	}
}

