import java.lang.*;
public class LowerToUpper {
   public static void main(String[] args) {  
      // converts all upper case letters in to lower case letters
      String str1 = "SELF LEARNING CENTER";
      System.out.println("string value = " + str1.toLowerCase());

      str1 = "TUTORIALS POINT";    
      System.out.println("string value = " + str1.toLowerCase());

      // converts all lower case letters in to upper case letters
      String str2 = "This is TutorialsPoint";
      System.out.println("string value = " + str2.toUpperCase());

      str2 = "www.tutorialspoint.com";
      System.out.println("string value = " + str2.toUpperCase());      
   }  
} 