public class fruits {
    String Name;
    fruits(String name){
        this.Name = name;
    }
    void fname(){
        System.out.println("Fruit Name is "+this.Name + ".");
    }

    void fcolor(String Color){
        System.out.println(this.Name +" color is "+ Color +".");
    }

    void fprice(int Kgs, float Price){
        System.out.println("Price of "+ Kgs + " kgs of " +  this.Name +" is INR: "+ Price + ".");
    }

    public static void main(String args[]){
        fruits Apple = new fruits("Apple");
        Apple.fname();
        Apple.fcolor("red");
        Apple.fprice(2, 200);
        System.out.println("------------------------------------------------------------");
        fruits Pineapple = new fruits("Pineapple");
        Pineapple.fname();
        Pineapple.fcolor("yellow");
        Pineapple.fprice(1, 320);

    }
}
