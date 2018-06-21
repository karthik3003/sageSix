package exelopsdsops;

public class Employee implements Comparable{
	
	public String name;
	public double id;
	public String desc;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int id, String desc) {
		this.name = name;
		this.id = id;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		//return ((Employee)arg0).getName().compareTo(this.name);
		return this.getName().compareTo(((Employee)arg0).getName());
		
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", desc=" + desc + "]\n";
	}
	



}
