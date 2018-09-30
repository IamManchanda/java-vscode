import javax.swing.JOptionPane;

/**
 * ReadAndProcess
 */
public class ReadAndProcess {
  public static void main(String[] args) {
    String filenameVar = JOptionPane.showInputDialog("Enter a file name");
    ReadInstance readInstance = new ReadInstance();
    readInstance.readFile(filenameVar);
    readInstance.processFile();
    System.out.println(readInstance.printResult());
  }
}