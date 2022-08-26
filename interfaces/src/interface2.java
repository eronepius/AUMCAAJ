interface sayHi{
    String SayHiToPerson(String Name);
}

public class interface2 implements sayHi{
    public String SayHiToPerson(String Name){
        return (Name +" says Hi!!!.");
    }

    public static void main(String args[]){
        interface2 Obj = new interface2();
        String myString = Obj.SayHiToPerson("Annie");
        System.out.println(myString);
    }
}
