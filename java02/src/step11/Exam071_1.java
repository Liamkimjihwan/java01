/* 주제 : 상속- 메서드 오버롸이딩

*/
package step11;

 public class Exam072_0 {
    static class A {
      void m1() {
        System.out.printf("A.m1()\n");
      }
    }

    static class B extends A {
      void m1() {
        System.out.printf("B.m1()\n");
      }
      void m2() {
        System.out.printf("B.m2()\n");
      }
    }


   public static void main(String[] args) {

A obj = new A();
obj.m1();

B obj2 = new B();
obj2.m2();  // m2에 호출이 있기 때문에 이쪽에 따로 System.out.... 안써도 됨.
obj2.m1(); // 수퍼 클래스가 아닌 레퍼런스 타입(클래스)에서 정의되어있는
           //  m1()을 호출한다. => 자기꺼 먼저 찾는다!

}
}



/*
# 메서드 오버라이딩

변수만 오버라이딩이 아니라 메서드 오버라이딩
- 수퍼 클래스의 메서드를 서브 클래스에서 자신의 목적에 맞게끔 재정의하는 문법
*/
