import java.rmi.*;

public class SwastikRMIClient {
	public static void main(String args[]) {
		try {
			SwastikAdder stub = (SwastikAdder) Naming.lookup("rmi://localhost:1900/swastik");
			System.out.println(stub.add(34,4));
		} catch (Exception e) {}
	}
}
