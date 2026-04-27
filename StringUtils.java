// StringUtils

class StringUtils {
  static boolean containsChar(String source, char character) {
    for(int i = 0; i < source.length(); i++) {
      if(source.charAt(i) == character) return true;
    }

    return false;
  }

  static String reverse(String str) {
    String reversed = "";

    for(int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }

    return reversed;
  }

  static String replaceAll(String str, char character,char replacer) {
    char[] reversed = new char[str.length()];

    for(int i = 0;  i < str.length(); i++) {

      if(str.charAt(i) == character) {
        reversed[i] = replacer;
        continue;
      }
      reversed[i] = str.charAt(i);
    }

    return new String(reversed);
  }
}