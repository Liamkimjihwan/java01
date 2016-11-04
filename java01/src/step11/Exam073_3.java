/* 주제 : 상속과 다형성 - 오버라이딩 검사하기


*/
package step11;

 public class Exam073_3 {
   static class A {
     int v1;
     void m1(String value, int value2) {
       v1 = 100;
       System.out.println("A.m1()");
     }
   }
   static class B extends A {
     int v2;
  // 다음과 같이 개발자가 잘못된 오버라이딩을 할 경우가 있다....
  // 즉 오버라이딩()이 아니라 오버로딩이 된 경우!
  // 그러나 개발자는 올바르게 오버라이딩 했다고 착각
  @Override // 오버라이딩을 하려고하는데 검사좀 해달라는 명령어
     void m1(int value2, String value) {

       System.out.println("B.m1()");
     }
   }
   public static void main(String[] args) {
    B obj = new B();
   obj.m1("haha", 10); // String , int 값 순서대로
}
}



/*
# 애노테이션
- 컴파일러나 JVM 에게 전달하는 특별한 주석이다.
- 컴파일러나 JVM은 이 주석을 참조하여 지정된 작업을 수행한다.
- 문법
  @ 애노테이션이름(속성=값, 속성=값, 속성=값...)

# @Override
- 컴파일러에게 전달하는 애노테이션이다.
- 메서드가 오버라이딩 하는지 검사하라는 명령어다.
- 메서드가 수퍼 클래스의 메서드를 오버라이딩하지 않는다면 컴파일러는 오류를 발생시킨다.

*/
