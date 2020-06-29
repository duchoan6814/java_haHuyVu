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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GiaoDienBaoHanh extends JFrame implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;

	/**
	* 
	*/
	
	public  GiaoDienBaoHanh() {
		setTitle("Quản lí bán xe 2 bánh");
		setSize(1000, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		taoGiaoDien();

	}

	private void taoGiaoDien() {
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
		String[] headers = "Khách hàng;Linh kiện;Lí do BH;Lỗi thuộc;Tên NV;Thuộc;Giá tiền;Mã bảo hành".split(";");
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
		pSouth4.add(btnxoa4 = new JButton("XÓA"));
		pSouth4.add(btnsua4 = new JButton("SỬA"));
		pSouth4.add(btntim4 = new JButton("TÌM KIẾM"));
		pSouth4.add(btnluu4 = new JButton("LƯU"));
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

		add(panel4);
		
	
			
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
