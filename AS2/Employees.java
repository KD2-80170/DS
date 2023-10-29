import java.util.Arrays;

public class Employees {
	 private int empid;
	 private String name;
   private double salary;
	// TODO Auto-generated constructor stub

public Employees(int empid, String name, double salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employees [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
}
  

   

}
