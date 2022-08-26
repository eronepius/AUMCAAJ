class Employee{
    float Salary = 10000;
}

public class EmployeeInheritance extends Employee{
    int bonus = 5000;
    public static void main(String args[]){
        EmployeeInheritance EI = new EmployeeInheritance();
        System.out.println("Salary of the Programmer is  : "+ EI.Salary);
        System.out.println("Bonus of the Programmer is  : "+ EI.bonus);
        System.out.println("Gross Pay of the Programmer is  : " + (EI.Salary+EI.bonus));
    }
}
