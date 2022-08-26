import java.util.*;
import java.util.Random;

class Student {
    int regno;
    String name;
    int event1, event2, event3, total;

    Student() {
        this.regno = 0;
        this.name = "";
        this.event1 = this.event2 = this.event3 = 0;
        this.total = 0;

    }

    void input_text() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        this.regno = random.nextInt(100);
        System.out.println("Enter the name : ");
        this.name = sc.nextLine();
        System.out.println("Enter the scores in 3 events : ");
        this.event1 = sc.nextInt();
        this.event2 = sc.nextInt();
        this.event3 = sc.nextInt();
        this.total = this.event1 + this.event2 + this.event3;
    }

}

class Stud {
    public static void main(String[] args) {
        Student s[] = new Student[100];
        int n, i, regno, temp;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].input_text();
        }
        System.out.println("Minimum Score : ");
        temp = s[0].total;
        regno = s[0].regno;
        name = s[0].name;

        for (i = 0; i < n; i++) {
            if (s[i].total <= temp) {
                regno = s[i].regno;
                name = s[i].name;
                temp = s[i].total;
            }
        }
        System.out.println("Name : " + name + "\nReg No : " + regno + "\nTotal : " + temp);
    }
}
