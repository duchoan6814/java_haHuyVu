package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GiaoDienNhanVien extends JFrame implements ActionListener, MouseListener {
	
	private static final long serialVersionUID = 1L;

	/**
	* 
	*/
	
	public  GiaoDienNhanVien() {
		setTitle("Quản lí bán xe 2 bánh");
		setSize(1000, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		taoGiaoDien();

	}

	private void taoGiaoDien() {
		JPanel panel6 = new JPanel();

		Box f, f1, f2, f3, f4, f5, f6, f7;
		f = Box.createVerticalBox();
		panel6.add(f, BorderLayout.NORTH);
		f.add(f1 = Box.createHorizontalBox());
		f1.add(Box.createHorizontalStrut(20));
		f.add(Box.createVerticalStrut(10));
		f.add(f2 = Box.createHorizontalBox());
		f2.add(Box.createHorizontalStrut(20));
		f.add(Box.createVerticalStrut(10));
		f.add(f3 = Box.createHorizontalBox());
		f3.add(Box.createHorizontalStrut(20));
		f.add(Box.createVerticalStrut(10));
		f.add(f4 = Box.createHorizontalBox());
		f4.add(Box.createHorizontalStrut(20));
		f.add(Box.createVerticalStrut(10));
		f.add(f5 = Box.createHorizontalBox());
		f5.add(Box.createHorizontalStrut(20));
		f.add(Box.createVerticalStrut(10));
		f.add(f6 = Box.createHorizontalBox());
		f6.add(Box.createHorizontalStrut(20));
		f.add(Box.createVerticalStrut(10));
		f.add(f7 = Box.createHorizontalBox());
		f7.add(Box.createHorizontalStrut(20));
		f.add(Box.createVerticalStrut(10));

		JLabel lblTieude, lblMaNV, lblTenNV, lblChucvu, lblPhongban, lblTrinhdo, lblBactho, lblSonamKN, lblTim6;
		JTextField txtMaNV, txtTenNV, txtChucvu, txtPhongban, txtTrinhdo, txtBactho, txtSonamKN, txtTim6;
		JButton btnthem6, btnxoa6, btnsua6, btntim6, btnluu6;

		JRadioButton radNVHanhchinh, radNVKythuat;

		f1.add(lblTieude = new JLabel("Thông tin nhân viên"));
		lblTieude.setFont(new Font("Arial", Font.BOLD, 28));

		f2.add(lblMaNV = new JLabel("Mã nhân viên:"));
		f2.add(txtMaNV = new JTextField());

		f3.add(lblTenNV = new JLabel("Tên nhân viên:"));
		f3.add(txtTenNV = new JTextField());

		f4.add(lblChucvu = new JLabel("Chức vụ:"));
		f4.add(txtChucvu = new JTextField());

		f5.setBorder(BorderFactory.createTitledBorder("Chọn loại nhân viên"));
		JPanel pChon = new JPanel();
		radNVHanhchinh = new JRadioButton("Nhân viên hành chính");
		radNVKythuat = new JRadioButton("Nhân viên kỹ thuật");
		ButtonGroup gr = new ButtonGroup();
		gr.add(radNVHanhchinh);
		gr.add(radNVKythuat);

		pChon.add(radNVHanhchinh);
		pChon.add(radNVKythuat);
		f5.add(pChon);
		
		f6.add(lblPhongban = new JLabel("Phòng ban:"));
		lblPhongban.setVisible(false);
		f6.add(txtPhongban = new JTextField());
		txtPhongban.setVisible(false);
		
		f6.add(lblTrinhdo = new JLabel("Trình độ:"));
		lblTrinhdo.setVisible(false);
		f6.add(txtTrinhdo = new JTextField());
		txtTrinhdo.setVisible(false);

		f6.add(lblBactho = new JLabel("Bậc thợ:"));
		lblBactho.setVisible(false);
		f6.add(txtBactho = new JTextField());
		txtBactho.setVisible(false);
		f6.add(lblSonamKN = new JLabel("Số năm KN:"));
		lblSonamKN.setVisible(false);
		f6.add(txtSonamKN = new JTextField());
		txtSonamKN.setVisible(false);

		JTable table6 = new JTable();
		DefaultTableModel df6 = new DefaultTableModel();
		JScrollPane sr = new JScrollPane();
		String[] headers = "Khách hàng;Địa chỉ;Số điện thoại".split(";");
		df6 = new DefaultTableModel(headers, 0);
		f7.add(sr = new JScrollPane(table6 = new JTable(df6), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		table6.setPreferredScrollableViewportSize(new Dimension(900, 400));

		JPanel pSouth6 = new JPanel();
		panel6.add(pSouth6, BorderLayout.SOUTH);
		pSouth6.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		pSouth6.add(lblTim6 = new JLabel("Tìm mã nhân viên:"));
		pSouth6.add(txtTim6 = new JTextField(15));
		pSouth6.add(btnthem6 = new JButton("THÊM"));
		btnthem6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("them");
			}
		});
		pSouth6.add(btnxoa6 = new JButton("XÓA"));
		pSouth6.add(btnsua6 = new JButton("SỬA"));
		pSouth6.add(btntim6 = new JButton("TÌM KIẾM"));
		pSouth6.add(btnluu6 = new JButton("LƯU"));

		lblBactho.setPreferredSize(lblTenNV.getPreferredSize());
		lblChucvu.setPreferredSize(lblTenNV.getPreferredSize());
		lblMaNV.setPreferredSize(lblTenNV.getPreferredSize());
		lblPhongban.setPreferredSize(lblTenNV.getPreferredSize());
		lblSonamKN.setPreferredSize(lblTenNV.getPreferredSize());
		lblTrinhdo.setPreferredSize(lblTenNV.getPreferredSize());

		table6.addMouseListener(this);
		btnthem6.addActionListener(this);
		btnthem6.addActionListener(this);
		btnxoa6.addActionListener(this);
		btnsua6.addActionListener(this);
		btntim6.addActionListener(this);
		btnluu6.addActionListener(this);

		radNVHanhchinh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(radNVHanhchinh.isSelected())
					lblPhongban.setVisible(true);
					txtPhongban.setVisible(true);
					lblTrinhdo.setVisible(true);
					txtTrinhdo.setVisible(true);
					lblBactho.setVisible(false);
					txtBactho.setVisible(false);
					lblSonamKN.setVisible(false);
					txtSonamKN.setVisible(false);
			}
		});
		radNVKythuat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(radNVKythuat.isSelected())
					lblBactho.setVisible(true);
					txtBactho.setVisible(true);
					lblSonamKN.setVisible(true);
					txtSonamKN.setVisible(true);
					lblPhongban.setVisible(false);
					txtPhongban.setVisible(false);
					lblTrinhdo.setVisible(false);
					txtTrinhdo.setVisible(false);
				
			}
			
		});
		add(panel6);
	
			
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
}
