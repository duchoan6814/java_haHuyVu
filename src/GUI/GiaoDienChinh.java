package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;

import GUI.GiaoDienThemXe;
import GUI.GiaoDienBaoHanh;
import GUI.GiaoDienPhieuThanhToan;
import GUI.GiaoDienHopDong;
import GUI.GiaoDienKhachHang;
import GUI.GiaoDienMuaXeMay;

//import DieuKhien.QuanLyNhanVien;
//import DoiTuong.NhanVien;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class GiaoDienChinh extends JFrame implements ActionListener {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JMenuItem mntm, mntmDangXuat, mntmThoat, mnItemPhongBan, mnItemChucVu,mnItemHopDong,
			mnItemKetThucTG, mnItemPhanCong,mnItemThemXeMay, mnItemLichLaoDong, mnItemBaoCao , mntmTKKhachHang, mnItemChiTietCongTrinh,mnItem,mnItemPhieuThanhToan, mnItemNhanVien, mnItemBaoHanh, mnItemKhachHang, mnItemMuaXeMay;
	private JLabel lblTitle;
//	private QuanLyNhanVien NV;


	public GiaoDienChinh() {
		setTitle("Quản Lý Mua Ban Xe May");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,800);
		setLocationRelativeTo(null);
		setResizable(true);
		Control();
	}
	private void Control() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.white);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		menuBar.setBounds(0, 0, 1360, 32);
		contentPane.add(menuBar);

		JMenu mnQuanLy = new JMenu("Danh Mục ");
		mnQuanLy.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnQuanLy);

		mnItemThemXeMay = new JMenuItem("Thêm Xe Máy");
		mnItemThemXeMay.setFont(new Font("Arial", Font.PLAIN, 16));
		mnQuanLy.add(mnItemThemXeMay);
		mnItemThemXeMay.addActionListener(this);	

		mnItemHopDong = new JMenuItem("Thêm Hợp Đồng");
		mnItemHopDong.setFont(new Font("Arial", Font.PLAIN, 16));
		mnQuanLy.add(mnItemHopDong);
		mnItemHopDong.addActionListener(this);

		mnItemPhieuThanhToan = new JMenuItem("Phiếu Thanh Toán");
		mnItemPhieuThanhToan.setFont(new Font("Arial", Font.PLAIN, 16));
		mnQuanLy.add(mnItemPhieuThanhToan);
		mnItemPhieuThanhToan.addActionListener(this);

		mnItemNhanVien = new JMenuItem("Nhân Viên");
		mnItemNhanVien.setFont(new Font("Arial", Font.PLAIN, 16));
		mnQuanLy.add(mnItemNhanVien);
		mnItemNhanVien.addActionListener(this);
		
		mnItemBaoHanh = new JMenuItem("Bảo Hành");
		mnItemBaoHanh.setFont(new Font("Arial", Font.PLAIN, 16));
		mnQuanLy.add(mnItemBaoHanh);
		mnItemBaoHanh.addActionListener(this);
		
		mnItemKhachHang = new JMenuItem("Khách Hàng");
		mnItemKhachHang.setFont(new Font("Arial", Font.PLAIN, 16));
		mnQuanLy.add(mnItemKhachHang);
		mnItemKhachHang.addActionListener(this);
		
		mnItemMuaXeMay = new JMenuItem("Mua Xe Máy");
		mnItemMuaXeMay.setFont(new Font("Arial", Font.PLAIN, 16));
		mnQuanLy.add(mnItemMuaXeMay);
		mnItemMuaXeMay.addActionListener(this);
		

		JMenu mnTimKiem = new JMenu("Tìm Kiếm");
		mnTimKiem.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnTimKiem);

		mnItemLichLaoDong = new JMenuItem("Lịch Lao Động Nhân viên");
		mnItemLichLaoDong.setFont(new Font("Arial", Font.PLAIN, 16));
		mnTimKiem.add(mnItemLichLaoDong);
		mnItemLichLaoDong.addActionListener(this);

		JMenu mnThongKe = new JMenu("Thống Kê  / Báo Cáo");
		mnThongKe.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnThongKe);


		mnItemBaoCao = new JMenuItem("Báo cáo");
		mnItemBaoCao.setFont(new Font("Arial", Font.PLAIN, 16));
		mnThongKe.add(mnItemBaoCao);
		mnItemBaoCao.addActionListener(this);
		
		lblTitle = new JLabel("Quản lý Mua Bán Xe Máy");
		lblTitle.setForeground(Color.red);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 40));
		lblTitle.setBounds(220, 275, 550, 100);
		contentPane.add(lblTitle);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(mnItemThemXeMay)) {
			GiaoDienThemXe xm = new GiaoDienThemXe();
			xm.setVisible(true);
		
		}
		else if (o.equals(mnItemHopDong)) {
			GiaoDienHopDong hd = new GiaoDienHopDong();
			hd.setVisible(true);
		}
		else if (o.equals(mnItemPhieuThanhToan)) {
			GiaoDienPhieuThanhToan nv = new GiaoDienPhieuThanhToan();
			nv.setVisible(true);
	}
		else if (o.equals(mnItemNhanVien)) {
			GiaoDienNhanVien nv = new GiaoDienNhanVien();
			nv.setVisible(true);
	}
		else if (o.equals(mnItemBaoHanh)) {
			GiaoDienBaoHanh kh = new GiaoDienBaoHanh();
			kh.setVisible(true);

	}
		else if (o.equals(mnItemKhachHang)) {
			GiaoDienKhachHang kh = new GiaoDienKhachHang();
			kh.setVisible(true);

	}
		else if (o.equals(mnItemMuaXeMay)) {
			GiaoDienMuaXeMay kh = new GiaoDienMuaXeMay();
			kh.setVisible(true);

	}
		
		
}
	


}
