class Result {
  public static void staircase(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.print(" ".repeat(n - i));
      System.out.println("#".repeat(i));
    }
  }
}