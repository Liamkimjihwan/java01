// 해당 클래스를 위한 메서드 추가
package step07;

 public class Student3 {
  String name;  // 인스턴스를 생성할 때 어떤 메모리를 만들어야하는지에 대한 명령어
                // 인스턴스 변수(instance variables)라고 한다.
  String email;
  String tel;
  int age;
  boolean working;
// 메서드는 인스턴스 생성과 관련 없다.
// 메서드는 메서드 영역에 놓인다.
// => 파라미터로 인스턴스 주소를 받는 것이 아니라
//   메서드를 호출할 때 메서드 앞 부분으로부터 주소를 받는 메서드를
// 인스턴스 메서드(instance mathod)라 부른다
 void init(String name, String email, String tel, int age, boolean working) {
  // 메서드를 호출할 떄 넘겨 준 인스턴스 주소는 어떻게 알아내느냐...
  // arr[0].init 메서드 앞에 있는 인스턴스 주소는 어떻게 받는가..
  // => 내부에 미리 생성된 변수(built-in variable) "this" 변수에 저장된다.
  // => static 으로 선언된 메서드는 없다.
   this.name = name;  // this는 보이지않음.
  this.email = email;
  this.tel = tel;
  this.age = age;
  this.working = working;
}

 void printStudent() {
  System.out.printf("%s,%s,%s,%d,%b\n",
    this.name, this.email, this.tel, this.age, this.working);
}
 }













/*
관련성이 있는것끼리 모아두면 유지보수가 좋기 때문에 따로 관리함.



*/
