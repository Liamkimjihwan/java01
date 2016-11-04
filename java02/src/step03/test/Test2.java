package step03.test;
// 저자 , 책 이름, 가격, 출판일, 페이지
 public class Test2 {
  // 새로운 데이터 파일을 저장한다.
  static class Book {

  String title;
  String publisher;
  int pageSize;
  String language;
  String isbn;
  String[] authors;
  float width;
  float height;
  float thick;
  double price;
  boolean dvd;
}
  public static void main(String[] args) {
  //2) 데이터 타입에 따라 메모리(인스턴스)르 준비한다.
    Book book = new Book();
 //3) 준비한 메모리 안에 있는 변수에 값 저장
    book.title = "나미야 잡화점";
    book.publisher = "비트 출판사";
    book.pageSize = 783;
    book.language = "korean";
    book.isbn = "11-123-11";
    book.authors = new String[] {"홍길동","임꺽정"};
    book.width = 7.4f;
    book.height = 9.1f;
    book.thick = 1.6f;
    book.price = 83.33;
    book.dvd = false;


  System.out.println(book.title);
  System.out.println(book.publisher);
  System.out.println(book.pageSize);
  System.out.println(book.language);
  System.out.println(book.isbn);
  System.out.println(book.authors[0] + "," + book.authors[1]);
  System.out.println(book.width);
  System.out.println(book.height);
  System.out.println(book.thick);
  System.out.println(book.price);
  System.out.println(book.dvd);


   }
 }
