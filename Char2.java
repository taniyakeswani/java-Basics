class Char2 
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		System.out.println(ch);

		//short s  = ch;
		//System.out.println(s);     //CTE    LOSSY CONVERSION

		int n = ch;
        System.out.println(n);

		long l = ch;
        System.out.println(l);

		float f = ch;
		System.out.println(f);

        double d = ch;
		System.out.println(d);
	}
}
