package entity;

import java.io.Serializable;

public class NhanVien implements Serializable {
	private int namKN;
	private String maNhanVien;
	private String hoTenDem, ten, soDienThoai;
	public int getNamKN() {
		return namKN;
	}
	public void setNamKN(int namKN) {
		this.namKN = namKN;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getHoTenDem() {
		return hoTenDem;
	}
	public void setHoTenDem(String hoTenDem) {
		this.hoTenDem = hoTenDem;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public NhanVien(int namKN, String maNhanVien, String hoTenDem, String ten, String soDienThoai) {
		super();
		this.namKN = namKN;
		this.maNhanVien = maNhanVien;
		this.hoTenDem = hoTenDem;
		this.ten = ten;
		this.soDienThoai = soDienThoai;
	}
	public NhanVien() {
		super();
	}
	@Override
	public String toString() {
		return "NhanVien [namKN=" + namKN + ", maNhanVien=" + maNhanVien + ", hoTenDem=" + hoTenDem + ", ten=" + ten
				+ ", soDienThoai=" + soDienThoai + "]";
	}
	
	
}
	
