import javax.swing.JOptionPane;

/**
 * FileReader
 */
public class FileReader {
  public static void main(String[] args) {
    String filenameVar = JOptionPane.showInputDialog("Enter your file name");
    ScannerInstance fileReader = new ScannerInstance();
    fileReader.fileScan(filenameVar);
  }
}