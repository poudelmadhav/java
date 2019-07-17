import java.io.FileWriter;

class SwastikFileWriter {
  public static void main(String[] args) {
    try {
      FileWriter fileOutput = new FileWriter("/home/madhav/Desktop/java/practice/fileout1.txt");
      String s = "Welcome to Swastik Java!";
      fileOutput.write(s);
      fileOutput.close();
      System.out.println("Written to file");
    } catch (Exception e) {
        System.out.println("Error");
    }
  }
}