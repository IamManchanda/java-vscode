import javax.swing.JOptionPane;

/**
 * NameProcessor
 */
public class NameProcessor {
  public static void main(String[] args) {
    String names = JOptionPane.showInputDialog("Enter your first, middle and last name");
    String firstName = names.substring(0, names.indexOf(' '));
    String middleName = names.substring((names.indexOf(' ') + 1), names.lastIndexOf(' '));
    String lastName = names.substring((names.lastIndexOf(' ') + 1));
    System.out.println(
      "First Name : " + firstName + "\n" +
      "Middle Name : " + middleName + "\n" +
      "Last Name : " + lastName
    );
  }
}