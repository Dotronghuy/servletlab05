

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/library"; // Đúng cổng 3307 theo my.ini
        String user = "root";
        String password = "123456"; // Mật khẩu MySQL

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công!");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver MySQL!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Kết nối không thành công!");
            e.printStackTrace();
        }
    }
}
