import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ReadInstance
 */
public class ReadInstance {
  private String arr[] = new String[50];
  private int count = 0;
  private String result = "";

  public void readFile(String filename) {
    try {
      File grabFile = new File(filename);
      Scanner scFile = new Scanner(grabFile);
      while (scFile.hasNext()) {
        arr[count] = scFile.next();
        count += 1;
      }
      scFile.close();
    } catch (FileNotFoundException err1Exception) {
    }
  }

  public void processFile() {
    for (int i = 0; i < count; i += 1) {
      Scanner scLine = new Scanner(arr[i]);
      result = result + scLine.next().charAt(0) + ". " + scLine.next() + " " + scLine.nextInt() + " " + scLine.next().charAt(0);
      scLine.close();
    }
  }

  public String printResult() {
    return result;
  }
}