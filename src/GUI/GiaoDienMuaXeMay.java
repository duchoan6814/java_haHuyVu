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

public class GiaoDienMuaXeMay extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;

	/**
	* 
	*/
	
	public  GiaoDienMuaXeMay() {
		setTitle("Quản lí bán xe 2 bánh");
		setSize(1000, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		taoGiaoDien();

	}

	private void taoGiaoDien() {
		JPanel panel1 = new JPanel();
		JLabel lblTieude, lblTenKH, lblDiachi, lblSoDT, lblTim5;
		JTextField txtTenKH, txtDiachi, txtSoDT, txtTim5;
		JLabel lblNuocsx, lblLoaixe, lblMauxe, lblSokhung, lblSoPK, lblTim1, lbltenXe;
		JTextField txtNuocsx, txtSokhung, txtTim1;
		 JButton btnThem, btnXoa, btnSua, btnTimkiem, btnLuu;
		JComboBox combobox, cbtenXe;
		// Container cp = getContentPane();

		Box b, b1, b2, b3, b4, b5, b6, b7, b8, b9;
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
		b.add(b9 = Box.createHorizontalBox());
		b9.add(Box.createHorizontalStrut(20));
		b.add(Box.createVerticalStrut(10));
		// cp.add(b);
		
		

		b1.add(lblTenKH = new JLabel("Khách hàng:"));
		b1.add(txtTenKH = new JTextField());
		
		b2.add(lblDiachi = new JLabel("Địa chỉ:"));
		b2.add(txtDiachi = new JTextField());

		b3.add(lblSoDT = new JLabel("Số điện thoại:"));
		b3.add(txtSoDT = new JTextField());
		
		b9.add(lbltenXe = new JLabel("Tên Xe:"));
		DefaultComboBoxModel<String> cbcMode = new DefaultComboBoxModel<String>();
		cbcMode.addElement("Exciter");
		cbcMode.addElement("Vison");
		cbcMode.addElement("ablack");
		cbcMode.addElement("Blade");
		combobox = new JComboBox<String>(cbcMode);
		combobox.setEditable(false);
		b9.add(combobox);
		b4.add(lblMauxe = new JLabel("Màu xe:"));
		DefaultComboBoxModel<String> cbcModel1 = new DefaultComboBoxModel<String>();
		cbcModel1.addElement("Cam");
		cbcModel1.addElement("Trắng");
		cbcModel1.addElement("Đen nhám");
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
		cbcModel12.addElement("150cc");
		combobox = new JComboBox<String>(cbcModel12);
		combobox.setEditable(false);
		b6.add(combobox);

		JTable table1 = new JTable();
		DefaultTableModel df = new DefaultTableModel();
		JScrollPane sr = new JScrollPane();
		String[] headers = "Nước sản xuất;Loại xe;Màu xe;Số khung xe;Số PK".split(";");
		df = new DefaultTableModel(headers, 0);
		b7.add(sr = new JScrollPane(table1 = new JTable(df), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		table1.setPreferredScrollableViewportSize(new Dimension(900, 400));

		JPanel pSouth1 = new JPanel();
		panel1.add(pSouth1, BorderLayout.SOUTH);
		pSouth1.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));

		pSouth1.add(lblTim1 = new JLabel("Tìm mã khung xe:"));
		pSouth1.add(txtTim1 = new JTextField(15));
		pSouth1.add(btnThem = new JButton("THÊM"));
		pSouth1.add(btnXoa = new JButton("XÓA"));
		pSouth1.add(btnSua = new JButton("SỬA"));
		pSouth1.add(btnTimkiem = new JButton("TÌM KIẾM"));
		pSouth1.add(btnLuu = new JButton("LƯU"));
		txtTim1.addActionListener(this);

		lblLoaixe.setPreferredSize(lblLoaixe.getPreferredSize());
		lblMauxe.setPreferredSize(lblMauxe.getPreferredSize());
		lblSoPK.setPreferredSize(lblSoPK.getPreferredSize());

		table1.addMouseListener(this);
		btnThem.addActionListener(this);
		btnXoa.addActionListener(this);
		btnSua.addActionListener(this);
		btnTimkiem.addActionListener(this);
		btnLuu.addActionListener(this);
		add(panel1);
		
	
			
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
