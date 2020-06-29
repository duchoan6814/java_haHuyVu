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

public class GiaoDienHopDong extends JFrame implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;

	/**
	* 
	*/
	
	public  GiaoDienHopDong() {
		setTitle("Quản lí bán xe 2 bánh");
		setSize(1000, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		taoGiaoDien();

	}

	private void taoGiaoDien() {
		JPanel panel2 = new JPanel();
//		panel2.setPreferredSize(new Dimension(800,400));

//		Container cp1 = getContentPane();
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
		JButton btnthem1, btnxoa1, btnsua1, btntim1, btnluu1;
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
		pSouth2.add(btnthem1 = new JButton("THÊM"));
		pSouth2.add(btnxoa1 = new JButton("XÓA"));
		pSouth2.add(btnsua1 = new JButton("SỬA"));
		pSouth2.add(btntim1 = new JButton("TÌM KIẾM"));
		pSouth2.add(btnluu1 = new JButton("LƯU"));

		lblNgayHD.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblTra.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblNvlaphd.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblSoHD.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblTen.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblTgBH.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblTiendatt.setPreferredSize(lblTienphaitt.getPreferredSize());
		lblSokhung.setPreferredSize(lblTienphaitt.getPreferredSize());

		table2.addMouseListener(this);
		btnthem1.addActionListener(this);
		btnthem1.addActionListener(this);
		btnxoa1.addActionListener(this);
		btnsua1.addActionListener(this);
		btntim1.addActionListener(this);
		btnluu1.addActionListener(this);
		add(panel2);
		
	
			
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
