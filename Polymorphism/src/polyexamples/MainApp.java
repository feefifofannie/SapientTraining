/**
 * 
 */
package polyexamples;

abstract class Employee {
	public abstract void netSalary();
}

class Intern extends Employee {
	public void netSalary() {
		System.out.println("Intern's Stipend");
	}
}

class Confirmed extends Employee {
	public void netSalary() {
		System.out.println("Confirmed Employee's Salary");
	}
	public void transport() {
		System.out.println("Transport has been booked.");
	}
}

class Contractor extends Employee {
	public void netSalary() {
		System.out.println("Contractor's salary");
	}
}

class HR {
	/**
	 * 
	 * @param empType
	 * @return
	 */
	public Employee recruit(String empType) {
		if (empType.equals("I")) {
			return new Intern();
		} else if (empType.equals("C")) {
			return new Confirmed();
		} else if (empType.equals("T")){
			return new Contractor();
		}
		return null;
	}
}

class Finance{
	public void processSalary(Employee e){
		e.netSalary();
		if (e instanceof Confirmed){
			Confirmed conf = (Confirmed) e;  //downcast
			conf.transport();
		}
	}
}

/**
 * @author dredmo
 * 
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr = new HR();
		Finance f = new Finance();
		Employee emp = hr.recruit("C");     //upcast

		if (emp != null) {
			f.processSalary(emp);
		}
		emp = hr.recruit("I");
		if (emp != null) {
			f.processSalary(emp);
		}
		emp = hr.recruit("T");
		if (emp != null) {
			f.processSalary(emp);
		}
	}

}
