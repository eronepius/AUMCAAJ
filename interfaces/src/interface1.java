interface myinterface {
    int add(int a, int b);
}
public class interface1 implements myinterface{
    public int add(int a, int b){
        return (a+b);
    }

    public static void main(String args[]){
        interface1 Obj = new interface1();
        int a = 6, b = 10;
        int added = Obj.add(a, b);
        System.out.println("The added values of " + a +" and " + b + " is " + added +"." );
    }
}
