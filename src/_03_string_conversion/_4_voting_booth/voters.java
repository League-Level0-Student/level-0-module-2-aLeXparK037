package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voters {
public static void main(String[] args) {
	
	
String age = JOptionPane.showInputDialog("How old are you? (just one number)");

int ageInt = Integer.parseInt(age);

if (ageInt > 17) {
	JOptionPane.showInputDialog("Who do you want as president?");
}
else {
	JOptionPane.showMessageDialog(null, "You are too young, now go away please.");
}
}
	
}
