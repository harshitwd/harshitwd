package thinkQ;

public class Company {

	private String name;
	private String location;
	public Company(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + "]";
	}
}
