/* 주제 : 인스턴스 변수에 직접 접근했을 때 발생하는 문제 i
  

*/


package step16.ex1;

public class ScoreTest {
  public static void main(String[] args) {
    Score score = new Score("홍길동", 100, 98, 75);
     Score.sum = 200; // 직접 변수에 접근하는 것을 막을 수 없다.
    System.out.printf("합계: %d, 평균: %f\n", score.sum, score.average);
  }
}