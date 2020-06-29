package entity;

import java.io.Serializable;
import java.util.Calendar;

public class HopDong implements Serializable{
	private int soHD;
	private Calendar ngayHD;
	private double tienPhaiThanhToan, tienDaThanhToan;
	private String thoiGianBaoHanh, NVLapHD,tenKH, soKhung,traTien;
	public int getSoHD() {
		return soHD;
	}
	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}
	public Calendar getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(Calendar ngayHD) {
		this.ngayHD = ngayHD;
	}
	public double getTienPhaiThanhToan() {
		return tienPhaiThanhToan;
	}
	public void setTienPhaiThanhToan(double tienPhaiThanhToan) {
		this.tienPhaiThanhToan = tienPhaiThanhToan;
	}
	public double getTienDaThanhToan() {
		return tienDaThanhToan;
	}
	public void setTienDaThanhToan(double tienDaThanhToan) {
		this.tienDaThanhToan = tienDaThanhToan;
	}
	public String getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanhString(String thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public String getNVLapHD() {
		return NVLapHD;
	}
	public void setNVLapHD(String nVLapHD) {
		NVLapHD = nVLapHD;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getSoKhung() {
		return soKhung;
	}
	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}
	public String getTraTien() {
		return traTien;
	}
	public void setTraTien(String traTien) {
		this.traTien = traTien;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + soHD;
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
		HopDong other = (HopDong) obj;
		if (soHD != other.soHD)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HopDong [soHD=" + soHD + ", ngayHD=" + ngayHD + ", tienPhaiThanhToan=" + tienPhaiThanhToan
				+ ", tienDaThanhToan=" + tienDaThanhToan + ", thoiGianBaoHanh=" + thoiGianBaoHanh
				+ ", NVLapHD=" + NVLapHD + ", tenKH=" + tenKH + ", soKhung=" + soKhung + ", traTien=" + traTien + "]";
	}
	public HopDong(int soHD, Calendar ngayHD, double tienPhaiThanhToan, double tienDaThanhToan,
			String thoiGianBaoHanh, String nVLapHD, String tenKH, String soKhung, String traTien) {
		super();
		this.soHD = soHD;
		this.ngayHD = ngayHD;
		this.tienPhaiThanhToan = tienPhaiThanhToan;
		this.tienDaThanhToan = tienDaThanhToan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		NVLapHD = nVLapHD;
		this.tenKH = tenKH;
		this.soKhung = soKhung;
		this.traTien = traTien;
	}
	public HopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
