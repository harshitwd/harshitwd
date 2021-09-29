package thinkQ;

public class Department {

	private  String tech;
	private  String sales;
	public Department(String tech, String sales) {
		super();
		this.tech = tech;
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "Department [tech=" + tech + ", sales=" + sales + "]";
	}

}
