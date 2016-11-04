// 사용자 정의 타입의 인스턴스 생성
package step07;

 public class Exam059_0 {

   public static void main(String[] args) {
  Student s1;
  Student s2;

  s1 = new Student();
  s2 = new Student();

s1.name = new String("홍길동");
s1.email = new String("hong@test.com");
s1.tel = new String("1111-1111");
s1.age = 38;
s1.working = true;

s1.name = "홍길동"; // 주의 ! 값을 저장하는 것이 아니라 인스턴스 주소를 저장한다!!
                   // new String 식을 함축시킨것. 상수
s1.email = "hong@test.com";
s1.tel = "1111-1111";
s2.age = 20;
s2.working = false;

System.out.println(s1.name);
System.out.println(s2.age);


  }
 }





/*
인스턴스

인스턴스의 생성 위치와 상관없이
new로 생성된 객체는 무조건 heap 메모리 영역에 모인다.
따라서 메서드 호출이 끝나더라도 제거되지않는다. ex) new int[]{값}
=> 메서드 호출이 끝날 때 제거되는 것은
stack 메모리에 존재하는 로컬 변수이다. ex) m1 m2 m3



*/
