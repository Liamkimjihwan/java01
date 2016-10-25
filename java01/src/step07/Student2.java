// 해당 클래스를 위한 메서드 추가
package step07;

 public class Student2 {
  String name;  // 인스턴스를 생성할 때 어떤 메모리를 만들어야하는지에 대한 명령어
                // 인스턴스 변수(instance variables)라고 한다.
  String email; // 변수선언
  String tel;
  int age;
  boolean working; // 인스턴스 변수
  // 이 다섯개는 설계도, new Student 명령을 하면 heap에 인스턴스 생성
// 메서드는 인스턴스 생성과 관련 없다.
// 메서드는 메서드 영역에 놓인다.
// = > 클래스 이름으로 호출하는 메서드 = 클래스 메서드 = 스태틱 메서드
static void init(Student2 student, String name, String email, String tel, int age, boolean working) {
// 메서드 선언 ↑
  student.name = name;  // 파라미터 명과 인스턴스 명이 같게 해야한다.
  student.email = email;
  student.tel = tel;
  student.age = age;
  student.working = working; // 인스턴스 메서드 = 인스턴스를 다루는 메서드
  // 값을 초기화한다는건 파라미터로 주소 받기위해 인스턴스 설정.
}

static void printStudent(Student2 student) { // student 파일받으려면 메서드가 필요했음. 위에있는 Student2 student
  System.out.printf("%s,%s,%s,%d,%b\n",
    student.name, student.email, student.tel, student.age, student.working);
}
 }













/*
관련성이 있는것끼리 모아두면 유지보수가 좋기 때문에 따로 관리함.



*/
