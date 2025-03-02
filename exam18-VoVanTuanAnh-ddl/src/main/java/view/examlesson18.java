package view;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateOrderDetail;
import dao.HibernateStoreItem;

public class examlesson18 {
	public static void main(String[] args) {
		System.out.println("------------------------------------");
		System.out.println("<-------Bat dau chuong trinh------->");
		System.out.println("--------------------------------");
		
		//cau 1
		HibernateOrderDetail dao1 = new HibernateOrderDetail();
        LocalDate queryDate = LocalDate.of(2024, 11, 1);  
        
        List<Object[]> itemsSold = dao1.getItemsSoldOnDate(queryDate);
        System.out.println("Danh sách mặt hàng bán trong ngày " + queryDate + ":");
        for (Object[] row : itemsSold) {
            System.out.println("ID: " + row[0] + ", Name: " + row[1] + ", Time: " + row[2]);
        }
        
        //cau 2
        HibernateStoreItem dao2 = new HibernateStoreItem();

        List<Object[]> inventoryStats = dao2.getInventoryByStore();
        System.out.println("Thống kê hàng tồn kho theo cửa hàng:");
        for (Object[] row : inventoryStats) {
            System.out.println("Store ID: " + row[0] + " - " + row[1] +
                               " Item ID: " + row[2] + " Name: " + row[3] + 
                               " Stock: " + row[4]);
        }
        
        //cau 3
        
        System.out.println("------------------------------------");
        System.out.println("<-------Ket thuc chuong trinh------->");
		System.out.println("------------------------------------");
    }
}	
