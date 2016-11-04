/* 주제 : 상속과 다형성 - 자바 최상위 수퍼 클래스 Object II


*/
package step11;

 public class Exam075_1 /*extends Object*/ { // 자동
   static class A  /*extends Object*/ {}
   static class B extends A {}

   public static void main(String[] args) {
     // 어떤 클래스의 인스턴스 자손인지 확인하는 방법.
     // => instanceof 연산자 사용
      // => []인스턴스 주소] instanceof [클래스명] => boolean 리턴
     A obj1 = new A();
    String str = obj1.toString(); // 수퍼 클래스 Objcet의 toString() 메서드
    System.out.println(str);

  }
}



/*
#






*/
