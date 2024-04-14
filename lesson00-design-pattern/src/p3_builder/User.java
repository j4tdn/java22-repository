package p3_builder;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String email;
	private String address;
	
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

	public static Builder initBuilder() {
		return new Builder();
	}
	// sử dụng static vì 
	//   nếu sd non-static: phải khởi tạo đối tượng cho user, dùng đối tượng đó gọi Builder
	//                    : nếu khởi tạo được đối tượng cho User thì dùng setter luôn không cần Builder
	//                    : muốn mọi việc khởi tạo, gán giá trị đều nhờ Builder, private constructor
	//   nếu static: Lấy class gọi trực tiếp 
	public static class Builder {
		// coppy thuộc tính từ User bỏ vào Builder
		// để tạo ra 1 Builder cũng gồm 6 thông tin 
		// sau đó gán giá trị của Builder về lại User
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String email;
		private String address;
		
		// gọi Builder thông qua User thôi, class khác không thể
		// vì Builder chỉ dùng để Buil User
		private Builder() {
		}
		
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
		public User buil() {
			return new User(this);
		}
	}
}
