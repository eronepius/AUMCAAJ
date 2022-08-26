//class Employee {
//    double salary;
//}
//
//class Doctor extends Employee {
//    String name;
//    int empno;
//
//    Doctor(String name, int empno, double salary) {
//        this.name = name;
//        this.empno = empno;
//        this.salary = salary;
//    }
//
//    void diagnose() {
//        System.out.println("Diagnosing the patient");
//    }
//}
//
//class Nurse extends Employee {
//    String name;
//    int empno;
//
//    Nurse(String name, int empno, double salary) {
//        this.name = name;
//        this.empno = empno;
//        this.salary = salary;
//    }
//
//    void assist() {
//        System.out.println("Assisting the patient");
//    }
//}
//
//class Administrator extends Employee {
//    String name;
//    int empno;
//
//    Administrator(String name, int empno, double salary) {
//        this.name = name;
//        this.empno = empno;
//        this.salary = salary;
//    }
//
//    void administrating() {
//        System.out.println("Administrating");
//    }
//}
//
//class Surgeon extends Employee {
//    String name;
//    int empno;
//
//    Surgeon(String name, int empno, double salary) {
//        this.name = name;
//        this.empno = empno;
//        this.salary = salary;
//    }
//
//    void operate() {
//        System.out.println("Operating the patient");
//    }
//}
//
//class Receptionist extends Employee {
//    String name;
//    int empno;
//
//    Receptionist(String name, int empno, double salary) {
//        this.name = name;
//        this.empno = empno;
//        this.salary = salary;
//    }
//
//    void admission() {
//        System.out.println("Admitting the patient");
//    }
//}
//
//class Janitor extends Employee {
//    String name;
//    int empno;
//
//    Janitor(String name, int empno, double salary) {
//        this.name = name;
//        this.empno = empno;
//        this.salary = salary;
//    }
//
//    void clean() {
//        System.out.println("Cleaning");
//    }
//}
//
//class Hospital {
//    public static void main(String[] args) {
//        Doctor d = new Doctor("John", 23, 45000);
//        Nurse n = new Nurse("Alice", 34, 30000);
//        Administrator a = new Administrator("Abraham", 40, 40000);
//        Surgeon s = new Surgeon("Alex", 12, 50000);
//        Receptionist r = new Receptionist("Adam", 67, 25000);
//        Janitor j = new Janitor("Jane", 41, 25000);
//
//        System.out.println("Doctor Name : " + d.name + "\nSurgeon Name : " + s.name);
//        r.admission();
//        d.diagnose();
//        n.assist();
//        s.operate();
//    }
//}
