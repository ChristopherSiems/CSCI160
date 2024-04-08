import java.util.List;

class Result {
  public static List<Integer> longestCommonSubsequenceHelper(List<Integer> a, List<Integer> b, List<Integer> c, int i,
      int j) {
    if (i < 0 || j < 0)
      return c;
    List<Integer> list = new ArrayList<Integer>(c);
    if (a.get(i) == b.get(j)) {
      list.add(0, a.get(i));
      return longestCommonSubsequenceHelper(a, b, list, i - 1, j - 1);
    } else {
      List<Integer> list_1 = longestCommonSubsequenceHelper(a, b, new ArrayList<Integer>(list), i - 1, j);
      List<Integer> list_2 = longestCommonSubsequenceHelper(a, b, new ArrayList<Integer>(list), i, j - 1);
      return (list_1.size() >= list_2.size()) ? list_1 : list_2;
    }
  }

  public static List<Integer> longestCommonSubsequence(List<Integer> a, List<Integer> b) {
    return longestCommonSubsequenceHelper(a, b, new ArrayList<Integer>(), a.size() - 1, b.size() - 1);
  }
}