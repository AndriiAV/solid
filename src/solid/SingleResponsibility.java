package solid;

public class SingleResponsibility {
	public static void main(String[] args) {
		EmployeeFacade employeeFacade = new EmployeeFacade();
		employeeFacade.cook();
		employeeFacade.clean();
		
	}
}

interface Employee{
	int getSalary();
}

class Cook implements Employee{
	@Override
	public int getSalary() {
		return 0;
	}
	void cook() {System.out.println("Do cooking");};
}

class Janitor implements Employee{
	@Override
	public int getSalary() {
		return 0;
	}
	void clean() {System.out.println("Do cleaning");};
}

class EmployeeFacade {
	Cook cook = new Cook();
	Janitor janitor = new Janitor();
	void cook() {
		cook.cook();
	}
	void clean() {
		janitor.clean();
	}
}