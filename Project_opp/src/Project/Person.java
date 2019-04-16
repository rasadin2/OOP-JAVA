 package Project;
 
  public class Person {
	 
	private int ID;
	private String name;
	private String address ;
	private int age;
	private String gender;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	public Person() {
		super();
	}
	
	public Person(int iD, String name, String address, int age, String gender) {
		
		ID = iD;
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}
	
}
