package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDatabase.ConnectDB;
import entity.HangXe;
import entity.XeMay;

public class DAOXeMay {
	public ArrayList<XeMay> getListXeMay() {
		ArrayList<XeMay> a = new ArrayList<XeMay>();
		XeMay x;
		Connection con = ConnectDB.getInstance().getConnection();
		String sql = "select * from [dbo].[XeMay]";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				x = new XeMay();
				x.setSoKhung(rs.getString(1));
				HangXe h = new HangXe();
				h.setMaHangXe(rs.getString(2));
				x.setHangXe(h);
				x.setMauXe(rs.getString(3));
				x.setLoaiXe(rs.getBoolean(4));
				x.setSoPK(rs.getInt(5) + "CC");
				x.setTenXe(rs.getString(6));
				a.add(x);
			}
			return a;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean themXe(XeMay xeMay) {
		Connection con = ConnectDB.getInstance().getConnection();
		String sql = "insert into [dbo].[XeMay] values ('MaXe', 'MaHang', 'MauSac', 'loaiXe', 'phanKhoi', 'tenXe')";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, xeMay.getSoKhung());
			ps.setString(2, xeMay.getHangXe().getMaHangXe());
			ps.setString(3, xeMay.getMauXe());
			ps.setBoolean(4, xeMay.isLoaiXe());
			ps.setInt(5, Integer.parseInt(xeMay.getSoPK()));
			ps.setString(6, xeMay.getTenXe());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
