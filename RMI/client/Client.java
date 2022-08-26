import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
    public static void main(String[] args){
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",8081);
//            Product laptop = (Product) registry.lookup("ll");
            Product mobile = (Product) registry.lookup("m");

            System.out.println("Product Category : " +mobile.getName());
            System.out.println("Product Name : " +mobile.getDesc());
            System.out.println("Product Price : " +mobile.getPrice());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}