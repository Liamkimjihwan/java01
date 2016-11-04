/* 주제 : 오버롸이딩 하기 전의 메서드 호출하는 방법

*/
package step11;

 public class Exam072_1 {
    static class A {
      void m1() {
        System.out.printf("A.m1()\n");
      }
      void m2() {
        System.out.printf("A.m2()\n");
      }
    }

    static class B extends A {
      void m1() {
        System.out.printf("B.m1()\n");
      }
      void m3() {
        System.out.printf("B.m3()\n");
      }
      void test1() {
        this.m1(); // 현재 클래스에서 먼저 메서드를 찾는다.
        this.m2(); // 현재 클래스에서 찾아보고 없으면 수퍼 클래스를 뒤진다.
      }
      void test2() {
        super.m1(); // 오버라이딩 하기 전에 메서드 호출은
      //  super.m3(); // 무조건 현재 클래스가 아닌 수퍼 클래스부터 m3() 찾는다.
       this.m3(); // ok~!~!~!
       super.m2(); // 무조건 수퍼 클래스부터 찾는
      }
    }


   public static void main(String[] args) {
B obj = new B();
obj.test1();
System.out.println("--------------------");

obj.test2();
System.out.println("----------------------");
}
}



/*
# super 키워드

오버라이딩 하기 전의 메서드를 호출할 때 사용하는 특수 명령어다.
- 현재 클래스가 아닌 수퍼 클래스부터 위로 올라가면서 메서드를 찾는다.
*/
