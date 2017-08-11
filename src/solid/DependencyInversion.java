package solid;

public class DependencyInversion {
	public static void main(String[] args) {
		Client client = new Client();
		client.doJob();
	}
}

interface DAO{
	void execute();
}

class Client{
	DAO dataAccess = new DataAccess();
	void doJob() {
		dataAccess.execute();
	};
}

class DataAccess implements DAO{
	public void execute() {
		System.out.println("execute");
	}
}