package lesson05.bai5;

import java.util.ArrayList;

public class Bai5 {
	public static void main(String[] args) {
		Sach[] sachArray = new Sach[5];

        sachArray[0] = new SachGiaoKhoa("SGK001", 49, "Nhi Dong", "Mới");
        sachArray[1] = new SachGiaoKhoa("SGK002", 52, "Thanh Nien", "Cũ");
        sachArray[2] = new SachGiaoKhoa("SGK003", 180, "Nhi Dong", "Mới");
        sachArray[3] = new SachThamKhao("STK001", 200, "Thanh Nien", 0.1);
        sachArray[4] = new SachThamKhao("STK002", 250, "Nhi Dong", 0.15);

        System.out.println("Cua hang sach:");
        for (Sach sach : sachArray) {
            if (sach instanceof SachGiaoKhoa) {
                SachGiaoKhoa sgk = (SachGiaoKhoa) sach;
                System.out.println(sgk);
            } else if (sach instanceof SachThamKhao) {
                SachThamKhao stk = (SachThamKhao) sach;
                System.out.println(stk);
            }
        }
        
        //tim sach nhi dong
        ArrayList<Sach> sachNhiDong = timSachTheoNXB(sachArray, "Nhi Dong");
        if (sachNhiDong.isEmpty()) {
            System.out.println("Khong co sach cua Nhi Dong ");
        } else {
        	 System.out.println("Sach Nhi Dong :");
             for (Sach sach : sachNhiDong) {
                 if (sach instanceof SachGiaoKhoa) {
                     SachGiaoKhoa sgk = (SachGiaoKhoa) sach;
                     System.out.println(sgk);
                 } else if (sach instanceof SachThamKhao) {
                     SachThamKhao stk = (SachThamKhao) sach;
                     System.out.println(stk);
                 }
             }
        }
        
        //sach co gia duoi 50
        ArrayList<Sach> sachDuoi50 = timSachTheoDonGiaDuoi(sachArray, 50);
        if (sachDuoi50.isEmpty()) {
            System.out.println("Khong co sach duoi 50");
        } else {
        	 System.out.println("Sach co gia duoi 50 : ");
             for (Sach sach : sachDuoi50) {
                 if (sach instanceof SachGiaoKhoa) {
                     SachGiaoKhoa sgk = (SachGiaoKhoa) sach;
                     System.out.println(sgk);
                 } else if (sach instanceof SachThamKhao) {
                     SachThamKhao stk = (SachThamKhao) sach;
                     System.out.println(stk);
                 }
             }
        }
        
        //Sach co gia tu 100 den 200
        ArrayList<Sach> sachtu100den200 = timSachTheoDonGia(sachArray, 100, 200);
        if (sachDuoi50.isEmpty()) {
            System.out.println("Khong co sach tu 100 den 200");
        } else {
        	 System.out.println("Sach co gia tu 100 den 200 : ");
             for (Sach sach : sachtu100den200) {
                 if (sach instanceof SachGiaoKhoa) {
                     SachGiaoKhoa sgk = (SachGiaoKhoa) sach;
                     System.out.println(sgk);
                 } else if (sach instanceof SachThamKhao) {
                     SachThamKhao stk = (SachThamKhao) sach;
                     System.out.println(stk);
                 }
             }
        }
        
        //Tong tien
        // Đây em tính thử 5 cuốn luôn nha a Quyền
        double tongTien = tinhTongTienMuaSach(sachArray);
        System.out.println("tong tien : " + tongTien);
	}
	
	//ham tim sach theo NXB
	public static ArrayList<Sach> timSachTheoNXB(Sach[] sachArray, String nxb) {
        ArrayList<Sach> sachTheoNXB = new ArrayList<>();
        for (Sach sach : sachArray) {
            if (sach.getNXB().equals(nxb)) {
                sachTheoNXB.add(sach);
            }
        }
        return sachTheoNXB;
    }
	
	//Ham tim sach theo gia
	public static ArrayList<Sach> timSachTheoDonGiaDuoi(Sach[] sachArray, double donGiaDuoi) {
        ArrayList<Sach> sachTheoDonGiaDuoi = new ArrayList<>();
        for (Sach sach : sachArray) {
            if (sach.getDonGia() < donGiaDuoi) {
                sachTheoDonGiaDuoi.add(sach);
            }
        }
        return sachTheoDonGiaDuoi;
    }
	
	public static ArrayList<Sach> timSachTheoDonGia(Sach[] sachArray, double donGiaDuoi, double donGiaTren) {
        ArrayList<Sach> sachTheoDonGiaDuoi = new ArrayList<>();
        for (Sach sach : sachArray) {
            if (sach.getDonGia() >= donGiaDuoi && sach.getDonGia() <= donGiaTren) {
                sachTheoDonGiaDuoi.add(sach);
            }
        }
        return sachTheoDonGiaDuoi;
    }
	
	//Ham tinh tong tien
	public static double tinhTongTienMuaSach(Sach[] sachArray) {
        double tongTien = 0;

        for (Sach sach : sachArray) {
            if (sach instanceof SachGiaoKhoa) {
                SachGiaoKhoa sgk = (SachGiaoKhoa) sach;
                double donGia = sgk.getDonGia();
                if (sgk.getTinhTrang().equals("Cũ")) {
                    donGia *= 0.7; 
                }
                tongTien += donGia;
            }
        }

        for (Sach sach : sachArray) {
            if (sach instanceof SachThamKhao) {
                SachThamKhao stk = (SachThamKhao) sach;
                double donGia = stk.getDonGia();
                double thue = stk.getThue();
                tongTien += donGia * (1 + thue);
            }
        }

        return tongTien;
    }
}
