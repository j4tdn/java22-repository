package p3_builder;

public class User {

	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String email;
	private String address;
	
	
	//Việc khởi tạo đối tượng 
	//Nhờ Builder, User ko thể new object, setter
	private User() {
		
	}
	
	private User(Builder builder) {
		this.firstName  = builder.firstName;
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



	//sử dụng static vì nếu
	//+ non-static : Phải khởi tạo đối tượng cho User, dùng đối tượng đó gọi Builder
	public static class Builder{
		
		//copy thuộc tính từ User bỏ vào Builder
		//để tạo ra 1 Builder cũng gồm 6 thông tin 
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String email;
		private String address;
		
		//GỌi Builder thông qua User thooi, class khác ko thể 
		//Vì builder chỉ dùng để build User
		private Builder() {
			
		}
		
		//Builder b1 = new Builder();
		//b1.setFirstName("a")
		//b1.set
		
		
		//tương tự setter
		//sau khi set giá trị xong -> return về đối tượng hiện tại
		//dùng đối tượng hiện tại đi gọi các hàm setter khác (convention dùng chữ 'with')
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
			return new User(this);
		}
		
	}
}
