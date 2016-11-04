/* 주제 : 상속과 다형성 - 다형적 변수와 메서드 호출

*/
package step11;

 public class Exam072_2 {
   static class A {
     int v1;
     void m1() {
       System.out.println("A.m1()");
     }
   }
   static class B extends A {
     int v2;
     void m2() {

       System.out.println("B.m2()");
     }
   }
   static class C extends B {
     int v3;
     void m3() {

       System.out.println("C.m3()");
     }
  }
   public static void main(String[] args) {
     C obj1 = new C();
     obj1.m1(); // C에서 오버라이딩 한 메서드 호출
     obj1.m2(); // 수퍼 클래스의 메서드 호출 가능
     obj1.m3();
System.out.println("-----------------------------------");

B obj2 = new B();
obj2.m1(); // 수퍼 클래스의 메서드 호출 가능
obj2.m2();

System.out.println("-----------------------------------");

A obj3 = new A();
obj3.m1(); // 자기꺼
System.out.println("-----------------------------------");

// 만약 레퍼런스가 하위 클래스의 인스턴스를 가리킬 때 어디까지 메서드를 호출할 수 있나.

A obj4 = new C();
obj4.m1();// 메서드를 호출할 때는 레퍼런스의 타입에 해당하는것만 사용할 수 있다.
// 자바 컴파일러는 단순하다. 레퍼런스가
// 무엇을 가리키고 있는지를 따지지 않고
// 그냥 그 레퍼런스가 어떤 클래스의 변수인지만 고려해서 검사한다.
// obj4.m2(); // 컴파일 오류
// obj4.m3(); // 컴파일 오류

}
}



/*
#
레퍼런스의 사용 범위를 검사할 때,
컴파일러는 그 레퍼런스의 타입(레퍼런스를 선언할 때 지정한 클래스)에 따라
사용 가능한 변수/메서드인지 검사한다.
- 다형적 변수의 특징에 따라 다음의 경우처럼
A p = new C();
 레퍼런스 변수 p에 실제 C 인스턴스의 주소가 저장되었을지라도
 p를 통해 호출할 수 있는 메서드는 A에 한정된다.




*/
