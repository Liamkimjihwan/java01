package step03;

 public class Exam034 {
   // static 변수로 데이터 타입 정의하기
   static class Score { // 4 종류의 메모리를 묶어 새 데이터 타입을 만든다.
                        // 그 이름이 score
     static int kor;
     static int eng;
     static int math;
     static int sum;
     static float aver;
   }

   public static void main(String[] args) {
  // static으로 선언된 변수로 만든 데이터 타입은 바로 사용하면 된다.
  Score.kor = 100;
  Score.eng = 90;
  Score.math = 100;
  Score.sum = Score.kor + Score.eng + Score.math;
  Score.aver = Score.sum / 3;

  System.out.println(Score.aver);






   }
 }

 /*

 # 개발자가 임의의 새 데이터 타입을 저장하는 문법
class 새타입이름
// 메모리 항목
int kor;
int eng;
*/
