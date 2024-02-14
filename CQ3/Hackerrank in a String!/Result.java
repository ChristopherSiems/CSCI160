class Result {
  private static String hackerrank = "";
  public static String hackerrankInString(String s) {
    if (hackerrank.length() == 10) {
      hackerrank = "";
      return "YES";
    }
    if (s.length() == 0) {
      hackerrank = "";
      return "NO";
    }
    if (s.charAt(0) == "hackerrank".charAt(hackerrank.length())) {
      hackerrank += s.charAt(0);
    }
    return hackerrankInString(s.substring(1));
  }
}