/* 주제 : 오버롸이딩 하기 전의 메서드 호출하는 방법

*/
package step11;

 public class Exam072_2 {
    static class A {
      void m1() {
        System.out.printf("A.m1()\n");
      }
      void m2() {
        System.out.printf("A.m2()\n");
      }
    }
    static class B extends A {
      void m2() {
        System.out.printf("B.m2()\n");
      }
      void m3() {
        System.out.printf("B.m3()\n");
      }
 }

    static class C extends B {
      void m1() {
        System.out.printf("C.m1()\n");
      }
      void m2() {
        System.out.printf("C.m2()\n");
      }
      void m4() {
        System.out.printf("C.m4()\n");
      }
      void test1() {
      //  super.m4(); // 조상 클래스중에 m4() 는 없기 때문에 오류
        super.m2(); // 클래스 중 가장 위에있는 m1이 아니라 바로 위부터 찾았기 때문에
        super.m1();
        super.m3();
      }
    }


   public static void main(String[] args) {
   C obj = new C();
    obj.test1();

}
}

/*
# super 키워드

오버라이딩 하기 전의 메서드를 호출할 때 사용하는 특수 명령어다.
- 현재 클래스가 아닌 수퍼 클래스부터 위로 올라가면서 메서드를 찾는다.


 this 와 super
 - this는 메서드를 찾을 때 현재 클래스(레퍼런스 변수의 클래스)부터 찾는다.
 super는 현재 클래스의 (레퍼런스 변수의 클래스의) 수퍼 클래스부터 찾는다.
*/
