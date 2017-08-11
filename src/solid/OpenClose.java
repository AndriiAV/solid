package solid;

public class OpenClose {
	public static void main(String[] args) {
		Toyota toyota = new Toyota();
		Celica celica = new Celica();
		workInTaxi(toyota);
		workInTaxi(celica);
	}
	static void workInTaxi (Car car) {
		car.workInTaxi();
	}
}

interface Car {
	void workInTaxi();
}

class Toyota implements Car{
	void getPassgers() {
		System.out.println("Get passagers");
	}
	public void workInTaxi() {
		getPassgers();
	}
}

class Celica extends Toyota{
	void getPassgers() {
		System.out.println("Get one passager");
	}
	public void workInTaxi() {
		getPassgers();
	}
}