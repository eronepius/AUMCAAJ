import java.util.Scanner;

class student_det
{

    int rollno;
    String name;
    int marks[] = new int[3];

    public void inp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no : ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        int i;
        System.out.print("Enter Marks : ");
        for(i=0;i<3;i++)
        {
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

    }


    public void disp()
    {
        int sum;
        sum = marks[0] + marks[1] + marks[2];
        System.out.print("Roll No : " + rollno + "\nName : " + name + "\nTotal Marks : " + sum);
    }
}


class class2 {

    public static void main(String [] args)
    {
            student_det s[] = new student_det[100];

            int n,i;

            Scanner sl = new Scanner(System.in);

            System.out.print("Enter the number of students : ");
            
            n = sl.nextInt();

            sl.nextLine();

            for(i=0;i<n;i++)
            {
            System.out.println("Enter the details of student " + (i+1));
            s[i] = new student_det();
            s[i].inp();
            }
            
            for(i=0;i<n;i++)
            {
            System.out.println("Student " + (i+1));
            
            s[i].disp();

            System.out.println("\n");
            }


    }
    
}
