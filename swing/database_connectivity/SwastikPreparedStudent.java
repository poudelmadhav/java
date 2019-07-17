import java.sql.*;

class SwastikPreparedStudent {
  public static void main(String[] args) {    
    String url = "jdbc:mysql://localhost:3306/students?useSSL=false";
    String username = "madhav";
    String password = "password";
    String query = "SELECT * FROM students where name=?";

    try {
      Connection con = DriverManager.getConnection(url, username, password);
      PreparedStatement st = con.prepareStatement(query);

      st.setString(1, "Madhav Paudel");
      ResultSet i = st.executeQuery();

      System.out.println(i.getString("name") + " records inserted");
      
    } catch(SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
}