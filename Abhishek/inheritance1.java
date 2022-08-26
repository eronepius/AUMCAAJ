import java.util.Scanner;

class A
{
    int rollno;
    String name;


}

class B extends A
{
    int marks;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no : ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Marks : ");
        marks = sc.nextInt();
    }

    void display()
    {
        System.out.print("Printing....\nRoll No : " + rollno + "\nName : " + name + "\nMarks : " + marks);
    }
}


class inheritance1{

    public static void main(String []args)
    {

        B b = new B();

        b.input();

        b.display();

    }
    
}
