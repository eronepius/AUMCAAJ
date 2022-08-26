import java.util.Scanner;

class A
{
public int age;
}


class B extends A
{
public int eligibility()
{
    if(age<18)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
}

class C extends B
{
public void license_type()
{
    if(age == 18)
    {
        System.out.print("Eligible for LL");
    }
    else{
        System.out.print("Eligible for DL");
    }
}
}
class inheritance2 {

    public static void main(String[] args)
    {
        C c = new C();

        Scanner sc = new Scanner(System.in);

        c.age = sc.nextInt();

        if(c.eligibility() == 1)
        {
            System.out.print("Not eligible");

        }
        else
        {
            c.license_type();
        }
    }
    
}
