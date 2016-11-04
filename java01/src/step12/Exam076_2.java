/* 주제 : 자바 핵심 클래스 - Object 클래스 - equals()
=> 어떤 메서드냐... 인스턴스 식별번호를 리턴하는 메서드
=> 보통 인스턴스에 보관된 내용에 상관없이 각 인스턴스는 별도의 식별번호를 갖는다.
=> 만약 인스턴스가 다르더라도 같은 값을 갖는 인스턴스에 대해
 같은 식별 번호를 부여하고 싶다면 재정의하라.
 => 원래 동작 (Object의 메서드를 그대로 사용할 때)
 인스턴스에 보관된 내용에 상관없이 각 인스턴스 별로 고유의 식별번호를 리턴한다.
  => 만약 재정의 한다면 그 이유는?
  같은 값을 갖는 인스턴스에 대해 같은 것으로 취급하기 위해
*/
package step12;

 public class Exam076_2  {
   static class A  {
     String name;
     int age;
   }
     static class B { 
       String name;
       int age;


       @Override // B 클래스에 상속되어있는 equals가 맘에 안들어 재정의한 것
       public boolean equals(Object obj) { // 해시코드를 재정의하는 것.
        // other에 넘어온게 같은 클래스인지 아닌지 판단하기 위해서
        if (!(obj instanceof B)) return false; // B의 인스턴스가 아니라면 튕겨내라
        B other = (B)obj;
        if (this.age != other.age) return false;
        if (!this.name.equals(other.name)) return false;
        // this의 이름과 other의 이름이 같은지 비교, 트루가 아니라면 flase
        // 문자열 비교는 equals
        // equals를 재정의하려면 해시코드도 재정의 해주는게 좋다.
         return true; // 인스턴스가 달라도 값이 같다면 true 출력
       }

     }
   public static void main(String[] args) {
    A obj1 = new A();
    obj1.name = "홍길동";
    obj1.age = 20;
    A obj2 = new A();
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj1.equals(obj2));
    System.out.println("==========================");

    B obj3 = new B();
    obj3.name = "홍길동";
    obj3.age = 20;
    B obj4 = new B();
    obj4.name = "홍길동";
    obj4.age = 20;

    System.out.println(obj3.equals(obj4));
    System.out.println("==========================");

  }
}



/*
#









*/
