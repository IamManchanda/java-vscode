import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 * ScannerInstance
 */
public class ScannerInstance {
    public void fileScan(String filename) {
      try {
        Scanner scFile = new Scanner(new File(filename));
        String line = "";
        String firstName = "";
        String lastName = "";
        int age = 0;
        while (scFile.hasNext()) {
          line = scFile.nextLine();
          Scanner scLine = new Scanner(line);
          scLine.useDelimiter("--");
  
          firstName = scLine.next();
          lastName = scLine.next();
          age = scLine.nextInt();
          
          scLine.close();
          System.out.println(
            "First Name: " + firstName + ", " +
            "Last Name: " + lastName  + ", " +
            "Age: " + age
          );
        }
        scFile.close();
      } catch (FileNotFoundException err) {
        System.out.println("It's all broken");
      }
    }
}