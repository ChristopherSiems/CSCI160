import java.util.List;

class Result {
  public static void plusMinus(List<Integer> arr) {
    int positive = 0;
    int negative = 0;
    int zero = 0;
    for (int num : arr) {
      if (num > 0) {
        positive++;
      } 
      else if (num < 0) {
        negative++;
      } 
      else {
        zero++;
      }
    }
    System.out.println(((double) positive) / ((double) arr.size()));
    System.out.println(((double) negative) / ((double) arr.size()));
    System.out.println(((double) zero) / ((double) arr.size()));
  }
}
