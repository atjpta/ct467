import java.sql.*;

public class connet_DB {
	public static void main(String args[]) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/qlchdl?" + "user=root");
			System.out.println("Noi ket thanh cong");
		} catch (Exception ex) { // xử lý ngoại lệ nếu có
			System.out.println("Noi ket khong thanh cong");
			ex.printStackTrace();
		}
	}
}
