import javax.swing.JOptionPane;

/**
 * SortApp
 */
public class SortApp {
  public static void main(String[] args) {
    String firstName = "";
    String secondName = "";
    String firstItem = "";
    String secondItem = "";
    String tempVar = "ZZZ";
    int age = 0;
    
    for (int i = 0; i < 2; i++) {
      while (age <= 18) {
        firstName = JOptionPane.showInputDialog("Enter your first name").toUpperCase();
        secondName = JOptionPane.showInputDialog("Enter your last name").toUpperCase();
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
      }

      if (tempVar.compareTo(secondName) > 0) {
        tempVar = secondName;
        secondItem = firstItem;
        firstItem = firstName.charAt(0) + ". " + secondName + "\n" + age;
      } else {
        secondItem = firstName.charAt(0) + ". " + secondName + "\n" + age;
      }

      age = 0;
    }

    System.out.println(firstItem + "\n" + secondItem);
  }
}