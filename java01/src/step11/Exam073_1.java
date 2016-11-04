/* 주제 : 상속과 다형성 - 오버라이딩 오류 예


*/
package step11;

 public class Exam073_1 {
   static class A {
     int v1;
     void m1(String value, int value2) {
       v1 = 100;
       System.out.println("A.m1()");
     }
   }
   static class B extends A {
     int v2;
    /* void m1(String v, int v2) { // ok
      v1 = 200;
      v2 = 200;
       System.out.println("B.m1()");
     }*/
     /* 컴파일 오류 .. 리턴타입이 같아야하는데 달라서
     int m1(String v, int value2) {
      v1 = 200;
      v2 = 200;
       System.out.println("B.m1()");
     }*/
     void m1(int v2, String v) {
       // 컴파일 ok, 오버라이딩 아니다. 걍 새 메서드 추가한거일뿐 = 오버로딩
                                 // 오버라이딩 하려면 반드시 순서가 일치해야 한다.
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
- 재정의 규칙
  리턴 타입이 같아야 한다.
  메서드 명이 같아야 한다.
  메서드의 파라미터 개수와 타입 순서가 같아야 한다.
  단, 파라미터 변수의 이름은 달라도 된다.



*/
