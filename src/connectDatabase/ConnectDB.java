package connectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance = new ConnectDB();

	public static ConnectDB getInstance() {
		return instance;

	}

	public static void connect() {
		String url = "jdbc:sqlserver://0.0.0.0:1433;databasename=QuanLyXeMay";
		String user = "QLBH";
		String password = "sapassword";
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("success!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connect fail!");
		}
	}

	public static Connection getConnection() {
		connect();
		return con;

	}
}
