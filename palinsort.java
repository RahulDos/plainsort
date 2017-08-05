import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ){
      String original, reverse = "";
      int i;
      Scanner in = new Scanner(System.in);
      original = in.nextLine();
      int length = original.length();
      for (i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
      if (original.equals(reverse))
         System.out.println("YES");
      else
         System.out.println("NO");
    }
}