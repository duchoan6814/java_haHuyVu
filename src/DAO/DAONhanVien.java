package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectDatabase.ConnectDB;

public class DAONhanVien {
	public void getNhanVien() {
		Connection con = ConnectDB.getInstance().getConnection();
		String sql = "select * from NhanVien";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(2)+" "+rs.getString("Ten"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new DAONhanVien().getNhanVien();
	}

}
