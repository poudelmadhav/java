import java.io.FileWriter;

class SwastikFileOutput {
  public static void main(String[] args) {
    try {
      FileWriter fileOutput = new FileWriter("suman.txt");
        
      String name = "My name is Suman.\n";

      // byte[] b = name.getBytes();

      fileOutput.write(name);

      fileOutput.close();
      System.out.println("Written to file.");
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}