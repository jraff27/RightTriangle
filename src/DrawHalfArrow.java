///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Draw Half Arrow
// Course:          CS 200, Spring 2020
//
// Author:          Joe Rafferty
// Email:           jrrafferty@wisc.edu
// Lecturer's Name: Jim Williams
//
import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight = 0;
      int arrowBaseWidth  = 0;
      int arrowHeadWidth = 0;

      int i = 0;
      int j = 0;
      
      String print = "";

      System.out.print("Enter arrow base height: ");
      arrowBaseHeight = scnr.nextInt();

      System.out.print("Enter arrow base width: ");
      arrowBaseWidth = scnr.nextInt();

      System.out.print("Enter arrow head width: ");
      arrowHeadWidth = scnr.nextInt();

      //make sure arrow head width is larger than base width
      while (arrowHeadWidth <= arrowBaseWidth) {
          arrowHeadWidth = scnr.nextInt();
      }
      
      System.out.println("");
      
    //draw arrow base 
      for (i = 0; i < arrowBaseHeight; ++i) {
          for (j = 0; j < arrowBaseWidth; ++j) {
              System.out.print("*");
          }
          System.out.println("");
      }
      
    //draw arrow head
      for (i = 0; i < arrowHeadWidth; ++i) {
          print = "" + print + "*";
      }
      for (i = arrowHeadWidth; i > 0; --i) {
          System.out.println(print.substring(0, i));
      }

      



      return;
   }
}