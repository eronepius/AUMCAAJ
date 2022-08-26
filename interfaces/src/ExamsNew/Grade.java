import java.util.*;

class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter Marks : ");
        m = sc.nextInt();

        System.out.print("Grade : ");

        if (m > 90 && m <= 100)
            System.out.println("AA");
        else if (m > 80 && m <= 90)
            System.out.println("AB");
        else if (m > 70 && m <= 80)
            System.out.println("BB");
        else if (m > 60 && m <= 70)
            System.out.println("BC");
        else if (m > 50 && m <= 60)
            System.out.println("CC");
        else if (m > 40 && m <= 50)
            System.out.println("DD");
        else
            System.out.println("Fail");
    }
}
