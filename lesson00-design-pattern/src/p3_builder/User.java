package p3_builder;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String phone ;
	private String email;
	private String address;
	// việc khởi tạo đối tượng hoàn toàn nhờ builder ko thể tạo đối tượng từu user
	// static vì nếu non  muốn gọi được builder phải khởi tạo đối tượng user 
	// nếu khởi tạo đối tượng thì ko cần dùng đến builder 
	// nên dùng static lấy class gọi trực tiếp 
	// coppy thuộc tính từ user vào builder sau đó gán builder vào lại user
	private User() {
		
	}
	private User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.email = builder.email;
		this.address = builder.address;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public static Builder initBuilder() {
	    return new Builder();
	}

	public static void main(String[] args) {
		User u1 = new Builder().build()	;	
		
	}
	public static class Builder { 
		private String firstName;
		private String lastName;
		private int age;
		private String phone ;
		private String email;
		private String address;
		
		// gọi builder chỉ gọi được qua user  class khác ko thể builder chỉ dùng build user
		
		public Builder() {
			
		}
		// tương tự hàm set sau khi set xong return về đối tượng hiện tại
		// dùng đối tượng hiện tại gọi các hàm setter khác  (with)
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder withAge(int age) {
			this.age = age;
			return this;
		}

		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder withEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}
		public static Builder initBuilder() {
			return new Builder()	;
		}
		public User build() {
			return new User(this);
		}
		
	}
	
	
}
