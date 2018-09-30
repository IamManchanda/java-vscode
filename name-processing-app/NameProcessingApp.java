import javax.swing.JOptionPane;

/**
 * NameProcessingApp
 */
public class NameProcessingApp {
  public static void main(String[] args) {
    Processor nameProcessor = new Processor();
    /* String temp = JOptionPane.showInputDialog("Enter your full name");
    System.out.println(nameProcessor.processName(temp)); */
    nameProcessor.numPrint();
  }
}