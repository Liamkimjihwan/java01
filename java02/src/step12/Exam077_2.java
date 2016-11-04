/* 주제 : Class 클래스 - 클래스 정보를 이용하여 인스턴스 만들기

*/
package step12;

 public class Exam077_2  {
   static class A  {
     //static Class class; 가 존재하다는 뜻. <= 모든 클래스는 이 변수를 내장하고 있음.
     String name;
     int age;

     public void m1() {System.out.println("Hello");}
     public void m2() {}
     public void m3() {}
   }

   public static void main(String[] args) throws Exception {
  // 1) 인스턴스 생성하는 전형적인 방법
  // => new 명령을 사용하여 생성
   A obj = new A();
     obj.m1();
   //2) 클래스 정보를 이용하여 인스턴스 생성하는 방법
      Class clazz1 = A.class;
      A obj2 = (A)clazz1.newInstance();
       obj2.m1(); // 호출가능. new 없이
  }
}



/*
#









*/
