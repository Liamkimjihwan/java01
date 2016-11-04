/* 주제 : 자바 핵심 클래스 - Object 클래스 - hashCode()
=> 어떤 메서드냐... 인스턴스 식별번호를 리턴하는 메서드
=> 보통 인스턴스에 보관된 내용에 상관없이 각 인스턴스는 별도의 식별번호를 갖는다.
=> 만약 인스턴스가 다르더라도 같은 값을 갖는 인스턴스에 대해
 같은 식별 번호를 부여하고 싶다면 재정의하라.
 => 원래 동작 (Object의 메서드를 그대로 사용할 때)
 인스턴스에 보관된 내용에 상관없이 각 인스턴스 별로 고유의 식별번호를 리턴한다.
  => 만약 재정의 한다면 그 이유는?
  같은 값을 갖는 인스턴스에 대해 같은 식별 번호를 부여하여
  인스턴스를 비교하거나 저장하고 싶을 때 재정의함.
*/
package step12;

 public class Exam076_1  {
   static class A  {
     String name;
     int age;
   }
     static class B {
       String name;
       int age;


       @Override
       public int hashCode() { // 해시코드를 재정의하는 것.
         String str = name + "," + age; // 문자열에 숫자열을 더하면 숫자열은 문자열 형태로
         return str.hashCode();
       }
     }
   public static void main(String[] args) {
    A obj1 = new A();
    obj1.name = "홍길동";
    obj1.age = 20;
    A obj2 = new A();
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
    System.out.println("==========================");

    B obj3 = new B();
    obj3.name = "홍길동";
    obj3.age = 20;
    B obj4 = new B();
    obj4.name = "홍길동";
    obj4.age = 20;

    System.out.println(obj3.hashCode());
    System.out.println(obj4.hashCode());
    System.out.println("==========================");

  }
}



/*
#









*/
