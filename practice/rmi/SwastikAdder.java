import java.rmi.*;

public interface SwastikAdder extends Remote {
  public int add(int x, int y) throws RemoteException;
}