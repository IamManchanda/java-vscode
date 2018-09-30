import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * TestResultsApp
 */
public class TestResultsApp {
  public static void main(String[] args) {
    try {
      File readFile = new File("marks.txt");
      Scanner scFile = new Scanner(readFile);
      while (scFile.hasNext()) {
        String line = scFile.nextLine();
        Scanner scLine = new Scanner(line);
        scLine.useDelimiter("--");
        String firstName = scLine.next();
        String lastName = scLine.next();
        double marks = scLine.nextDouble();
        boolean passedOrNot = scLine.nextBoolean();
        scLine.close();

        FileWriter grabFile = new FileWriter("results.txt", true);
        PrintWriter outFile = new PrintWriter(grabFile);
        outFile.println(
          "First Name: " + firstName + ", " +
          "Last Name: " + lastName + ", " +
          "Marks: " + marks + ", " +
          "Passed or not: " + passedOrNot + "!"
        );
        outFile.close();
      }
      scFile.close();
    } catch (FileNotFoundException err1Exception) {
      System.out.println("File not found for file scanning");
    } catch (IOException err2Exception) {
      System.out.println("File not found for print writer");
    }
  }
}