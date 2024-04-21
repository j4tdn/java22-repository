package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Studen st1 = new Studen(102, "Nam", Rank.C);
		Studen st2 = new Studen(103, "Bảo", Rank.F);
		Studen st3 = new Studen(104, "Hoàng", Rank.D);
		Studen st4 = new Studen(105, "Nguyên", Rank.B);
		Studen st5 = new Studen(106, "Vũ", Rank.F);
		Studen st6 = new Studen(107, "Lan", Rank.A);
		Studen st7 = new Studen(108, "Đạt", Rank.C);
		Studen st8 = new Studen(109, "Bảo", Rank.F);
		Studen st9 = new Studen(110, "Vũ", Rank.C);
		Studen st10 = new Studen(111, "Hoàng", Rank.B);
		Studen[] studen = {
				st1,
				st2,
				st3,
				st4,
				st5,
				st6,
				st7,
				st8,
				st9,
				st10
		};
		System.out.println("học sinh đạt loại A ");
		search(studen);
		System.out.println("Học sinh đã học lại ");
		searchF(studen);
	}

	public static void search(Studen[] studen) {
		for(int i = 0 ; i <studen.length;i++) {
			if(studen[i].getHocLuc() == Rank.A) {
				System.out.println(studen[i]);
			}
		}
	}
	public static void searchF(Studen[] studen) {
		for(int i = 0 ; i <studen.length;i++) {
			if(studen[i].getHocLuc() == Rank.F) {
				System.out.println(studen[i]);
			}
		}
	}
}
