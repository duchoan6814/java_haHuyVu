package entity;

public class HangXe {
	private String maHangXe, tenHangXe, quocGia;

	public String getMaHangXe() {
		return maHangXe;
	}

	public void setMaHangXe(String maHangXe) {
		this.maHangXe = maHangXe;
	}

	public String getTenHangXe() {
		return tenHangXe;
	}

	public void setTenHangXe(String tenHangXe) {
		this.tenHangXe = tenHangXe;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}

	public HangXe(String maHangXe, String tenHangXe, String quocGia) {
		super();
		this.maHangXe = maHangXe;
		this.tenHangXe = tenHangXe;
		this.quocGia = quocGia;
	}

	public HangXe() {
		super();
	}

	public HangXe(String maHangXe) {
		super();
		this.maHangXe = maHangXe;
	}

	@Override
	public String toString() {
		return "HangXe [maHangXe=" + maHangXe + ", tenHangXe=" + tenHangXe + ", quocGia=" + quocGia + "]";
	}
	
	
	
	
}
