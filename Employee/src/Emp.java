
public class Emp {
	private String name;
	private int eid;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp() {
		this("Not Given",0,0);
		
	}
	public Emp(String name, int eid, double salary) {
		
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", eid=" + eid + ", salary=" + salary + "]";
	}
		
}
