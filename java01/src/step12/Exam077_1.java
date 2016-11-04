/* 주제 : Class 클래스 - 클래스 이름 알아내기

*/
package step12;

 public class Exam077_1  {
   // 클래스 안에 메서드나 변수와 동등 레벨로 선언된 경우, 멤버 inner 클래스라 한다.
   static class A  {
     //static Class class; 가 존재하다는 뜻. <= 모든 클래스는 이 변수를 내장하고 있음.
     String name;
     int age;

     public void m1() {}
     public void m2() {}
     public void m3() {}
   }

   public static void main(String[] args) throws Exception {
   A obj = new A();
     Class clazz1 = obj.getClass();

   // 1) 클래스 이름 리턴
   String classNameWithPackageName = clazz1.getName();
   String classNameOnly = clazz1.getSimpleName();


 System.out.println(classNameWithPackageName);
 System.out.println(classNameOnly);
 System.out.println(clazz1.toString());

System.out.println(clazz1.isMemberClass()); // 멤버 inner 클래스 여부  클래스 안에 멤
System.out.println(clazz1.isMemberClass());// 로컬 inner 클래스 여부 메서드 안에 로컬이냐

// 메서드 안에 선언된 클래스를 로컬 inner 클래스라 부름
class B {}
 // 2) Member 클래스 또는 lacal 클래스
 System.out.println(B.class.isMemberClass()); // inner 클래스 여부
 // inner 클래스 여부 다른 클래스 안에 들어가 있느냐
 System.out.println(B.class.isLocalClass()); // 로컬 inner 클래스 여부
 //
  }
}



/*
#









*/
