
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

@ManagedBean(name="GuestListObject")
public class GuestLists {
    private List<Guests> guestlist = new ArrayList<Guests>();

    public List<Guests> getGuestlist() {
        return guestlist;
    }

    public void setGuestlist(List<Guests> guestlist) {
        this.guestlist = guestlist;
    }
    
    public GuestLists() throws SQLException{
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/guestbook","root", "password"); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ROOT.GUESTLISTS");
            while(rs.next()){
                Guests gs = new Guests();
                gs.setName(rs.getString("NAME"));
                gs.setEmail(rs.getString("EMAIL"));
                gs.setMessage(rs.getString("MESSAGE"));
                gs.setEntrydate(rs.getString("ENTRYDATE"));
                this.guestlist.add(gs);
         }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    
    
}
