package Bai4;

public class Main {
	public static void main(String[] args) {
		
		GiamDoc gd = new GiamDoc("GD1", "1997", 2,2);
		GiamDoc[] listGD = {gd};
		
		TruongPhong tp1 = new TruongPhong("TP1","1999",1,1,"Phong 1");
		TruongPhong tp2 = new TruongPhong("TP2","2000",2,1,"Phong 2");
		TruongPhong[] listTP = {tp1,tp2};
		
		NhanVien nv1 = new NhanVien("NV1","2003",1,"Phong 1",tp1);
		NhanVien nv2 = new NhanVien("NV2","2004",1,"Phong 2",tp2);
		NhanVien nv3 = new NhanVien("NV3","2005",1,"Phong 2",tp2);
		NhanVien nv4 = new NhanVien("NV4","2001",1,"Phong 1",tp1);
		NhanVien nv5 = new NhanVien("NV5","2000",1,"Phong 2",tp2);
		NhanVien nv6 = new NhanVien("NV6","2004",1,"Phong 1",tp1);
		NhanVien[] listNV = {nv1,nv2,nv3,nv4,nv5,nv6};
		
		print(listGD,listTP,listNV);
		System.out.println("\n");
		NVtheoTP(listTP,listNV);
		System.out.println("\n");
		Luong(listGD,listTP,listNV );
	}
	
	public static void print(GiamDoc[] listGD, TruongPhong[] listTP, NhanVien[] listNV ) {
		for(GiamDoc gd: listGD) {
			System.out.println(gd);
		}
		
		for(TruongPhong tp: listTP) {
			System.out.println(tp);
		}
		
		for(NhanVien nv: listNV) {
			System.out.println(nv);
		}
	}	
	
	public static void NVtheoTP(TruongPhong[] listTP, NhanVien[] listNV ) {
		for(TruongPhong tp: listTP) {
			System.out.println("Nhan vien thuoc truong phong " + tp.getHoten());
			for(NhanVien nv: listNV) {
				if(nv.getTruongphong()==tp) {
					System.out.println(nv);
				}
			}
		}
	}
	
	public static void Luong(GiamDoc[] listGD, TruongPhong[] listTP, NhanVien[] listNV ) {
		System.out.println("Luong Giam Doc ");
		for(GiamDoc gd: listGD) {
			System.out.println(gd.tinhLuong());
		}
		System.out.println("Luong Truong Phong ");
		for(TruongPhong tp: listTP) {
			System.out.println(tp.tinhLuong());
		}
		System.out.println("Luong Nhan Vien ");
		for(NhanVien nv: listNV) {
			System.out.println(nv.tinhLuong());
		}
	}
}
