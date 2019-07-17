import java.sql.*;

class SwastikDB {
  public static void main(String[] args) {    
    String url = "jdbc:mysql://localhost:3306/students?useSSL=false";
    String username = "madhav";
    String password = "password";
    String query = "SELECT * FROM students;";

    try {
      Connection con = DriverManager.getConnection(url, username, password);
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);

      System.out.println("+----+\t\t+------------+");
      System.out.println("| ID |\t\t|    Name    |");
      System.out.println("+----+\t\t+------------+");

      while(rs.next()) {
        System.out.println("  " + rs.getInt("id") + "\t\t " + rs.getString("name"));
      }
    } catch(SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
}