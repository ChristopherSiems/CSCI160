import java.util.List;

class Result {
  public static void insertionSort2(int n, List<Integer> arr) {
    for (int i = 1; i < n; i++) {
      for (int j = i; j > 0; j--) {
        int curr = arr.get(j);
        int prev = arr.get(j - 1);
        if (curr < prev) {
          arr.set(j - 1, curr);
          arr.set(j, prev);
        } else {
          break;
        }
      }
      for (int num : arr) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}