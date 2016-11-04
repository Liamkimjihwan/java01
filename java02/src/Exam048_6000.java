package step05;

public class Exam048_6000 {
  public static void main(String[] args) {
    int a = 1;
    int b = 0;
    while (a++ < 9) {
      while (b++ < 9) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
     }
     System.out.println();
       b = 0;
    }
  }
}
