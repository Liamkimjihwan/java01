/* 주제 : String class - 상수 스트링 인스턴스
=> 메모리 관리 효율성을 위해 같은 문자열에 대해 오직 한 개의 스트링 인스턴스만 존재한다.

*/
package step12;

 public class Exam078_1  {

   public static void main(String[] args) throws Exception {
   // 상수 스트링 인스턴스는 Constants Pool에 생성된다.
   // 중복 생성되지 않는다.
   String s1 ="ABC"; //
   String s2 ="ABC"; // 위에서 상수 스티링"ABC"가 Constants Pool에
                     // 이미 존재 하기 떄문에 리턴하는 것은 위에서 만든 스트링
                    // 인스턴스 주소이다. 따라서 s1=s2

   if ( s1 == s2) System.out.println("s1 == s2"); // 같지않다는 뜻.. 출력이 안됨

  }
}



/*
#









*/
