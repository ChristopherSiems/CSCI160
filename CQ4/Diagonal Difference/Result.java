import java.util.List;

class Result {
  public static int diagonalDifference(List<List<Integer>> arr) {
    int lrSum = 0, rlSum = 0;
    for (int index = 0, front = 0, back = arr.size() - 1; (front < arr.size()) && (back >= 0) &&
    (index < arr.size()); index++) {
      lrSum += arr.get(index).get(front);
      rlSum += arr.get(index).get(back);
      front++;
      back--;
    }
    return Math.abs(lrSum - rlSum);
  }
}