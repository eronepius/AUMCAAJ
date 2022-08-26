import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class DatabaseCheck {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guestbook", "root", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from guestusers");
            while (rs.next()) {
                //Display values
                System.out.print("Name: " + rs.getString("Name"));
                System.out.print(", Email: " + rs.getString("Email"));
                System.out.print(", Message: " + rs.getString("Message"));
                System.out.println(", EntryDate: " + rs.getDate("EntryDate"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
