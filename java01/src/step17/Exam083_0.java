package step17;
public class Exam083_0 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;


    Book() {}
    Book(String title) {
      System.out.println("Book(String) 호출");
    }

    Book(String title, String author) {
      System.out.println("Book(String,String) 호출");
      this.title = title;
      this.author = author;
    }


    Book(String title, String press, int price) {
      System.out.println("Book(String, String, int) 호출");
      this.title = title;
      this.author = author;
      this.price = price;
    }
  }

  public static void main(String[] args) {
    Book b1 = new Book("자바 프로그래밍", "홍길동");
    Book b2 = new Book("자바 프로그래밍", "비트 출판사");
    Book b3 = new Book("자바 프로그래밍", "비트 출판사", 2000);
  }
}