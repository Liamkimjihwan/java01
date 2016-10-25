// 객체 지향 핵심 문법 - 생성자
// 인스턴스를 사용자가 준 값으로 자동 초기화시키는 메서드
package step08;

 public class Exam060_1 {
static class Book {
  String title;
  String author;
  String press;
  int price;
  int pages;
// 기본 생성자, 생성자가 없으면 다음과 같은 기본 생성자를 컴파일러가 자동으로 추가한다.
 // public Book() {} // 물론 아무것도 안한다 이것은.
}

   public static void main(String[] args) {
Book b1 = new Book(); // 인스턴스 = book에 있는 다섯개가 heap에 저장
}

}





/*
# new Book 문법의 의미
new : heap 영역에 메모리를 준비하라는 뜻
Book : Book 설계도에 맞추어
() : 준비된 메모리를 초기화 시킬 때 기본 생성자 호출하라.

# 기본 생성자
-파라미터가 없는 생성자
- 클래스에 생성자가 한 개도 없으면 자동으로 컴파일러가 생성해준다.
- 만약 생성자가 한 개라도 있으면 기본 컴파일러는 자동으로 생성자를 만들지 않는다.
- 자바에서는 생성자가 없는 클래스는 존재할 수 없다.
*/
