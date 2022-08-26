
abstract class Sum {
	abstract void add();
}


class Operation extends Sum {
	void add()
	{
	    int a = 5;
	    int b = 10;
		System.out.println("Sum : " + (a+b));
	}
}


class abs {

	
	public static void main(String args[])
	{
        Operation  o = new Operation();
	    o.add();
	}
}
