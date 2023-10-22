import java.sql.*;

public class Main {

    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;

        String sql = "SELECT * FROM employee";

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()) {
                System.out.println("ID : " + data.getInt("employee_id"));
                System.out.println("AD/SOYAD : " + data.getString("employee_name"));
                System.out.println("POZİSYON : " + data.getString("employee_position"));
                System.out.println("MAAŞ : " + data.getInt("employee_salary"));
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}