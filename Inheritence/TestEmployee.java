class Person
{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Employee extends Person
{
	private double asalary;
	private String dojoin;
	private String insuranceno;
	public Employee(String name, double asalary, String dojoin, String insuranceno) {
		super(name);
		this.asalary = asalary;
		this.dojoin = dojoin;
		this.insuranceno = insuranceno;
	}
	public double getAsalary() {
		return asalary;
	}
	public void setAsalary(double asalary) {
		this.asalary = asalary;
	}
	public String getDojoin() {
		return dojoin;
	}
	public void setDojoin(String dojoin) {
		this.dojoin = dojoin;
	}
	public String getInsuranceno() {
		return insuranceno;
	}
	public void setInsuranceno(String insuranceno) {
		this.insuranceno = insuranceno;
	}
}
public class TestEmployee {

	public static void main(String[] args) {
      Employee e=new Employee("Kamalesh",40000,"22-06-2021","1100EMP");
      System.out.println("E_Name:"+e.getName()+"\n"+"Salary:"+e.getAsalary()+"\n"+"DOJoin:"+e.getDojoin()+"\n"+"Insurance_no:"+e.getInsuranceno());
	}

}
