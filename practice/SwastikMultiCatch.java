class SwastikMultiCatch {
  public static void main(String[] args) {
    try {
      int a[] = new int[5];
      a[5] = 30/0;
    } catch(ArithmeticException e) {
      System.out.println("Arichmetic Exception");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array out of bound exception");
    } catch (Exception e) {
      System.out.println("Default exception");
    }

    System.out.println("rest of the code");
  }
}