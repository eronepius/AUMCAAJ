import java.util.Scanner;

class student1{
    public int total_marks(int m1,int m2,int m3)
    {
        return(m1+m2+m3);
    }
}



class class3{
    
    public static void main(String[] args)
    {

        student1 st = new student1();

        int rollno;
        String name;
        int marks[] = new int[3];

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
        System.out.println("Total : " + st.total_marks(marks[0],marks[1],marks[2]));


        
    }
}
