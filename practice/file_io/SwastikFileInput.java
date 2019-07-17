import java.io.FileReader;

class SwastikFileInput {
  public static void main(String[] args) throws Exception {
    FileReader fileInput = new FileReader("madhav.txt");
    int i = 0;
    while((i = fileInput.read()) != -1) {
      System.out.print((char) i);
    }
    fileInput.close();
  }
}