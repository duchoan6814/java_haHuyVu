package entity;

import java.io.Serializable;

public class XeMay implements Serializable {
	private String soPK, mauXe, tenXe;
	private boolean loaiXe;
	private String soKhung;
	private HangXe hangXe;
	
	
	
	
	public String getTenXe() {
		return tenXe;
	}
	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}
	public String getSoPK() {
		return soPK;
	}
	public void setSoPK(String soPK) {
		this.soPK = soPK;
	}
	public String getMauXe() {
		return mauXe;
	}
	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}
	public boolean isLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(boolean loaiXe) {
		this.loaiXe = loaiXe;
	}
	public String getSoKhung() {
		return soKhung;
	}
	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}
	public HangXe getHangXe() {
		return hangXe;
	}
	public void setHangXe(HangXe hangXe) {
		this.hangXe = hangXe;
	}
	public XeMay(String soPK, String mauXe, boolean loaiXe, String soKhung, HangXe hangXe) {
		super();
		this.soPK = soPK;
		this.mauXe = mauXe;
		this.loaiXe = loaiXe;
		this.soKhung = soKhung;
		this.hangXe = hangXe;
	}
	public XeMay(String soKhung) {
		super();
		this.soKhung = soKhung;
	}
	public XeMay() {
		super();
	}
	@Override
	public String toString() {
		return "XeMay [soPK=" + soPK + ", mauXe=" + mauXe + ", loaiXe=" + loaiXe + ", soKhung=" + soKhung + ", hangXe="
				+ hangXe + "]";
	}
	
	
	
}