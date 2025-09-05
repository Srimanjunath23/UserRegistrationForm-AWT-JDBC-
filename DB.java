import java.sql.*;
public class DB {
    private Connection con;

    public DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userform", "root", "root");
            System.out.println("Connected to database successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void insert(String name, String email, String pass, String cpass, String dob, String phone, String address){
        try {
            String query="insert into users values(?,?,?,?,?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            if(pass.equals(cpass)){
                pstmt.setString(3, pass);
                pstmt.setString(4, dob);
                pstmt.setString(5, phone);
                pstmt.setString(6, address);
            } else {
                System.out.println("Password not matched");
            }
           
            

            

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
