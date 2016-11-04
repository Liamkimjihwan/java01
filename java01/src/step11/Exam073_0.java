/* 주제 : 상속과 다형성 - 오버라이딩


*/
package step11;

 public class Exam073_0 {
   static class A {
     int v1;
     void m1(String value) {
       v1 = 100;
       System.out.println("A.m1()");
     }
   }
   static class B extends A {
     int v2;
     // 수퍼클래스 메서드가 현재 클래스에
     void m1(String v) { // 리턴값 void 메서드 명 m1 파라미터 개수 String
      v1 = 200;
      v2 = 200;
       System.out.println("B.m1()");
     }
   }
   public static void main(String[] args) {
    B obj = new B();
 obj.m1("2000", 2000);
 System.out.println(obj.v1);
 System.out.println(obj.v2);
}
}



/*
# 오버라이딩
- 서브 클래스에서 사용할 수 있는 수퍼 클래스 중에서
서브 클래스의 기능과 맞지 않는 것은
서브 클래스에서 다시 정의할 수 있다.
- 재정의 규칙 : 동일한 시그너쳐(아래 내용)를 가져야 한다.
  리턴 타입이 같아야 한다.
  메서드 명이 같아야 한다.
  메서드의 파라미터 개수와 타입 순서가 같아야 한다.
  단, 파라미터 변수의 이름은 달라도 된다.



*/
