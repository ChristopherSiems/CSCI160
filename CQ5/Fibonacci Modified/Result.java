class Result {
  public static int fibonacciModified(int t1, int t2, int n) {
    if (n == 2) {
      return t2;
    }
    return fibonacciModified(t2, t1 + (int) Math.pow(t2, 2), n - 1);
  }
}