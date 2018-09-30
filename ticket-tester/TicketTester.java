import javax.swing.JOptionPane;

/**
 * TicketTester
 */
public class TicketTester {
  public static void main(String[] args) {
    int noEntry = 0;
    int entry = 0;
    int count = 0;

    while (count != 5) {
      int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age to see if entry is allowed or not, 19 minimum"));
      if (age > 18) {
        System.out.println(age + ": Entry");
        entry += 1;
      } else {
        System.out.println(age + ": No Entry");
        noEntry += 1;
      }
      count += 1;
    }

    System.out.println(noEntry + " are not allowed entries");
    System.out.println(entry + " are the allowed entries");
    System.out.println((entry * 20) + " % of testers made it into the program.");
  }  
}