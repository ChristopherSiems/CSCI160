class Result {
  public static int marsExploration(String s) {
    int count = 0;
    for (int start = 0; start < s.length(); start += 3) {
      if (s.charAt(start) != 'S') {
        count++;
      }
      if (s.charAt(start + 1) != 'O') {
        count++;
      }
      if (s.charAt(start + 2) != 'S') {
        count++;
      }
    }
    return count;
  }
}