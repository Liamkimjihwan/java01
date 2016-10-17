package step03;

 public class Exam035 {
   // 인스턴스 변수로 데이터 타입 정의하기
   static class Score { // 4 종류의 메모리를 묶어 새 데이터 타입을 만든다.
                        // 그 이름이 score
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
   }
   public static void main(String[] args) {
  // 인스턴스 변수로 구성된 새 데이터 타입의 메모리를 만드는 방법
   Score s1 = new Score(); // 메모리 준비. 이 메모리의 이름은 s1
   Score s2 = new Score(); // 메모리 준비. 이 메모리의 이름은 s2

// 메모리에 값 넣기

s1.kor = 100;
s1.eng = 100;
s1.math = 100;
s1.sum = s1.kor + s1.eng + s1.math;
s1.aver = s1.sum / 3;

s2.kor = 90;
s2.eng = 90;
s2.math = 90;
s2.sum = s2.kor + s2.eng + s2.math;
s2.aver = s2.sum / 3;

System.out.println(s1.aver);
System.out.println(s2.aver);




   }
 }

 /*

 # 인스턴스 변수로 구성된 데이터 타입은
   new 명령을 사용하여 메모리 준비
   새데이터타입이름 메모리를 가리키는 별명 = new 새데이터타입이름();
   */
