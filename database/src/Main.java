import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/mydatabase";
        Connection con = DriverManager.getConnection(url,"root","Sweetcare1#");
        System.out.println("Database connection successful");

        Statement st = con.createStatement();
       st.executeUpdate("UPDATE student SET name = 'Luni' WHERE id = 2");
       st.execute("DELETE from student WHERE id ='3'");
        st.executeUpdate("INSERT into student(id,name, classes,address,marks)VALUES('3','Ivan','BBS','Patan','90')");
        ResultSet rs = st.executeQuery("Select * from student");
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String classes = rs.getString("classes");
            String address = rs.getString("address");
            double marks = rs.getDouble("marks");
            System.out.println(id +"\t" +name +"\t"+classes+"\t" +address+"\t"+marks);

        }
       rs.close();
        con.close();
       st.close();
    }
}