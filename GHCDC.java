import java.io.*;
import java.util.*;

public class GHCDriverlessCar
{
  public static void main(String[] args)
  {
    File file = new File("a_example");

    int charVal;
    StringBuffer strContent = new StringBuffer("");
    FileInputStream fileInput = null;
    try {
      fileInput = new FileInputStream(file);

      while ((charVal = fileInput.read()) != -1) {
        strContent.append((char) charVal);
      }//while
      //String fileString = FileUtils.readFileAsString("a_example");
    } catch (IOException e) {
      System.err.println("File failed to load: " + e);
    } finally {
      try {
        fileInput.close();
      } catch (IOException e) {
        System.out.println("Could not close file: " + e);
      }//catch
    }//finally
  }//main

  public static int distance(Intersection int1, Intersection int2)
  {
    int startX = int1.getHorizontal();
    int startY = int1.getVertical();
    int endX = int2.getHorizontal();
    int endY = int2.getVertical();
    return Math.abs(endX - startX) + Math.abs(endY - startY);
  }//distance
}
