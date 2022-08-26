
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

@ManagedBean(name="GuestsObject")
public class Guests {
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
    
    public String addGuest() throws SQLException{
    
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(message);
//        System.out.println(entrydate);
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/guestbook","root", "password"); 
            Statement stmt = con.createStatement();
            stmt.execute("INSERT INTO ROOT.GUESTLISTS VALUES('"+name+"','"+email+"','"+message+"','"+entrydate+"')");
            stmt.close();
        }catch(ClassNotFoundException | SQLException e){
          System.out.println(e);
        }
        return "myresponse";
    }
}
