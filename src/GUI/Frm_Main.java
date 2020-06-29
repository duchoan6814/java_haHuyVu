package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//import Dao.ListSach;

public class Frm_Main extends JFrame implements ActionListener, MouseListener {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
//	private XeMay xm;
//	private ListXeMay dao;
//	private List<XeMay> ls;

	public Frm_Main() {
		setDisplay();
		createGUI();
	}

	private void setDisplay() {
		setTitle("Quản lí bán xe 2 bánh");
		setSize(1000, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);

	}

	private void createGUI() {
		add(createTabbedPane());

	}

	private JTabbedPane createTabbedPane() {
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
		add(tabbedPane, BorderLayout.NORTH);
		JPanel pnXemay = createPane1();
		JPanel pnHopdong = createPane2();
		JPanel pnThanhtoan = createPane3();
		JPanel pnPhieuBH = createPane4();
		JPanel pnKhachhang = createPane5();
		JPanel pnNhanvien = createPane6();

		tabbedPane.addTab("Xe 2 bánh", pnXemay);
		tabbedPane.addTab("Hợp đồng", pnHopdong);
		tabbedPane.addTab("Phiếu Thanh Toán", pnThanhtoan);
		tabbedPane.addTab("Phiếu bảo hành", pnPhieuBH);
		tabbedPane.addTab("Khách hàng", pnKhachhang);
		tabbedPane.addTab("Nhân viên", pnNhanvien);
		return tabbedPane;
	}

