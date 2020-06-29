package entity;

import java.io.Serializable;

public class PhieuBaoHanh implements Serializable {
	private String tenKhachHang, linhKien, liDoBH, loiThuocVe, tenNhanVien; 
	private double giaTien;
	private int maBH;
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getLinhKien() {
		return linhKien;
	}
	public void setLinhKien(String linhKien) {
		this.linhKien = linhKien;
	}
	public String getLiDoBH() {
		return liDoBH;
	}
	public void setLiDoBH(String liDoBH) {
		this.liDoBH = liDoBH;
	}
	public String getLoiThuocVe() {
		return loiThuocVe;
	}
	public void setLoiThuocVe(String loiThuocVe) {
		this.loiThuocVe = loiThuocVe;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	public int getMaBH() {
		return maBH;
	}
	public void setMaBH(int maBH) {
		this.maBH = maBH;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maBH;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhieuBaoHanh other = (PhieuBaoHanh) obj;
		if (maBH != other.maBH)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "phieuBaoHanh [tenKhachHang=" + tenKhachHang + ", linhKien=" + linhKien + ", liDoBH=" + liDoBH
				+ ", loiThuocVe=" + loiThuocVe + ", tenNhanVien=" + tenNhanVien + ", loaiNhanVien=" 
				+ ", giaTien=" + giaTien + ", maBH=" + maBH + "]";
	}
	public PhieuBaoHanh(String tenKhachHang, String linhKien, String liDoBH, String loiThuocVe, String tenNhanVien,
			String loaiNhanVien, double giaTien, int maBH) {
		super();
		this.tenKhachHang = tenKhachHang;
		this.linhKien = linhKien;
		this.liDoBH = liDoBH;
		this.loiThuocVe = loiThuocVe;
		this.tenNhanVien = tenNhanVien;
		this.giaTien = giaTien;
		this.maBH = maBH;
	}
	public PhieuBaoHanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

