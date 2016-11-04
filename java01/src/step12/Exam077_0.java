/* 주제 : Class 클래스 - 클래스 정보를 얻는 다양한 방법들

*/
package step12;

 public class Exam077_0  {
   static class A  {
     //static Class class; 가 존재하다는 뜻. <= 모든 클래스는 이 변수를 내장하고 있음.
     String name;
     int age;

     public void m1() {}
     public void m2() {}
     public void m3() {}
   }

   public static void main(String[] args) throws Exception {
     //1) 클래스 정보 얻는 첫 번째 방법- 인스턴스 레퍼런스를 통해 얻기
   A obj = new A();
     Class clazz1 = obj.getClass(); // 인스턴스를 알 때

   // 2) class 라는 내장 스태틱 변수를 통해 얻기
   //    모든 클래스는 자신의 로딩된 정보를 가리키는 스태틱 변수 클래스를 갖고 있음.
    Class clazz2 = A.class; // 클래스 A의 숨겨진 static Class class(스태틱 변수)를 가리킴
                           // 스태틱 변수는 [클래스명].[변수명]


    //3)Class의 forname() 메서드를 통해 얻기
    Class clazz3 = Class.forName("step12.Exam077_0$A");

    if(clazz1 == clazz2) System.out.println("clazz1 == clazz2");
    if(clazz1 == clazz3) System.out.println("clazz1 == clazz3");
  }
}



/*
#









*/
