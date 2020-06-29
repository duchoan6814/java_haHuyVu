package entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

public class PhieuThanhToan implements Serializable{
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private XeMay xeMay;
	private int soHD;
	private Date ngayTra;
	private double soTien;
	
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public XeMay getXeMay() {
		return xeMay;
	}
	public void setXeMay(XeMay xeMay) {
		this.xeMay = xeMay;
	}
	public int getSoHD() {
		return soHD;
	}
	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}
	public Date getNgayTra() {
		return ngayTra;
	}
	public void setNgayTra(Date ngayTra) {
		this.ngayTra = ngayTra;
	}
	public double getSoTien() {
		return soTien;
	}
	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}
	
	public PhieuThanhToan(KhachHang khachHang, NhanVien nhanVien, XeMay xeMay, int soHD, Date ngayTra, double soTien) {
		super();
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.xeMay = xeMay;
		this.soHD = soHD;
		this.ngayTra = ngayTra;
		this.soTien = soTien;
	}
	public PhieuThanhToan(int soHD) {
		super();
		this.soHD = soHD;
	}
	public PhieuThanhToan() {
		super();
	}
	@Override
	public String toString() {
		return "PhieuThanhToan [khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", xeMay=" + xeMay + ", soHD="
				+ soHD + ", ngayTra=" + ngayTra + ", soTien=" + soTien + "]";
	}
	
	
	
	
	
}