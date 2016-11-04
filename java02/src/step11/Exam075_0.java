/* 주제 : 상속과 다형성 - 자바 최상위 수퍼 클래스 Object


*/
package step11;

 public class Exam075_0 /*extends Object*/ { // 자동
   static class A  /*extends Object*/ {}
   static class B extends A {}

   public static void main(String[] args) {
     // 어떤 클래스의 인스턴스 자손인지 확인하는 방법.
     // => instanceof 연산자 사용
      // => []인스턴스 주소] instanceof [클래스명] => boolean 리턴
     A obj1 = new A();
     B obj2 = new B();

    if (obj1 instanceof A) {System.out.println("obj1은 A의 인스턴스이다.");}
     if (obj1 instanceof Object) {System.out.println("obj1은 Object의 인스턴스이다.");}
     if (obj2 instanceof B) {System.out.println("obj2는 B의 인스턴스이다.");}
     if (obj2 instanceof A) {System.out.println("obj2는 A의 인스턴스이다.");}

  }
}



/*
# java.lang.Object 클래스
- 자바 클래스는 반드시 수퍼 클래스가 있어야 한다.
- 만약 개발자가 수퍼클래스를 지정하지않으면 자동으로 Object를 상속 받는다.
- 따라서 모든 자바 클래스는 Object의 자손이다.

자바에서 클래스들은 Objcet의 자손이다










*/
