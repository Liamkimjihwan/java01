/* 주제 : Class 클래스 - 메서드 정보 추출하기

*/
package step12;
import java.lang.reflect.Method; // 이 패키지에 있는 클래스를 쓰겠다

 public class Exam077_3  {
   static class A  {
     //static Class class; 가 존재하다는 뜻. <= 모든 클래스는 이 변수를 내장하고 있음.
     String name;
     int age;

     public void m1() {System.out.println("Hello");}
     protected void m2() {}
     void m3() {}
     private void m4() {}
   }

   public static void main(String[] args) throws Exception {
      Class clazz = A.class; // < 스태틱 변수 .class

      //1) 클래스의 메서드 목록을 얻는다.
      // => 그 클래스의 메서드 및 수퍼 클래스의 메서드를 추출한다.
      // 단, public 접근이 허용된 메서드만 추출 가능.
      Method[] methods = clazz.getMethods();  // 수퍼클래스까지의 메서드까지 public으로만 된것

      // 2) 반복문을 통해 메서드 이름을 알아낸다.
      for (Method method : methods) {
        System.out.println(method.getName());
      }
      System.out.println("======================");

       // 수퍼 클래스의 메서드를 제외하는 대신
       // 그 클래스의 모든 접근 범위의 메서드를 추출한다. ↓
      methods = clazz.getDeclaredMethods(); // 현재 메서드까지만 , public 포함 전체
      // 2) 반복문을 통해 메서드 이름을 알아낸다.
      for (Method method : methods) {
        System.out.println(method.getName());
      }

  }
}



/*
#









*/
