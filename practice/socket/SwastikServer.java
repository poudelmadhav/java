import java.io.*;
import java.net.*;

class SwastikServer {
  public static void main(String[] args) throws Exception {
    ServerSocket server = new ServerSocket(5555);
    Socket sock = server.accept();

    DataInputStream din = new DataInputStream(sock.getInputStream());
    DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    double rad, area;

    rad = Double.parseDouble(din.readUTF());
    System.out.println("From Client Radius = " + rad);
    area = Math.PI * rad * rad;
    dout.writeUTF(String.valueOf(area));

    dout.close();
    sock.close();
    server.close();
  }
}