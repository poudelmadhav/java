import javax.swing.*;

class Palindrome {
  public static void main(String[] args) {
    String str;
    str = JOptionPane.showInputDialog(null, "Enter String:");
    JOptionPane.showMessageDialog(null, "The word " + str + " is palindrome: " + isPalindrome(str));
  }

  public static boolean isPalindrome(String word) {
    int left = 0;
    int right = word.length() - 1;

    while(left < right) {
      if (word.charAt(left) != word.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }
}