package p3_builder;

public class User {
	
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String email;
	private String address;
	
	// Việc khởi tạo đối tượng
	// Nhờ Builder, User ko thể new object, setter
	private User() {
	}
	//sử dụng static vì nếu
	// + non-static: thì phải khởi tạo đối tượng cho User, dùng đối tượng đó gọi lại Builder
	//			   : nếu khởi tạo đối tượng cho User, setter lun chớ ko cần đến Builder
	//			   : muốn User mọi việc khởi tạo gán giá trị đều nhờ Builder, private constructor
	// + static	   : lấy class gọi trực tiếp
	
	private User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.email = builder.email;
		this.address = builder.address;
	}
	
	public static Builder initBuilder() {
		return new Builder();
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

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + "]";
	}


	public static class Builder{
		//copy thuộc tính từ User bỏ vào Builder
		// để tạo ra Builder cũng gồm 6 thông tin
		// sau đó gán giá trị của Builder về cho User
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String email;
		private String address;
		
		// gọi Builder chỉ thông qua User thôi, class khác ko thể
		// Builder chỉ dùng để build User
		private Builder() {
		}
		
		//tương tự setter
		// sau khi set giá trị xong -> return về đối tượng hiện tại (kiểu giống LocalDate.now())
		// dùng đối tượng hiện tại đó đi gọi các hàm setter khác (dùng chữ 'with')
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
		
		public User build() {
			return new User(this); //this này là Builder
		}
		
	}
}
