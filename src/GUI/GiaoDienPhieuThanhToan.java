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

public class GiaoDienPhieuThanhToan extends JFrame implements ActionListener, MouseListener {
	
	private static final long serialVersionUID = 1L;

	/**
	* 
	*/
	
	public  GiaoDienPhieuThanhToan() {
		setTitle("Quản lí bán xe 2 bánh");
		setSize(1000, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		taoGiaoDien();

	}

	private void taoGiaoDien() {
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

		pSouth3.add(lblTim3 = new JLabel("Tìm mã thanh toán:"));
		pSouth3.add(txtTim3 = new JTextField(15));
		pSouth3.add(btnthem3 = new JButton("THÊM"));
		pSouth3.add(btnxoa3 = new JButton("XÓA"));
		pSouth3.add(btnsua3 = new JButton("SỬA"));
		pSouth3.add(btntim3 = new JButton("TÌM KIẾM"));
		pSouth3.add(btnluu3 = new JButton("LƯU"));

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
		add(panel3);
		
	
			
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
