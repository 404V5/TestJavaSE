
import java.io.*;
class Test
{   
  // ×ªunicode
  public static String convert(String s) {
    String unicode = "";
    char[] charAry = new char[s.length()];
    for(int i=0; i<charAry.length; i++) {
      charAry[i] = (char)s.charAt(i);
       unicode+="\\u" + Integer.toString(charAry[i], 16);
    }
    return unicode;
  }
  
  public static void main(String[] args) {
 //   \u5f88\u597d
    System.out.println("Hello World!" + convert("ºÜºÃ"));
  }

} 