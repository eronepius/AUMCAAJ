import java.util.*;


class string3{


    public static void main(String[] args) {
    
        
        Scanner sc = new Scanner(System.in);

        String names[] = new String[100];

        System.out.print("Enter the number of students ");

        int n = sc.nextInt();

        int i;

        sc.nextLine();

        for(i=0;i<n;i++)
        {
            System.out.print("Enter the name of student " + i + " : ");
            names[i] = sc.nextLine();
        }

        
        for(i=0;i<n;i++)
        {
        System.out.println(names[i]);
        }



        
    
    }
    
    }