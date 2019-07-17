import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class LyangQuestion extends JFrame implements ActionListener {
    JLabel inputLabel;
    JTextField inputString;
    JButton captionCheckPalindrome;
    JButton reverseButton;
    JButton findVowel;
    JLabel resultLabel;
    JTextField resultText;
 
    LyangQuestion() {
        inputLabel = new JLabel("Input any String");
        resultLabel = new JLabel("Result");
        resultText = new JTextField(20);
 
        inputString = new JTextField(20);
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        captionCheckPalindrome = new JButton("check palindrome");
        captionCheckPalindrome.addActionListener(this);
        captionCheckPalindrome.setActionCommand("checkPalindrome");
 
        reverseButton = new JButton("Reverse word");
        reverseButton.addActionListener(this);
        reverseButton.setActionCommand("reverseButton");
 
        findVowel = new JButton("Find Vowel in string");
        findVowel.addActionListener(this);
        findVowel.setActionCommand("findVowel");
        add(inputLabel);
        add(inputString);
        add(captionCheckPalindrome);
        add(reverseButton);
        add(findVowel);
        add(resultLabel);
        add(resultText);
        resultText.setText("Result will be displayed here");
        resultText.setEditable(false);
        setVisible(true);
    }
 
    String reverseReturn(String word) {
 
        int wordLength = word.length();
        String reverse = "";
        for (int i = wordLength - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }
 
    public void actionPerformed(ActionEvent e) {
        String inputx = inputString.getText();
        String reverse = reverseReturn(inputx);
 
        if (e.getActionCommand().equals("reverseButton")) {
            resultText.setText(reverse);
 
        }
        if (e.getActionCommand().equals("checkPalindrome")) {
            if (inputx.equals(reverse)) {
                resultText.setText("Yes it is palindrome");
            } else {
                resultText.setText("Not a Palindrome");
            }
        }
        if (e.getActionCommand().equals("findVowel")) {
            int inputLength = inputx.length();
            String vowels = "";
            for (int i = 0; i < inputLength; i++) {
                if (inputx.charAt(i) == 'a' || inputx.charAt(i) == 'e' || inputx.charAt(i) == 'i' || inputx.charAt(i) == 'o' || inputx.charAt(i) == 'u' ||
                        inputx.charAt(i) == 'A' || inputx.charAt(i) == 'E' || inputx.charAt(i) == 'I' || inputx.charAt(i) == 'O' || inputx.charAt(i) == 'U') {
                    vowels += inputx.charAt(i);
 
                }
            }
            resultText.setText(vowels);
 
        }
 
    }
 
    public static void main(String[] a) {
        new LyangQuestion();
    }
}