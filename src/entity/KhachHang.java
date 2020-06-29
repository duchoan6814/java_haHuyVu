package entity;

import java.io.Serializable;

public class KhachHang implements Serializable {
	private String maKhachHang, hoTenDep, ten, diaChi, sdt;

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getHoTenDep() {
		return hoTenDep;
	}

	public void setHoTenDep(String hoTenDep) {
		this.hoTenDep = hoTenDep;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public KhachHang(String maKhachHang, String hoTenDep, String ten, String diaChi, String sdt) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTenDep = hoTenDep;
		this.ten = ten;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}

	public KhachHang() {
		super();
	}

	public KhachHang(String maKhachHang) {
		super();
		this.maKhachHang = maKhachHang;
	}

	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTenDep=" + hoTenDep + ", ten=" + ten + ", diaChi="
				+ diaChi + ", sdt=" + sdt + "]";
	}
	
	
	
}
