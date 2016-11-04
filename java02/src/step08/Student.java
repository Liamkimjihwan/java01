
package step08;

 public class Student {
  String name;  // 인스턴스를 생성할 때 어떤 메모리를 만들어야하는지에 대한 명령어
                // 인스턴스 변수(instance variables)라고 한다.
  String email;
  String tel;
  int age;
  boolean working;
// 생성자
// => 리턴타입이 없고, 메서드명이 클래스명과 같다.
 Student(String name, String email, String tel, int age, boolean working) {
// Student 넣는게 바로 생성자. 클래스명과 같게
   this.name = name;
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
