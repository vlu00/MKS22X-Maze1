import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String args[]) {
    int rows = 0;
    int cols = 0;
    String line = "";
    String maze = "";

    try {
      File text = new File("Maze1.txt");
      Scanner inf = new Scanner(text);

      while(inf.hasNextLine()){
        line = inf.nextLine();
        maze += line;
        System.out.println(line);
        rows++;
      }

      cols = line.length();

      System.out.println();
      System.out.println(maze);

      String[][] board = new String [rows][cols];
      int i = 0;

      for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++, i++) {
          board[r][c] = "" + maze.charAt(i);
        }
      }

      String display = "";
      for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
          display += board[row][col];
        }
        display += "\n";
      }

      System.out.println();
      System.out.println(display);

    } catch (FileNotFoundException e) {
      System.out.print("File not found.");
    }

  }

}
