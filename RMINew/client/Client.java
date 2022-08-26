import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client{
    public static void main(String[] args){
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8081);
            Scanner scn = new Scanner(System.in);
            String _product = "";
            while (_product != "exit") {
                System.out.print("Enter a product category : \t");
                _product = scn.next();
                Product product = (Product) registry.lookup(_product);

                System.out.println("Product Category : " + product.getName());
                System.out.println("Product Name : " + product.getDesc());
                System.out.println("Product Price : " + product.getPrice());
                System.out.println("");
            }
        }catch(Exception e){
            System.out.println("Exiting Client Application");
        }
    }
}