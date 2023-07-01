import java.sql.*;

public class Main {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String databaseUrl = "jdbc:mysql://localhost/mydatabase";

        Connection conn = DriverManager.getConnection(databaseUrl,"root","Sweetcare1#");
        System.out.println("database connection success");

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("Select * from student1");
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String address = rs.getString("address");
            System.out.println(id+"\t"+ name + "\t"+address+"\t");
        }
        rs.close();
        stm.close();
        conn.close();

    }
}