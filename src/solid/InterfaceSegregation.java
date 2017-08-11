package solid;

public class InterfaceSegregation {
	public static void main(String[] args) {
		IWorker iWorker = new Cooker();
		iWorker.work();
		iWorker.eat();
		Waiter waiter = new Waiter();
		waiter.work();
		//waiter.eat();
	}
}

interface Worker{
	void work();
}
interface Eater{
	void eat();
}

interface IWorker extends Worker, Eater{} 

class Cooker implements IWorker{
	@Override
	public void work() {
		System.out.println("work");
	}
	@Override
	public void eat() {
		System.out.println("eat");
	}
}

class Waiter implements Worker{
	@Override
	public void work() {
		System.out.println("deliver food");
	}
}