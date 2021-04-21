///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Text Converter
// Course:          CS 200, Spring 2020
//
// Author:          Joe Rafferty
// Email:           jrrafferty@wisc.edu
// Lecturer's Name: Jim Williams
//
import java.util.Scanner;
public class TextConverter {

    /**
     * 1337 - convert the string to leet-speak:
     *   Replace each L or l with a 1 (numeral one)
     *   Replace each E or e with a 3 (numeral three)
     *   Replace each T or t with a 7 (numeral seven)
     *   Replace each O or o with a 0 (numeral zero)
     *   Replace each S or s with a $ (dollar sign)
     *    
     * @param current Original string
     * @return string converted to leet-speak.
     */
   
    
    public static String action1337(String current) {
            for (int i = 0; i < current.length(); ++i) {
                
                char curChar = current.charAt(i);
                
                switch (curChar) {
                    
                    case 'L':
                        
                    case 'l':
                        
                        current = current.substring(0, i) + "1" + current.substring(i + 1);
                        
                        break;
                        
                    case 'E':
                        
                    case 'e':
                        
                        current = current.substring(0, i) + "3" + current.substring(i + 1);
                        
                        break;
                        
                    case 'T':
                        
                    case 't':
                        
                        current = current.substring(0, i) + "7" + current.substring(i + 1);
                        
                        break;
                        
                    case 'O':
                        
                    case 'o':
                        
                        current = current.substring(0, i) + "0" + current.substring(i + 1);
                        
                        break;
                        
                    case 'S':
                        
                    case 's':
                        
                        current = current.substring(0, i) + "$" + current.substring(i + 1);
                        
                        break;
                }
                
            }
            return current;
    }

    /**
     *  tests action1337 method with various cases to ensure it is working
     *  correctly.
     */
    public static void testAction1337() {
        boolean error = false;

        String input1 = "LEeTs";
        String expected1 = "1337$";
        String result1 = action1337( input1);
        if ( !result1.equals( expected1)) {
            error = true;
            System.out.println("1) testAction1337 with input " + input1 + ", expected: " + expected1 + " but result:" + result1);
        }

        //FIX ME
        //add at least 2 other test cases. What edge cases can you think of?
        String input2 = "lOoT";
        String expected2 = "1007";
        String result2 = action1337(input2);
        if (!result2.equals(expected2)) {
            error = true;
            System.out.println("2) testAction1337 with input " + input2 + ", expected: " + expected2 + " but result:" + result2);
        }
        
        String input3 = "abcd";
        String result3 = action1337(input3);
        if (!result3.equals(input3)) {
            error = true;
            System.out.println("3) testAction1337 with input " + input3 + ", expected: " + input3 + " but result:" + result3);
        }
        

        //if ( error) {
        //    System.out.println( "testAction1337 failed");
       // } else {
       //     System.out.println("testAction1337 passed");
       // }
    }



    /**
     * This reverses the order of characters in the current string. 
     * @param current  Original string to be reversed.
     * @return  The string in reversed order.
     */
    public static String actionReverse(String current) {
            String reversed = "";
            for (int i = current.length() - 1; i >= 0; --i) {
                char character = current.charAt(i);
                reversed = "" + reversed + character;
                
            }
            
            return reversed;
    }

    /**
     *  tests actionReverse method with various cases to ensure it is working
     *  correctly. 
     */
    public static void testActionReverse() {
        boolean error = false;

        String input1 = "Abc";
        String expected1 = "cbA";
        String result1 = actionReverse( input1);
        if ( !result1.equals( expected1)) {
            error = true;
            System.out.println("1) testActionReverse with input " + input1 + ", expected: " + expected1 + " but result:" + result1);
        }

        //FIX ME
        //add at least 2 other test cases. What edge cases can you think of?
        String input2 = "racecar";
        String result2 = actionReverse(input2);
        if (!result2.contentEquals(input2)) {
            error = true;
            System.out.println("2) testActionReverse with input " + input2 + ", expected: " + input2 + " but result:" + result2);
        }
        
        String input3 = "testing3";
        String expected3 = "3gnitset";
        String result3 = actionReverse( input3);
        if ( !result3.equals( expected3)) {
            error = true;
            System.out.println("3) testActionReverse with input " + input3 + ", expected: " + expected3 + " but result:" + result3);
        }
        

        //if ( error) {
          //  System.out.println( "testActionReverse failed");
        //} else {
     //       System.out.println("testActionReverse passed");
     //   }
    }

    /**
     * Provides the main menu for the text converter and calls methods based
     * on menu options chosen.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Welcome to the Text Converter.\nAvailable Actions:\n  1337) convert to 1337-speak\n  rev) reverse the string\n  quit) exit the program\n");
        
        System.out.print("Please enter a string: ");
        String current = scnr.nextLine();
        
        System.out.print("Action (1337, rev, quit): ");
        String action = scnr.nextLine();
        
        while (!action.equals("quit")) {
            switch (action) {
                
                case "1337":
                    current = action1337(current);
                    System.out.println(current);
                    System.out.print("Action (1337, rev, quit): ");
                    action = scnr.nextLine();
                    break;
                    
                case "rev":
                    current = actionReverse(current);
                    System.out.println(current);
                    System.out.print("Action (1337, rev, quit): ");
                    action = scnr.nextLine();
                    break;
                    
                default:
                    System.out.println("Unrecognized action.");
                    System.out.println(current);
                    System.out.print("Action (1337, rev, quit): ");
                    action = scnr.nextLine();
                    break;
            }
        }  
        System.out.println("See you next time!");
        
            
        
        
        
    
               testAction1337();   //uncomment to run the tests
               testActionReverse();  //uncomment to run the tests

    }
}//FIX ME
    