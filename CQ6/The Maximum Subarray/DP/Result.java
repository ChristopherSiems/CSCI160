class Result {
  public static List<Integer> maxSubarray(List<Integer> arr) {
    int length = arr.size();
    int[][] tab = new int[length][length];
    int subarray = Integer.MIN_VALUE;
    for (int i = 0; i < length; i++) {
      int curr = arr.get(i);
      tab[0][i] = curr;
      tab[i][0] = curr;
      subarray = (curr > subarray) ? curr : subarray;
    }
    int max = subarray;
    for (int i = 1; i < length; i++) {
      for (int j = 1; j < length; j++) {
        int temp = tab[i - 1][j - 1] + arr.get(i);
        tab[i][j] = temp;
        subarray = (temp > subarray) ? temp : subarray;
      }
    }
    int subsequence = 0;
    for (int i : arr) {
      subsequence += (i > 0) ? i : 0;
      max = (i > max) ? i : max;
    }
    List<Integer> list = new ArrayList<Integer>();
    list.add(subarray);
    list.add((subsequence > 0) ? subsequence : max);
    return list;
  }
}