import java.io.FileReader;

class SwastikFileReader {
  public static void main(String[] args) {
    try {
      FileReader f1 = new FileReader("/home/madhav/Desktop/java/practice/madhav.txt");
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