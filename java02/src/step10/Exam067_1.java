/* 주제 : 생성자 - 생성자에서 다른 생성자 호출하기 !



*/
package step10;

import java.util.Scanner;

 public class Exam067_1 {

  static class Book {
    String title;
    String author;
    String press;
    int pages;
    boolean local;

  public Book() {} // 기본 생성자 만들기 이게 있어야 new 명령어를 실행할 수 있다.


   public Book(String title) {
     this.title = title;
     System.out.println("Book(String)");
   }

   public Book(String title, String press) {

     this(title);
     this.press = press;
     System.out.println("Book(String,String)");
   }

   public Book(String title, String press, String author, int pages) {

     this(title, press);
     this.author = author;
     this.pages = pages;
     System.out.println("Book(String,String,String,int)");
   }


  }

   public static void main(String[] args) {

     Book book = new Book(); // 기본값으로 초기화된 객체(인스턴스)를 만들고 싶다.
    System.out.println("---------------------------------------");

    Book book2 = new Book("자바 프로그래밍");
    System.out.println("---------------------------------------");

    Book book3 = new Book("자바 프로그래밍", "비트출판사");
    System.out.println("---------------------------------------");

    Book book4 = new Book("자바 프로그래밍", "비트출판사", "홍길동", 780);
    System.out.println("---------------------------------------");

}
}



/*
#기본 생성자 (파라미터가 없는 생성자)
- 생성자가 단 한 개라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다.

# this()
- 동료 생성자를 호출할 때 사용
- 기존 생성자 코드를 재활용할 수 있어서 유지보수에 좋다.
- 반드시 생성자 블록에서 첫 번째 순서로 와야 한다.
  물론 앞에 주석이 있는 것은 상관없다.

*/
