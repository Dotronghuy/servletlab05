import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = "jdbc:mysql://localhost:3307/library"; 
        String user = "root";
        String password = "123456"; // Mật khẩu của MySQL

        try {
            // Nạp driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO books (title, author, published_year) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Harry Potter");
            pstmt.setString(2, "J.K. Rowling");
            pstmt.setInt(3, 1997);
            pstmt.executeUpdate();

            resp.getWriter().write("<h1>Thêm sách thành công!</h1>");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(resp.getWriter());
        }
    }
}
