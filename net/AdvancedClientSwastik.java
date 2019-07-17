import java.io.*;
import java.net.*;

class AdvancedClientSwastik {
  public static void main(String[] args) throws Exception {
    Socket sock = new Socket("localhost", 3333);

    DataInputStream din = new DataInputStream(sock.getInputStream());
    DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = "", str2  = "";
    while(!str.equals("stop")) {
      str = br.readLine();
      dout.writeUTF(str);
      dout.flush();
      str2 = din.readUTF();
      System.out.println("Server says: " + str2);
    }
    dout.close();
    sock.close();
  }
}