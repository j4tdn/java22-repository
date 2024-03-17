package bai2;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class add {
public static void main(String[] args) {
	
	Customer c1 = new Customer("1", "Leviet");
	Customer c2 = new Customer("2", "HuyTu");
	Customer c3 = new Customer("3", "HaiNam");
	Customer c4 = new Customer("4", "DiemKinh");
	
	
	Item i1 = new Item("sh1", "CR-V", 100, 350000d);
	Item i2 = new Item("sh2", "kia-moning", 300, 300000d);
	Item i3 = new Item("sh3", "CX-5", 500, 500000d);
	Item i4 = new Item("sh4", "Mazda3", 150, 245000d);
	
    Other o1 = new Other(c1 , i2);
    Other o3 = new Other(c2 , i4);
    Other o4 = new Other(c3 , i3);
    Other o5 = new Other(c4, i1);
     
    //Customer t1 = new Customer();
    
    //o1.getCustomer().getName();
    
// System.out.println("Ten   "  + " loai xe   " + " dung tich" + "gia tri" +"thue phai nop");
// System.out.println(o1.getCustomer().getName());
    JFrame frame = new JFrame("Bảng dữ liệu");
    frame.setSize(600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    // Tạo table
    JTable table = new JTable();
    table.setModel(new DefaultTableModel(
        new Object[][] {
            { o1.getCustomer().getName(), o1.getItem().getName(), o1.getItem().getXylanh(), o1.getItem().getValue(), o1.export()},
            { o4.getCustomer().getName(), o4.getItem().getName(), o4.getItem().getXylanh(), o4.getItem().getValue(), o4.export()},
            { o3.getCustomer().getName(), o3.getItem().getName(), o3.getItem().getXylanh(), o3.getItem().getValue(), o3.export() },
        },
        new String[] {
            "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp"
        }
    ));

    // Tạo scroll pane cho table
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension(500, 300));

    panel.add(scrollPane, BorderLayout.CENTER);

    // Thêm panel vào frame
    frame.add(panel);

    frame.setVisible(true);
 
	
}
}
