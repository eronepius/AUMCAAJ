import java.rmi.RemoteException;

public class ProductImpl implements Product{
    public String name;
    public String desc;
    public double price;

    public ProductImpl(String _name, String _desc, double _price) throws RemoteException {
        this.name = _name;
        this.desc = _desc;
        this.price = _price;
    }

    public String getName() throws RemoteException{
        return this.name;
    }

    public String getDesc() throws RemoteException{
        return this.desc;
    }

    public double getPrice() throws RemoteException{
        return this.price;
    }
}