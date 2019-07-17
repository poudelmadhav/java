import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwastikPalindrome {
  SwastikPalindrome() {
    JFrame f = new JFrame("Palindrome, Reverse, Check Vowel");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JLabel lblString = new JLabel("Input any string: ");
    lblString.setBounds(10, 10, 300, 30);

    JTextField txtString = new JTextField();
    txtString.setBounds(10, 50, 300, 30);

    JButton btnPalindrome = new JButton("Check Palindrome");
    btnPalindrome.setBounds(10, 100, 300, 30);

    JButton btnReverse = new JButton("Reverse String");
    btnReverse.setBounds(10, 150, 300, 30);

    JButton btnVowel = new JButton("Check Vowel");
    btnVowel.setBounds(10, 200, 300, 30);

    JLabel result = new JLabel("The result will appear here.");
    result.setBounds(10, 250, 300, 30);

    btnPalindrome.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String originalString = txtString.getText();

        if (isPalindrome(originalString)) {
          result.setText("The string '" + originalString + "' is Palindrome.");
        } else {
          result.setText("The string '" + originalString + "' is not Palindrome.");
        }
      }
    });

    btnReverse.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String originalString = txtString.getText();

        StringBuilder sb = new StringBuilder(originalString);
        result.setText(sb.reverse().toString());

        // Another method
        // String reverse = "";
        // for (int i = originalString.length() - 1; i >= 0; i--) {
        //   reverse = reverse + originalString.charAt(i);
        // }
        // result.setText(reverse);
      }
    });

    btnVowel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String originalString = txtString.getText();
        String vowels = "";

        for(int i = 0; i < originalString.length(); i++) {
          switch(originalString.charAt(i)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
              vowels = vowels + originalString.charAt(i);
          }
        }
        result.setText(vowels);
      }
    });

    f.add(lblString);
    f.add(txtString);
    f.add(btnPalindrome);
    f.add(btnReverse);
    f.add(btnVowel);
    f.add(result);

    f.setLayout(null);
    f.setSize(600, 600);
    f.setVisible(true);
  }

  public static boolean isPalindrome(String word) {
    int left = 0;
    int right = word.length() - 1;
    while(left < right) {
      if(word.charAt(left) != word.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public static void main(String[] args) {
    new SwastikPalindrome();
  }
}