import java.rmi.*;
import java.rmi.registry.*;

public class SwastikRMIServer {
	public static void main(String args[]) {
		try {
			SwastikAdder stub = new SwastikAdderRemote();
      // LocateRegistry.createRegistry(1900);
			Naming.rebind("rmi://localhost:1900/swastik", stub);
		} catch(Exception e) {System.out.println(e);}
	}
}
