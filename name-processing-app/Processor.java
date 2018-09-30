/**
 * Process
 */
public class Processor {
  private int num = 5;

  public String processName(String name) {
    name = name.charAt(0) + ". " + name.substring(name.indexOf(" ") + 1);
    return name;
  }

  public void numPrint() {
    System.out.println(num);
  }
}