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

        //prepared statement
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM new_table WHERE id =?");
        preparedStatement.setInt(1,1);
       ResultSet rs1 = preparedStatement.executeQuery();
       while (rs1.next()){
           String name = rs1.getString("name");
           System.out.println(name);
       }
        }
    }
