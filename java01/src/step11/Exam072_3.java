/* 주제 : 상속과 다형성 - 다형적 변수와 형변환

*/
package step11;

 public class Exam072_3 {
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
     int v3; // C만의 인스턴스가 아니라 class A에서 확장한거이기 때문에 다 연관되어있다.
     void m3() {

       System.out.println("C.m3()");
     }
  }
   public static void main(String[] args) {

    A obj1 = new C();
    obj1.m1(); // ok
    //obj1.m2(); // 오류 = A에 없기에
    //obj1.m3(); // 오류 = A에 없기에
    ((C)obj1).m2();
    ((C)obj1).m3();
    // 실행할 때 임시 C 클래스의 레퍼런스가 생성되고 obj1 값이 들어간다.
    // 예 => C temp <--- obj1 값
    // 2) 그리고 그 임시 변수를 통해 메서드를 호출한다.
    System.out.println("========================");
    // 타입 캐스팅(형변환)을 통해 하기보다 아예 레퍼런스 변수에 저장하는 방법
    C temp = (C)obj1; // obj1에 실제 들어있는 주소는 C 인스턴스가 맞다.
    temp.m1();
    temp.m2();
    temp.m3();
}
}



/*
#




*/
