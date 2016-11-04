
package step03;

 public class Exam035 {
   // 인스턴스 변수로 데이터 타입 정의하기
 // 4 종류의 메모리를 묶어 새 데이터 타입을 만든다.
                        // 그 이름이 score
//class 문법을 메모리의 종류를 정의한다.
// 배열은 오직 같은 종류의 메모리만 여러 개 준비할 수 있다.
// class 문법을 사용하여 다른 종류의 메모리를 여러 개 준비 가능
// score는 String(1), int(4), float(1)로 구성되는 메모리임을 정의하는 것이지
// 메모리를 즉시 준비하는 것은 아니다.
// 즉 score는 메모리를 준비할 때 참고할 설계도이다.
static class Score {
      String name;      // 6개의 설계도
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
  
   }
   public static void main(String[] args) {
  // 1) 인스턴스 준비
  // 클래스에 정의된 대로 복합 메모리 준비하기
  // 이렇게 준비한 복합 메모리를 "인스턴스=실예"라 부른다
  Score s1 = new Score();

// 2) 복합 메모리에 값 넣기
// 메모리의 이름=인스턴스이름.내부 메모리의 이름
s1.name = "홍길동";
s1.kor = 100;
s1.eng = 100;
s1.math = 100;
s1.sum = s1.kor + s1.eng + s1.math;
s1.aver = s1.sum / 3;

// 3) 복합 메모리의 값 꺼내기
System.out.println(s1.name);
System.out.println(s1.kor);
System.out.println(s1.eng);
System.out.println(s1.math);
System.out.println(s1.sum);
System.out.println(s1.aver);




   }
 }

 /*

 # 인스턴스 변수로 구성된 데이터 타입은
   new 명령을 사용하여 메모리 준비
   새데이터타입이름 메모리를 가리키는 별명 = new 새데이터타입이름();
   */
