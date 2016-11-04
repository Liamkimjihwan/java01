public class Exam048_600 {
  public static void main(String[] args) {
    int count = 5;
    int count2 = 0;

    while (count-- > 0) {
      while (count2++ <= count) {
        System.out.print("*");
      }
      System.out.println();
      count2 = 0;
    }
  }
}
