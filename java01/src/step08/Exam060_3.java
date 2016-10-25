// 파라미터가 있는 생성자 선언
package step08;

 public class Exam060_3 {
static class Book {
  String title;
  String author;
  String press;
  int price;
  int pages;

// 생성자가 단 하나라도 있으면 기본 생성자를 만들어주지 않는다.
  Book(String title) {
    System.out.println("Book(String) 호출");
  }
}

   public static void main(String[] args) {
// Book b1 = new Book(); 기본 생성자가 없어서 컴파일 오류
Book b2 = new Book("하하하");

Book b2 = new Book; // 컴파일 오류, 생성자 호출 없이 인스턴스 만들수 없다.
                    // 생성자 호출은 필수
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
