import java.io.FileInputStream;

class SwastikFileInputStream {
  public static void main(String[] args) {
    try {
      FileInputStream f1 = new FileInputStream("/home/madhav/Desktop/java/practice/madhav.txt");
      int i = 0;
      while ((i = f1.read()) != -1) {
        System.out.print((char) i);
      }
      f1.close();
    } catch (Exception e) {
        System.out.println("Error");
    }
  }
}