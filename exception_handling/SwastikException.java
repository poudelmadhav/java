class SwastikException {
  static void validateAge(int age) throws Exception {
    if (age < 18) {
      throw new Exception;
    }
  }

  public static void main(String[] args) {
    try {
      int arr[] = new int[5];
      arr[5] = 10/1;
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("After Error.");
  }
}