import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args){
        try{
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            System.out.println("Server Started...");

            ProductImpl p1 = new ProductImpl("laptop", "Alienware 15 inch", 129999.99);
            ProductImpl p2 = new ProductImpl("mobile", "Samsung Flip 4", 149999.99);
            ProductImpl p3 = new ProductImpl("cosmetics", "Colorbar Lip Gloss", 299.30);
            ProductImpl p4 = new ProductImpl("smartwatch", "Apple 7 44 inch", 46999.99);

            Product stub1 = (Product) UnicastRemoteObject.exportObject(p1,0);
            Product stub2 = (Product) UnicastRemoteObject.exportObject(p2,0);
            Product stub3 = (Product) UnicastRemoteObject.exportObject(p3,0);
            Product stub4 = (Product) UnicastRemoteObject.exportObject(p4,0);

            Registry registry = LocateRegistry.getRegistry("127.0.0.1",8081);
            registry.rebind("laptop", stub1);
            registry.rebind("mobile", stub2);
            registry.rebind("cosmetics", stub3);
            registry.rebind("smartwatch", stub4);
            System.out.println("Server binding and exporting completed...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}