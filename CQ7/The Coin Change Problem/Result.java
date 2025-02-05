import java.util.List;

class Result {
  private static List<Long> coins;
  private static int len;

  public static long getWaysHelper(int n, int i) {
    if (n == 0)
      return 1;
    if (n < 0 || i == len)
      return 0;
    return getWaysHelper(n - coins.get(i).intValue(), i) + getWaysHelper(n, i + 1);
  }

  public static long getWays(int n, List<Long> c) {
    coins = c;
    len = c.size();
    return getWaysHelper(n, 0);
  }
}