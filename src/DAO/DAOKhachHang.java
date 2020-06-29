package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDatabase.ConnectDB;
import entity.KhachHang;

public class DAOKhachHang {
	Connection con = ConnectDB.getInstance().getConnection();

	public ArrayList<KhachHang> getListKhachHang() {
		ArrayList<KhachHang> a = new ArrayList<KhachHang>();
		KhachHang b;
		String sql = "select * from KhachHang";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				b = new KhachHang();
				b.setMaKhachHang(rs.getString("MaKhachHang"));
				b.setHoTenDep(rs.getString("HoTenDem"));
				b.setTen(rs.getString("Ten"));
				b.setDiaChi(rs.getString("DiaChi"));
				b.setSdt(rs.getString(5));
				System.out.println(b);
				a.add(b);
			}
			return a;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean themKhachHang(KhachHang khachHang) {
		Connection con = ConnectDB.getInstance().getConnection();
		String sql = "insert into [dbo].[KhachHang] values (?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, khachHang.getMaKhachHang());
			ps.setString(2, khachHang.getHoTenDep());
			ps.setString(3, khachHang.getTen());
			ps.setString(4, khachHang.getDiaChi());
			ps.setString(5, khachHang.getSdt());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		new DAOKhachHang().getListKhachHang();
	}
}
