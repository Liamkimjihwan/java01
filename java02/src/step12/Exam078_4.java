/* 주제 : String class - Immutable(불변의) 객체 mutalble(변경가능) 객체
=> String 인스턴스의 값은 한 번 생성되면 변경되지 않는다.
=> wrapper 인스턴스도 immutable이다.

*/
package step12;

 public class Exam078_4 {
   public static void main(String[] args) throws Exception {
  // 이뮤터블의 예
  String s1 = "Hello, world!";
  String s2 = s1.replace('o', 'x'); // 기존 스트링을 복제해서 새 스트링을 만든 다음
                                  // 문자 o를  x로 교체한 새 인스턴스를 만든다.

  s1.replace('o', 'x');
System.out.println(s1);
System.out.println(s2);

// 뮤터블의 예
// 뮤터블 객체 StringBuffer
StringBuffer buf1 = new StringBuffer("Hello, world");
buf1.replace(2, 4, "xx"); // 2번부터 4번전까지 xx 로 바꿔라. 4번까지가 아님.
System.out.println(buf1);

  }
}



/*
#









*/
