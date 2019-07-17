import java.io.*;

class FileReadAndWrite {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("tu2072.txt");
    String desc = "Toworrow is our Java Exam.\n";
    fw.write(desc);
    fw.close();

    FileReader fr = new FileReader("tu2072.txt");
    int i = 0;
    while((i = fr.read()) != -1) {
      System.out.print((char) i);
    }
    fr.close();
  }
}