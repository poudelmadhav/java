import java.io.*;
import java.net.*;

class SwastikClient {
  public static void main(String[] args) throws Exception {
    Socket sock = new Socket("localhost", 5555);

    DataInputStream din = new DataInputStream(sock.getInputStream());
    DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String rad;

    System.out.println("Enter radius: ");
    rad = br.readLine();

    dout.writeUTF(rad);

    System.out.println("Area of circle = " + din.readUTF());

    din.close();
    dout.close();
    sock.close();
  }
}