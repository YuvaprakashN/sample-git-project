
public class Employee {
//changes done
	//change ssh
	//Feature
	//conflict pull local
	private String name;
	private int age;

	private double salary;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee name: " + name + ", age:" + age + "]";
	}
	
	
}