	private JPanel createPane1() {
		JPanel panel1 = new JPanel();

		// Container cp = getContentPane();

		Box b, b1, b2, b3, b4, b5, b6, b7, b8;
		b = Box.createVerticalBox();
		panel1.add(b, BorderLayout.CENTER);
//	b.add(Box.createVerticalStrut(30));
		b.add(b1 = Box.createHorizontalBox());
		b1.add(Box.createHorizontalStrut(20));
		b.add(Box.createVerticalStrut(10));
		b.add(b2 = Box.createHorizontalBox());
		b2.add(Box.createHorizontalStrut(20));
		b.add(Box.createVerticalStrut(10));
		b.add(b3 = Box.createHorizontalBox());
		b3.add(Box.createHorizontalStrut(20));
		b.add(Box.createVerticalStrut(10));
		b.add(b4 = Box.createHorizontalBox());
		b4.add(Box.createHorizontalStrut(20));
		b.add(Box.createVerticalStrut(10));
		b.add(b5 = Box.createHorizontalBox());
		b5.add(Box.createHorizontalStrut(20));
		b.add(Box.createVerticalStrut(10));
		b.add(b6 = Box.createHorizontalBox());
		b6.add(Box.createHorizontalStrut(20));
		b.add(Box.createVerticalStrut(10));
		b.add(b7 = Box.createHorizontalBox());
		b7.add(Box.createHorizontalStrut(20));
		b.add(Box.createVerticalStrut(10));
		// cp.add(b);

		JLabel lblTieude, lblNuocsx, lblLoaixe, lblMauxe, lblSokhung, lblSoPK, lblTim1;
		JTextField txtNuocsx, txtSokhung, txtTim1;
		JButton btnThem1, btnXoa1, btnSua1, btnTim1, btnLuu1;
		JComboBox combobox;

		b1.add(lblTieude = new JLabel("Thông tin xe máy"), JLabel.CENTER);
		lblTieude.setFont(new Font("Arial", Font.BOLD, 28));
		lblTieude.setForeground(Color.BLACK);

		b2.add(lblNuocsx = new JLabel("Nước sản xuất:"));
		b2.add(txtNuocsx = new JTextField());

		b3.add(lblSokhung = new JLabel("Số khung xe:"));
		b3.add(txtSokhung = new JTextField());

		b4.add(lblMauxe = new JLabel("Màu xe:"));
		DefaultComboBoxModel<String> cbcModel1 = new DefaultComboBoxModel<String>();
		cbcModel1.addElement("Cam");
		cbcModel1.addElement("Trắng");
		combobox = new JComboBox<String>(cbcModel1);
		combobox.setEditable(false);
		b4.add(combobox);

		b5.add(lblLoaixe = new JLabel("Loại xe:"));
		DefaultComboBoxModel<String> cbcModel11 = new DefaultComboBoxModel<String>();
		cbcModel11.addElement("Xe số");
		cbcModel11.addElement("Xe tay côn");
		combobox = new JComboBox<String>(cbcModel11);
		combobox.setEditable(false);
		b5.add(combobox);

		b6.add(lblSoPK = new JLabel("Số PK:"));
		DefaultComboBoxModel<String> cbcModel12 = new DefaultComboBoxModel<String>();
		cbcModel12.addElement("90cc");
		cbcModel12.addElement("110cc");
		combobox = new JComboBox<String>(cbcModel12);
		combobox.setEditable(false);
		b6.add(combobox);

//		if(ls.size()==0)
//		{
//			ls = dao.getLs();
//		}
		JTable table1 = new JTable();
		DefaultTableModel df = new DefaultTableModel();
		JScrollPane sr = new JScrollPane();
		String[] headers = "Nước sản xuất;Số khung xe;Màu xe;Loại xe;Số PK".split(";");
		df = new DefaultTableModel(headers, 0);
		b7.add(sr = new JScrollPane(table1 = new JTable(df), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		table1.setPreferredScrollableViewportSize(new Dimension(900, 400));

		JPanel pSouth1 = new JPanel();
		panel1.add(pSouth1, BorderLayout.SOUTH);
		pSouth1.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));

		pSouth1.add(lblTim1 = new JLabel("Tìm mã khung xe:"));
		pSouth1.add(txtTim1 = new JTextField(15));
		pSouth1.add(btnThem1 = new JButton("THÊM"));
		btnThem1.setForeground(Color.RED);
		pSouth1.add(btnXoa1 = new JButton("XÓA"));
		btnXoa1.setForeground(Color.RED);
		pSouth1.add(btnSua1 = new JButton("SỬA"));
		btnSua1.setForeground(Color.RED);
		pSouth1.add(btnTim1 = new JButton("TÌM KIẾM"));
		btnTim1.setForeground(Color.RED);
		pSouth1.add(btnLuu1 = new JButton("LƯU"));
		btnLuu1.setForeground(Color.RED);
		txtTim1.addActionListener(this);

		lblLoaixe.setPreferredSize(lblNuocsx.getPreferredSize());
		lblMauxe.setPreferredSize(lblNuocsx.getPreferredSize());
		lblSokhung.setPreferredSize(lblNuocsx.getPreferredSize());
		lblSoPK.setPreferredSize(lblNuocsx.getPreferredSize());

		table1.addMouseListener(this);
		btnThem1.addActionListener(this);
		btnXoa1.addActionListener(this);
		btnSua1.addActionListener(this);
		btnTim1.addActionListener(this);
		btnLuu1.addActionListener(this);

		btnThem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
//				if(o.equals(btnThem1)) {
//					try {
//						if(txtSokhung.getText().equals(""))
//							JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin");
//						else
//						{
//							XeMay xm = new XeMay(txtNuocsx.getText(), cbcModel12.getElementAt(cbcModel12.getIndexOf(cbcModel12.getSelectedItem())),
//									cbcModel1.getElementAt(cbcModel1.getIndexOf(cbcModel1.getSelectedItem())),
//									cbcModel11.getElementAt(cbcModel11.getIndexOf(cbcModel11.getSelectedItem())), 
//									Integer.parseInt(txtSokhung.getText()));
//							if(dao.themXeMay(xm))
//								string[] a = {xm.getNuocSX(), xm.getSoKhung()+"" ,xm.getMauXe(), xm.getLoaiXe(), xm.getSoPK()};
//								df.addRow(rowData));
//							
//						}
//					}catch (Exception ex) {
//						// TODO: handle exception
//						ex.printStackTrace();
//					}
//				}
			}

//			private void themAction() {
//				try {
//					if (txtSokhung.getText().equals(" ") || txtNuocsx.getText().equals(" ")) {
//						JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin");
//					} else {
//						XeMay xemay = taoXeMay();
//						dao.themXeMay(xm);
//						ls = dao.getLs();
//					}
//				} catch (Exception v) {
//					JOptionPane.showMessageDialog(null, "Bạn nhập sai địng dạng");
//					v.printStackTrace();
//				}
//			}

//			private XeMay taoXeMay() {
//				String nuocsx = txtNuocsx.getText();
//				String sokhung = txtSokhung.getText();
//				XeMay xemay = new XeMay(nuocsx, Integer.parseInt(sokhung));
//				return xemay;
//			}
		});

