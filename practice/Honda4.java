abstract class Bike {
  abstract void run();
  abstract void test();
}

class Honda4 extends Bike {
  void run() {
    System.out.println("Running safely.");
  }

  void test() {
    System.out.println("Tested successfully.");
  }

  public static void main(String[] args) {
    Bike obj = new Honda4();
    obj.run();
    obj.test();
  }
}