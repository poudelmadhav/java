import java.io.FileOutputStream;

class SwastikFileOutStream {
  public static void main(String[] args) {
    try {
      FileOutputStream fileOutput = new FileOutputStream("/home/madhav/Desktop/java/practice/fileout.txt");
      String s = "Welcome to Swastik Java!";
      byte b[] = s.getBytes();
      fileOutput.write(b);
      fileOutput.close();
      System.out.println("Written to file");
    } catch( Exception e) {
        System.out.println("Error");
    }
  }
}