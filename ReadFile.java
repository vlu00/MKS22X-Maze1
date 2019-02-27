import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
  public static void main(String args[]) {
    int rows = 0;
    int cols = 0;
    String line = "";

    try {
      File text = new File("Maze1.txt");

      Scanner inf = new Scanner(text);

      while(inf.hasNextLine()){
        line = inf.nextLine();
        System.out.println(line);
        rows++;
      }

      cols = line.length();

    } catch (FileNotFoundException e) {
      System.out.print("File not found.");
    }

  }

}
