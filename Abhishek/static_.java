class sum
{
	static int a = 10;
	
	static void add(int a,int b)
	{
		System.out.println("Sum : " + (a+b));
	}
}

class static_
{
	public static void main(String[] args)
	{
		sum.add(5,6);
		System.out.print(sum.a);
	}
}
