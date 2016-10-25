// 퀴즈
// 1) 0~ 9 까지 출력한다.
// 2) 각 숫자가 짝수인지 홀수인지
public class Test01 {
  public static void main(String[] args) {


    for(int a = 0; a < 10; a++) {
      if (a % 2 == 0)
      System.out.printf("%d (짝수)\n", a);
      else
      System.out.printf("%d (홀수)\n", a);
    }
  }
}
