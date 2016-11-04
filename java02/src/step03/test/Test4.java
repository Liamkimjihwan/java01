package step03.test;
// 저자 , 책 이름, 가격, 출판일, 페이지
 public class Test4 {
  // 새로운 데이터 파일을 저장한다.
  // 만들 메모리의 구조를 설계한다.
  // Ex) 스튜던트라는 메모리의 구조를 설계
  static class Student {

    String name;
    int age;
    int postno;
    String baseAddress;
    String detailAddress;
    String school;
    boolean working;
    String tel;
    String email;
  }

  public static void main(String[] args) {
// 2) 설계도에 따라 메모리에 준비를 한다.
    Student s1 = new Student();

    // 3) 메모리 이름을 사용하여 해당 메모리의 각 항목에 접근한다.
    s1.name = "홍길동";
    s1.age = 27;
    s1.postno = 76221;
    s1.baseAddress = "서울시";
    s1.detailAddress = "마포구";
    s1.school = "비트대학교";
    s1.working = false;
    s1.tel ="111-1111";
    s1.email = "hong@gamil.com";

    //4) 메모리에 들어있는 값을 출력하자.

    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.postno);
    System.out.println(s1.baseAddress);
    System.out.println(s1.detailAddress);


   }
 }
