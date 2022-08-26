/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.Statement;  
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
/**
 *
 * @author Dell
 */

class GuestUser {
    private String name;
    private String email;
    private String message;
    private String entrydate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }


}

@Named(value = "guestUsersManagedBean")
@SessionScoped
public class GuestUsersManagedBean implements Serializable {
    private static final Logger logger = LogManager.getLogger(GuestUsersManagedBean.class);
    private List<GuestUser> guestusers = new ArrayList<GuestUser>();

    public List<GuestUser> getGuestusers() {
        return guestusers;
    }

    public void setGuestusers(List<GuestUser> guestusers) {
        this.guestusers = guestusers;
    }
    
    public GuestUsersManagedBean(){

    }
    
//    @PostConstruct
    public void populateGuestList(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guestbook","root","password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from guestusers;");
            while(rs.next()){
                logger.info(1);
                GuestUser gs = new GuestUser();
                gs.setName(rs.getString("Name"));
                gs.setEmail(rs.getString("Email"));
                gs.setMessage(rs.getString("Message"));
                gs.setEntrydate(rs.getString("EntryDate"));
                this.guestusers.add(gs);
         }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
    }
    
}
