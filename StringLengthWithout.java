public class StringLengthWithout {
   public static void main(String args[]){
	   
      String str = "S";
      int i = 0;
      for(char c: str.toCharArray()) {
         i++;
      }
      System.out.println("Length of the given string ::"+i);
   }
}