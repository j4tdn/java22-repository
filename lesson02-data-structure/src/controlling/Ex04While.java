package controlling;

public class Ex04While {
	public static void main(String[] args) {
		//in ra so nguyen le khong am nho hon 20 
		 
		int i=0; 
		int n=20;
		while(i<n) {
			if(i%2!=0) {
				System.out.println("i-->"+i);
			}
			i++;
		}
	}
}
