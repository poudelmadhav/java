import java.rmi.*;
import java.rmi.server.*;

public class SwastikAdderRemote extends UnicastRemoteObject implements SwastikAdder {
  SwastikAdderRemote() throws RemoteException {
    super();
  }

  public int add(int x, int y) throws RemoteException {
    return x + y;
  }
}