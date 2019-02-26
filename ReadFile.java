import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
  public static void main(String args[]) {
    int rows = 0;
    int cols = 0;

    try {
      File text = new File("Maze1.txt");

      Scanner inf = new Scanner(text);

      while(inf.hasNextLine()){
        String line = inf.nextLine();
        System.out.println(line);
        rows++;
      }

      System.out.println(rows-1);

    } catch (FileNotFoundException e) {
      System.out.print("File not found.");
    }

  }

}
