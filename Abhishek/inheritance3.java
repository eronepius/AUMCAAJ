
class A
{
int num = 5;
}

class B extends A
{
int poweroftwo()
{
    return num*num;
}
}


class C extends A
{
int powerofthree()
{
    return num*num*num;
}
}

class inheritance3 {

    public static void main(String []args)
    {
    B b = new B();
    C c = new C();

    System.out.println("From Class B : (Square of 5) : " + b.poweroftwo());

    System.out.println("From Class C : (5 to the power of 3) : " + c.powerofthree());
    }

}
