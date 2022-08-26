import java.util.*;


interface student

{
    
int rollno = 12;
    
String name = "Abhishek";
    
    
public void display();
}



class staff implements student

{
    
int m1;
    
    
public void input()
    
{
    
Scanner sc= new Scanner(System.in);
    
System.out.println("Enter marks : ");
    
m1 = sc.nextInt();
    
}
    
    

public void display()
    
{

    
System.out.println("Name : "+ name + "\nRollNo : " + rollno + "\nMarks : " + m1);
    
}

}




class inter
{
    
public static void main(String []args)
    
{
        
staff s = new staff();
        
s.input();
        
s.display();
    
}

}