import java.util.Scanner;

import java.util.Scanner;

class student
{
    int rollno;
    String name;


    public void add_record()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no : ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name : ");
        name = sc.nextLine();

    }

    public void display()
    {
        System.out.print("Roll NO : " + rollno + "\nName : " + name);
    }
}


class class1 {
    public static void main(String []args)
    {
        student s = new student();
        s.add_record();
        s.display();
    }
}
