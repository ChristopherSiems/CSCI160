import java.util.List;

class Result {
  private static List<Integer> A;

  public static int maxSubarray(int i, int sum) {
    if (i == A.size()) {
      return sum;
    }
    return Math.max(Math.max(maxSubarray(i + 1, sum + A.get(i)), maxSubarray(i + 1, A.get(i))),
        (sum == 0) ? Integer.MIN_VALUE : sum);
  }

  public static int maxSubsequence(int i, int sum) {
    if (i == A.size()) {
      if (sum == 0) {
        return Integer.MIN_VALUE;
      }
      return sum;
    }
    return Math.max(maxSubsequence(i + 1, sum + A.get(i)), maxSubsequence(i + 1, sum));
  }

  public static List<Integer> maxSubarray(List<Integer> arr) {
    A = arr;
    List<Integer> list = new ArrayList<Integer>();
    list.add(maxSubarray(0, 0));
    list.add(maxSubsequence(0, 0));
    return list;
  }
}