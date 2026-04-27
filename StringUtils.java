// StringUtils

class StringUtils {
  static boolean containsChar(String source, char character) {
    for(int i = 0; i < source.length(); i++) {
      if(source.charAt(i) == character) return true;
    }

    return false;
  }
}