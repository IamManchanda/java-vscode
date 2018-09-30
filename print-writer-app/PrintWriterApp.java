import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

/**
 * PrintWritterApp
 */
public class PrintWriterApp {
  public static void main(String[] args) throws IOException {
    PrintWriter outFile = new PrintWriter(new FileWriter("printing.txt"));
    String snapshot = JOptionPane.showInputDialog("Enter a sentence, type STOP to Stop");
    while (!snapshot.equals("STOP")) {
      outFile.println(snapshot);
      snapshot = JOptionPane.showInputDialog("Enter a sentence, type STOP to Stop");
    }
    outFile.close();
  }
}