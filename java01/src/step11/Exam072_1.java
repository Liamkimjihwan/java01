/* 주제 : 상속과 다형성 - 다형적 변수 = polymorphic variable

*/
package step11;

 public class Exam072_1 {
   static class A {
     int v1;
     void m1() {
       System.out.println("A.m1()");
     }
   }
   static class B extends A {
     int v2;
     void m2() {
      this.v1 = 100;
      this.v2 = 200;
       System.out.println("B.m2()");
     }
   }
   static class C extends B {
     int v3;
     void m3() {
       this.v1 = 100;
       this.v2 = 200;
       this.v3 = 300;
       System.out.println("C.m3()");
     }
  }
   public static void main(String[] args) {
     A a1 = new A();
     A a2 = new B(); // B는 A의 기능을 다 포함하고 있다.
     A a3 = new C(); // C는 B의 기능을 다 포함하고 있다.

     // B b1 = new A(); 수퍼클래스는 서브 클래스를 가리킬수 있고,(참조) 서브 클래스는 수퍼 클래스를 가리키지 못함.
    // B b1 = new A();
     //b1.m2(); // B의 m2() 메서드에서 B의 v2 변수를 사용할 수 있기 때문에.
     B b2 = new B();
     B b3 = new C();

     // C c1 = new A(); 오류
     // C c2 = new B(); 오류
     C c3 = new C();






}
}



/*
# 다형적 변수
- 레퍼런스 변수는 오직 한 개의 클래스 인스턴스만 저장하는 것이 아니다.
- 다양한 타입의 인스턴스를 저장할 수 있다.
- 단, 같은 클래스이거나 하위 클래스의 인스턴스를 가리킬 수 있다.

# 참고
- 클래스 이름, 변수 이름, 메서드 이름은 유니코드의 어떤 국가의 문자를 사용할 수 있다.
  자바에서 사용하지 말라고 지정한 문자를 제외하고
  어떤 국가의 문자라도 사용할 수 있다.
  - 단, 패키지 멤버 클래스 이름은 영어로 작성해야 한다.





*/
