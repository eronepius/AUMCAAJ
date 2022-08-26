import java.util.ArrayList;

public class course {
    String Name = null;
    ArrayList<Integer> courses;
    course(String name){
        this.Name = name;
        this.courses = new ArrayList<Integer>(10);
    }

    String addStudent(String rn){
        String RollNo = rn;
        return RollNo;
    }

    void average(){
        int cl = this.courses.size();
        int sum = 0;
        for(int i=0;i<cl;i++){
            System.out.println(this.courses.get(i));
            sum += this.courses.get(i);
        }
        double avg = sum/cl;
        System.out.println("Average of the student is :" + avg);
    }
}
