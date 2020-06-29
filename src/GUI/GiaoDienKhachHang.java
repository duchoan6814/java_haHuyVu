package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import DAO.DAOKhachHang;
import entity.KhachHang;

public class GiaoDienKhachHang extends JFrame implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	private DAOKhachHang daoKhachHang = new DAOKhachHang();
	private DefaultTableModel df5;
	JButton btnthem5, btnxoa5, btnsua5, btntim5, btnluu5;

	/**
	* 
	*/
	
	public  GiaoDienKhachHang() {
		setTitle("Quản lí bán xe 2 bánh");
		setSize(1000, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		taoGiaoDien();

	}

	private void taoGiaoDien() {
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
		df5 = new DefaultTableModel();
		JScrollPane sr = new JScrollPane();
		String[] headers = "Khách hàng;Địa chỉ;Số điện thoại".split(";");
		df5 = new DefaultTableModel(headers, 0);
		e4.add(sr = new JScrollPane(table5 = new JTable(df5), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		table5.setPreferredScrollableViewportSize(new Dimension(900, 400));
		
		getDataToTable();

		JPanel pSouth5 = new JPanel();
		panel5.add(pSouth5, BorderLayout.SOUTH);
		pSouth5.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		pSouth5.add(lblTim5 = new JLabel("Tìm số điện thoại:"));
		pSouth5.add(txtTim5 = new JTextField(15));
		pSouth5.add(btnthem5 = new JButton("THÊM"));
		pSouth5.add(btnxoa5 = new JButton("XÓA"));
		pSouth5.add(btnsua5 = new JButton("SỬA"));
		pSouth5.add(btntim5 = new JButton("TÌM KIẾM"));
		pSouth5.add(btnluu5 = new JButton("LƯU"));
		txtTim5.addActionListener(this);

		lblDiachi.setPreferredSize(lblSoDT.getPreferredSize());
		lblTenKH.setPreferredSize(lblSoDT.getPreferredSize());
		
		btnluu5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				KhachHang a = new KhachHang();
				a.setMaKhachHang(UUID.randomUUID().toString());
				a.setHoTenDep(txtTenKH.getText());
				a.setTen(txtTenKH.getText().split(" ")[txtTenKH.getText().split(" ").length - 1]);
				a.setDiaChi(txtDiachi.getText());
				a.setSdt(txtSoDT.getText());
				if(!daoKhachHang.themKhachHang(a))
					JOptionPane.showMessageDialog(null, "Thêm khách hàng không thành công!");
				getDataToTable();
			}
		});

		table5.addMouseListener(this);
		btnthem5.addActionListener(this);
		btnthem5.addActionListener(this);
		btnxoa5.addActionListener(this);
		btnsua5.addActionListener(this);
		btntim5.addActionListener(this);
		btnluu5.addActionListener(this);


		add(panel5);
		
	
			
		}
	
	public void getDataToTable() {
		ArrayList<KhachHang> a = daoKhachHang.getListKhachHang();
		System.out.println(a);
		df5.setRowCount(0);
		for (KhachHang khachHang : a) {
			df5.addRow(new Object[] {
					khachHang.getHoTenDep()+" "+khachHang.getTen(),
					khachHang.getDiaChi(),
					khachHang.getSdt()
			});
		}
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