//		table1.addMouseListener(new MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			int row = table1.getSelectedRow();
//			if(row != -1) {
//				txtNuocsx.setText(table1.getValueAt(row, 0).toString());
//				txtSokhung.setText(table1.getValueAt(row, 1).toString());
//				if(table1.getValueAt(row, 2).toString().equals("Cam"))
//					combobox.setSelectedIndex(0);
//				if(table1.getValueAt(row, 3).toString().equals("Xe số"))
//					combobox.setSelectedIndex(0);
//				if(table1.getValueAt(row, 4).toString().equals("90cc"))
//					combobox.setSelectedIndex(0);
//			}
//		}	
//	});

		return panel1;
	}

	private JPanel createPane2() {

		JPanel panel2 = new JPanel();
//	panel2.setPreferredSize(new Dimension(800,400));

//	Container cp1 = getContentPane();
		Box a, a1, a2, a3, a4, a5, a6, a7;
		a = Box.createVerticalBox();
		panel2.add(a, BorderLayout.CENTER);
//	a.add(Box.createVerticalStrut(20));
		a.add(a1 = Box.createHorizontalBox());
		a1.add(Box.createHorizontalStrut(20));
		a.add(Box.createVerticalStrut(15));
		a.add(a2 = Box.createHorizontalBox());
		a2.add(Box.createHorizontalStrut(20));
		a.add(Box.createVerticalStrut(10));
		a.add(a3 = Box.createHorizontalBox());
		a3.add(Box.createHorizontalStrut(20));
		a.add(Box.createVerticalStrut(10));
		a.add(a4 = Box.createHorizontalBox());
		a4.add(Box.createHorizontalStrut(20));
		a.add(Box.createVerticalStrut(10));
		a.add(a5 = Box.createHorizontalBox());
		a5.add(Box.createHorizontalStrut(20));
		a.add(Box.createVerticalStrut(10));
		a.add(a6 = Box.createHorizontalBox());
		a6.add(Box.createHorizontalStrut(20));
		a.add(Box.createVerticalStrut(10));
		a.add(a7 = Box.createHorizontalBox());
		a7.add(Box.createHorizontalStrut(20));
		a.add(Box.createVerticalStrut(10));
//	a.add(a8 = Box.createHorizontalBox()); a8.add(Box.createHorizontalStrut(20));
//	a.add(Box.createVerticalStrut(10));

		JLabel lblTieude, lblSoHD, lblNgayHD, lblTgBH, lblTienphaitt, lblTiendatt, lblNvlaphd, lblTen, lblDiachi,
				lblSodt, lblTim2, lblTra, lblSokhung;
		JTextField txtSoHD, txtNgayHD, txtTgBH, txtTienphaitt, txtTiendatt, txtNvlaphd, txtTen, txtDiachi, txtSodt,
				txtTim2, txtSokhung;
		JButton btnthem2, btnxoa2, btnsua2, btntim2, btnluu2;
		JComboBox combobox;

		a1.add(lblTieude = new JLabel("Hợp đồng của khách hàng"), JLabel.CENTER);
		lblTieude.setFont(new Font("Arial", Font.BOLD, 28));

		Box a21, a22;
		a2.add(a21 = Box.createHorizontalBox());
		a2.add(a22 = Box.createHorizontalBox());
		a21.add(lblSoHD = new JLabel("Số Hợp Đồng:"));
		a21.add(txtSoHD = new JTextField());
		a21.add(Box.createHorizontalStrut(15));
		a22.add(lblNgayHD = new JLabel("Ngày Hợp Đồng:"));
		a22.add(txtNgayHD = new JTextField());

		Box a31, a32;
		a3.add(a31 = Box.createHorizontalBox());
		a3.add(a32 = Box.createHorizontalBox());
		a31.add(lblTienphaitt = new JLabel("Tiền phải thanh toán:"));
		a31.add(txtTienphaitt = new JTextField());
		a31.add(Box.createHorizontalStrut(50));
		a32.add(lblTgBH = new JLabel("Thời gian bảo hành:"));
		DefaultComboBoxModel<String> cbcModel21 = new DefaultComboBoxModel<String>();
		cbcModel21.addElement("12 tháng");
		combobox = new JComboBox<String>(cbcModel21);
		combobox.setEditable(false);
		a32.add(combobox);

		Box a41, a42;
		a4.add(a41 = Box.createHorizontalBox());
		a4.add(a42 = Box.createHorizontalBox());
		a41.add(lblTiendatt = new JLabel("Tiền đã thanh toán:"));
		a41.add(txtTiendatt = new JTextField());
		a41.add(Box.createHorizontalStrut(15));
		a42.add(lblNvlaphd = new JLabel("NV lập hợp đồng:"));
		a42.add(txtNvlaphd = new JTextField());

		Box a51, a52;
		a5.add(a51 = Box.createHorizontalBox());
		a5.add(a52 = Box.createHorizontalBox());
		a51.add(lblTen = new JLabel("Tên khách hàng:"));
		a51.add(txtTen = new JTextField());
		a51.add(Box.createHorizontalStrut(15));
		a52.add(lblSokhung = new JLabel("Số khung xe:"));
		a52.add(txtSokhung = new JTextField());

		a6.add(lblTra = new JLabel("Trả:"));
		DefaultComboBoxModel<String> cbcModel2 = new DefaultComboBoxModel<String>();
		cbcModel2.addElement("1 Lần");
		cbcModel2.addElement("2 Lần");
		combobox = new JComboBox<String>(cbcModel2);
		combobox.setEditable(false);
		a6.add(combobox);

		JTable table2 = new JTable();
		DefaultTableModel df1 = new DefaultTableModel();
		JScrollPane sr1 = new JScrollPane();
		String[] headers1 = "Số HĐ;Ngày HĐ;Thời gian BH;Tiền phải TT;Tiền đã TT;NV lập HĐ;Tên KH;Số khung xe;Trả"
				.split(";");
		df1 = new DefaultTableModel(headers1, 0);
		a7.add(sr1 = new JScrollPane(table2 = new JTable(df1), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		table2.setPreferredScrollableViewportSize(new Dimension(900, 400));

		JPanel pSouth2 = new JPanel();
		panel2.add(pSouth2, BorderLayout.SOUTH);
		pSouth2.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));

		pSouth2.add(lblTim2 = new JLabel("Tìm số HĐ:"));
		pSouth2.add(txtTim2 = new JTextField(15));
		pSouth2.add(btnthem2 = new JButton("THÊM"));
		btnthem2.setForeground(Color.RED);
		pSouth2.add(btnxoa2 = new JButton("XÓA"));
		btnxoa2.setForeground(Color.RED);
		pSouth2.add(btnsua2 = new JButton("SỬA"));
		btnsua2.setForeground(Color.RED);
		pSouth2.add(btntim2 = new JButton("TÌM KIẾM"));
		btntim2.setForeground(Color.RED);
		pSouth2.add(btnluu2 = new JButton("LƯU"));
		btnluu2.setForeground(Color.RED);
		lblNgayHD.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblTra.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblNvlaphd.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblSoHD.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblTen.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblTgBH.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblTiendatt.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblSokhung.setPreferredSize(lblTienphaitt.getPreferredSize());

		table2.addMouseListener(this);
		btnthem2.addActionListener(this);
		btnthem2.addActionListener(this);
		btnxoa2.addActionListener(this);
		btnsua2.addActionListener(this);
		btntim2.addActionListener(this);
		btnluu2.addActionListener(this);

		return panel2;
	}

	private JPanel createPane3() {
		JPanel panel3 = new JPanel();

		Box c, c1, c2, c3, c4, c5;
		c = Box.createVerticalBox();
		panel3.add(c, BorderLayout.CENTER);
		c.add(c1 = Box.createHorizontalBox());
		c1.add(Box.createHorizontalStrut(20));
		c.add(Box.createVerticalStrut(10));
		c.add(c2 = Box.createHorizontalBox());
		c2.add(Box.createHorizontalStrut(20));
		c.add(Box.createVerticalStrut(10));
		c.add(c3 = Box.createHorizontalBox());
		c3.add(Box.createHorizontalStrut(20));
		c.add(Box.createVerticalStrut(10));
		c.add(c4 = Box.createHorizontalBox());
		c4.add(Box.createHorizontalStrut(20));
		c.add(Box.createVerticalStrut(10));
		c.add(c5 = Box.createHorizontalBox());
		c5.add(Box.createHorizontalStrut(20));
		c.add(Box.createVerticalStrut(10));

		JLabel lblTieude, lblSoHD, lblSokhung, lblNgaytra, lblSotien, lblNguoitra, lblTim3, lblthuoc, lblMaTT;
		JTextField txtSoHD, txtSokhung, txtNgaytra, txtSotien, txtNguoitra, txtTim3, txtMaTT;
		JButton btnthem3, btnxoa3, btnsua3, btntim3, btnluu3;
		JComboBox<String> combobox;

		c1.add(lblTieude = new JLabel("Phiếu thanh toán"), JLabel.CENTER);
		lblTieude.setFont(new Font("Arial", Font.BOLD, 35));

		Box c21, c22;
		c2.add(c21 = Box.createHorizontalBox());
		c2.add(c22 = Box.createHorizontalBox());
		c21.add(lblNguoitra = new JLabel("Khách hàng:"));
		c21.add(txtNguoitra = new JTextField());
		c21.add(Box.createHorizontalStrut(10));
		c22.add(lblMaTT = new JLabel("Mã thanh toán:"));
		c22.add(txtMaTT = new JTextField());

		Box c31, c32;
		c3.add(c31 = Box.createHorizontalBox());
		c3.add(c32 = Box.createHorizontalBox());
		c31.add(lblSoHD = new JLabel("Số HĐ:"));
		c31.add(txtSoHD = new JTextField());
		c31.add(Box.createHorizontalStrut(10));
		c32.add(lblSokhung = new JLabel("Số khung"));
		c32.add(txtSokhung = new JTextField());

		Box c41, c42;
		c4.add(c41 = Box.createHorizontalBox());
		c4.add(c42 = Box.createHorizontalBox());
		c41.add(lblNgaytra = new JLabel("Ngày trả:"));
		c41.add(txtNgaytra = new JTextField());
		c41.add(Box.createHorizontalStrut(10));
		c42.add(lblSotien = new JLabel("Số tiền:"));
		c42.add(txtSotien = new JTextField());

		JTable table3 = new JTable();
		DefaultTableModel df3 = new DefaultTableModel();
		JScrollPane sr = new JScrollPane();
		String[] headers = "Khách hàng;Mã thanh toán;Số HĐ;Số khung;Ngày trả;Số tiền".split(";");
		df3 = new DefaultTableModel(headers, 0);
		c5.add(sr = new JScrollPane(table3 = new JTable(df3), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		table3.setPreferredScrollableViewportSize(new Dimension(900, 400));

		JPanel pSouth3 = new JPanel();
		panel3.add(pSouth3, BorderLayout.SOUTH);
		pSouth3.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));

		pSouth3.add(lblTim3 = new JLabel("Tìm mã phiếu thanh toán:"));
		pSouth3.add(txtTim3 = new JTextField(15));
		pSouth3.add(btnthem3 = new JButton("THÊM"));
		btnthem3.setForeground(Color.RED);
		pSouth3.add(btnxoa3 = new JButton("XÓA"));
		btnxoa3.setForeground(Color.RED);
		pSouth3.add(btnsua3 = new JButton("SỬA"));
		btnsua3.setForeground(Color.RED);
		pSouth3.add(btntim3 = new JButton("TÌM KIẾM"));
		btntim3.setForeground(Color.RED);
		pSouth3.add(btnluu3 = new JButton("LƯU"));
		btnluu3.setForeground(Color.RED);
		lblNguoitra.setPreferredSize(lblMaTT.getPreferredSize());
		lblNgaytra.setPreferredSize(lblMaTT.getPreferredSize());
		lblSoHD.setPreferredSize(lblMaTT.getPreferredSize());
		lblSokhung.setPreferredSize(lblMaTT.getPreferredSize());
		lblSotien.setPreferredSize(lblMaTT.getPreferredSize());

		table3.addMouseListener(this);
		btnthem3.addActionListener(this);
		btnthem3.addActionListener(this);
		btnxoa3.addActionListener(this);
		btnsua3.addActionListener(this);
		btntim3.addActionListener(this);
		btnluu3.addActionListener(this);

		return panel3;
	}

	private JPanel createPane4() {
		JPanel panel4 = new JPanel();

		Box d, d1, d2, d3, d4, d5, d6;
		d = Box.createVerticalBox();
		panel4.add(d, BorderLayout.CENTER);
		d.add(d1 = Box.createHorizontalBox());
		d1.add(Box.createHorizontalStrut(20));
		d.add(Box.createVerticalStrut(10));
		d.add(d2 = Box.createHorizontalBox());
		d2.add(Box.createHorizontalStrut(20));
		d.add(Box.createVerticalStrut(10));
		d.add(d3 = Box.createHorizontalBox());
		d3.add(Box.createHorizontalStrut(20));
		d.add(Box.createVerticalStrut(10));
		d.add(d4 = Box.createHorizontalBox());
		d4.add(Box.createHorizontalStrut(20));
		d.add(Box.createVerticalStrut(10));
		d.add(d5 = Box.createHorizontalBox());
		d5.add(Box.createHorizontalStrut(20));
		d.add(Box.createVerticalStrut(10));
		d.add(d6 = Box.createHorizontalBox());
		d6.add(Box.createHorizontalStrut(20));
		d.add(Box.createVerticalStrut(10));

		JLabel lblTenKH, lblTenNV, lblLinhkien, lblLidoBH, lblLoi, lblGiatien, lblTieude, lblTim4, lblThuoc, lblMaBH;
		JTextField txtTenKH, txtTenNV, txtLinhkien, txtLidoBH, txtGiatien, txtTim4, txtMaBH;
		JButton btnthem4, btnxoa4, btnsua4, btntim4, btnluu4;
		JComboBox combobox;

		d1.add(lblTieude = new JLabel("Phiếu bảo hành"), JLabel.CENTER);
		lblTieude.setFont(new Font("Arial", Font.BOLD, 28));

		Box d21, d22;
		d2.add(d21 = Box.createHorizontalBox());
		d2.add(d22 = Box.createHorizontalBox());
		d21.add(lblTenKH = new JLabel("Khách hàng:"));
		d21.add(txtTenKH = new JTextField());
		d21.add(Box.createHorizontalStrut(10));
		d22.add(lblLinhkien = new JLabel("Linh kiện:"));
		d22.add(txtLinhkien = new JTextField());

		Box d31, d32;
		d3.add(d31 = Box.createHorizontalBox());
		d3.add(d32 = Box.createHorizontalBox());
//	d3.setLayout(new BoxLayout(d3, BoxLayout.Y_AXIS));
		d31.add(lblLidoBH = new JLabel("Lí do BH:"));
		d31.add(txtLidoBH = new JTextField());
		d31.add(Box.createHorizontalStrut(10));
		d31.setBounds(10, 10, 10, 10);
		d32.add(lblLoi = new JLabel("Lỗi thuộc:"));
		DefaultComboBoxModel<String> cbcModel4 = new DefaultComboBoxModel<String>();
		cbcModel4.addElement("Khách hàng");
		cbcModel4.addElement("Sản phẩm");
		combobox = new JComboBox<String>(cbcModel4);
		combobox.setEditable(false);
		d3.add(combobox);

		Box d41, d42;
		d4.add(d41 = Box.createHorizontalBox());
		d4.add(d42 = Box.createHorizontalBox());
		d41.add(lblTenNV = new JLabel("Tên nhân viên:"));
		d41.add(txtTenNV = new JTextField());
		d41.add(Box.createHorizontalStrut(10));
		d42.add(lblThuoc = new JLabel("Thuộc:"));
		DefaultComboBoxModel<String> cbcModel41 = new DefaultComboBoxModel<String>();
		cbcModel41.addElement("Nhân viên kỹ thuật");
		combobox = new JComboBox<String>(cbcModel41);
		combobox.setEditable(false);
		d42.add(combobox);

		Box d51, d52;
		d5.add(d51 = Box.createHorizontalBox());
		d5.add(d52 = Box.createHorizontalBox());
		d51.add(lblGiatien = new JLabel("Giá tiền:"));
		d51.add(txtGiatien = new JTextField());
		d51.add(Box.createHorizontalStrut(10));
		d51.add(lblMaBH = new JLabel("Mã bảo hành:"));
		d51.add(txtMaBH = new JTextField());

		JTable table4 = new JTable();
		DefaultTableModel df4 = new DefaultTableModel();
		JScrollPane sr = new JScrollPane();
		String[] headers = "Khách hàng;Linh kiện;Lí do BH;Lỗi thuộc;Tên NV;Giá tiền;Mã bảo hành".split(";");
		df4 = new DefaultTableModel(headers, 0);
		d6.add(sr = new JScrollPane(table4 = new JTable(df4), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		table4.setPreferredScrollableViewportSize(new Dimension(900, 400));

		JPanel pSouth4 = new JPanel();
		panel4.add(pSouth4, BorderLayout.SOUTH);
		pSouth4.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		pSouth4.add(lblTim4 = new JLabel("Tìm mã bảo hành:"));
		pSouth4.add(txtTim4 = new JTextField(15));
		pSouth4.add(btnthem4 = new JButton("THÊM"));
		btnthem4.setForeground(Color.RED);
		pSouth4.add(btnxoa4 = new JButton("XÓA"));
		btnxoa4.setForeground(Color.RED);
		pSouth4.add(btnsua4 = new JButton("SỬA"));
		btnsua4.setForeground(Color.RED);
		pSouth4.add(btntim4 = new JButton("TÌM KIẾM"));
		btntim4.setForeground(Color.RED);
		pSouth4.add(btnluu4 = new JButton("LƯU"));
		btnluu4.setForeground(Color.RED);
		txtTim4.addActionListener(this);

		lblGiatien.setPreferredSize(lblTenNV.getPreferredSize());
		lblLidoBH.setPreferredSize(lblTenNV.getPreferredSize());
		lblLinhkien.setPreferredSize(lblTenNV.getPreferredSize());
		lblLoi.setPreferredSize(lblTenNV.getPreferredSize());
		lblTenKH.setPreferredSize(lblTenNV.getPreferredSize());

		table4.addMouseListener(this);
		btnthem4.addActionListener(this);
		btnthem4.addActionListener(this);
		btnxoa4.addActionListener(this);
		btnsua4.addActionListener(this);
		btntim4.addActionListener(this);
		btnluu4.addActionListener(this);

		return panel4;
	}

	private JPanel createPane5() {
		JPanel panel5 = new JPanel();

		Box e, e1, e2, e3, e4;
		e = Box.createVerticalBox();
		panel5.add(e, BorderLayout.CENTER);
		e.add(e1 = Box.createHorizontalBox());
		e1.add(Box.createHorizontalStrut(20));
		e.add(Box.createVerticalStrut(10));
		e.add(e2 = Box.createHorizontalBox());
		e2.add(Box.createHorizontalStrut(20));
		e.add(Box.createVerticalStrut(10));
		e.add(e3 = Box.createHorizontalBox());
		e3.add(Box.createHorizontalStrut(20));
		e.add(Box.createVerticalStrut(10));
		e.add(e4 = Box.createHorizontalBox());
		e4.add(Box.createHorizontalStrut(20));
		e.add(Box.createVerticalStrut(10));

		JLabel lblTieude, lblTenKH, lblDiachi, lblSoDT, lblTim5;
		JTextField txtTenKH, txtDiachi, txtSoDT, txtTim5;
		JButton btnthem5, btnxoa5, btnsua5, btntim5, btnluu5;

		e1.add(lblTieude = new JLabel("Thông tin khách hàng"), JLabel.CENTER);
		lblTieude.setFont(new Font("Arial", Font.BOLD, 28));

		Box e21, e22;
		e2.add(e21 = Box.createHorizontalBox());
		e2.add(e22 = Box.createHorizontalBox());
		e21.add(lblTenKH = new JLabel("Khách hàng:"));
		e21.add(txtTenKH = new JTextField());
		e21.add(Box.createHorizontalStrut(10));
		e22.add(lblDiachi = new JLabel("Địa chỉ:"));
		e22.add(txtDiachi = new JTextField());

		e3.add(lblSoDT = new JLabel("Số điện thoại:"));
		e3.add(txtSoDT = new JTextField());
		e3.add(Box.createHorizontalStrut(464));

		JTable table5 = new JTable();
		DefaultTableModel df5 = new DefaultTableModel();
		JScrollPane sr = new JScrollPane();
		String[] headers = "Khách hàng;Địa chỉ;Số điện thoại".split(";");
		df5 = new DefaultTableModel(headers, 0);
		e4.add(sr = new JScrollPane(table5 = new JTable(df5), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		table5.setPreferredScrollableViewportSize(new Dimension(900, 400));

		JPanel pSouth5 = new JPanel();
		panel5.add(pSouth5, BorderLayout.SOUTH);
		pSouth5.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		pSouth5.add(lblTim5 = new JLabel("Tìm số điện thoại:"));
		pSouth5.add(txtTim5 = new JTextField(15));
		pSouth5.add(btnthem5 = new JButton("THÊM"));
		btnthem5.setForeground(Color.RED);
		pSouth5.add(btnxoa5 = new JButton("XÓA"));
		btnxoa5.setForeground(Color.RED);
		pSouth5.add(btnsua5 = new JButton("SỬA"));
		btnsua5.setForeground(Color.RED);
		pSouth5.add(btntim5 = new JButton("TÌM KIẾM"));
		btntim5.setForeground(Color.RED);
		pSouth5.add(btnluu5 = new JButton("LƯU"));
		btnluu5.setForeground(Color.RED);
		txtTim5.addActionListener(this);

		lblDiachi.setPreferredSize(lblSoDT.getPreferredSize());
		lblTenKH.setPreferredSize(lblSoDT.getPreferredSize());

		table5.addMouseListener(this);
		btnthem5.addActionListener(this);
		btnthem5.addActionListener(this);
		btnxoa5.addActionListener(this);
		btnsua5.addActionListener(this);
		btntim5.addActionListener(this);
		btnluu5.addActionListener(this);

		return panel5;
	}

	private JPanel createPane6() {

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
		String[] headers = "Mã nhân viên;Tên nhân viên;Chức vụ;Phòng ban;Trình độ;Bậc thợ;Số năm KN".split(";");
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
		btnthem6.setForeground(Color.RED);
		pSouth6.add(btnxoa6 = new JButton("XÓA"));
		btnxoa6.setForeground(Color.RED);
		pSouth6.add(btnsua6 = new JButton("SỬA"));
		btnsua6.setForeground(Color.RED);
		pSouth6.add(btntim6 = new JButton("TÌM KIẾM"));
		btntim6.setForeground(Color.RED);
		pSouth6.add(btnluu6 = new JButton("LƯU"));
		btnluu6.setForeground(Color.RED);
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
				if (radNVHanhchinh.isSelected())
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
				if (radNVKythuat.isSelected())
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
//		radNVHanhchinh.addActionListener(this);
//		radNVKythuat.addActionListener(this);
		return panel6;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

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

	public static void main(String args[]) {
		new Frm_Main();
	}
}