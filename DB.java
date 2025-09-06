import java.sql.*;
public class DB {
    private Connection con;

    public DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userform", "root", "root");
            System.out.println("Connected to database successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e);
        }
    }
    public void insert(String name, String email, String pass, String gender, String dob, String phone, String address) {
    try {
        String query = "INSERT INTO users (name, email, password, gender, dob, phone, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, name);
        pstmt.setString(2, email);
        pstmt.setString(3, pass);   
        pstmt.setString(4, gender);  
        pstmt.setString(5, dob);     
        pstmt.setString(6, phone);
        pstmt.setString(7, address);

        int rows = pstmt.executeUpdate();  // <-- this actually inserts
        if (rows > 0) {
            System.out.println("Data inserted successfully into DB!");
        } else {
            System.out.println("Data not inserted!");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}

}