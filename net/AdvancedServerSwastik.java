import java.io.*;
import java.net.*;

class AdvancedServerSwastik {
  public static void main(String[] args) throws Exception {
    ServerSocket server = new ServerSocket(3333);
    Socket sock = server.accept();

    DataInputStream din = new DataInputStream(sock.getInputStream());
    DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = "", str2  = "";
    while(!str.equals("stop")) {
      str = din.readUTF();
      System.out.println("Client says: " + str);
      str2 = br.readLine();
      dout.writeUTF(str2);
      dout.flush();
    }
    din.close();
    sock.close();
    server.close();
  }
}