package step03.test;
// 저자 , 책 이름, 가격, 출판일, 페이지
 public class Test1 {
  public static void main(String[] args) {

  String title = "나미야 잡화점";
  String publisher = "비트출판사";
  int pageSize = 783;
  String language = "korean";
  String isbn = "11-123-11";
  String[] authors = {"홍길동", "임꺽정"};
  float width = 7.4f;
  float height = 9.1f;
  float thick = 1.6f;
  double price = 83.33;
  boolean dvd = false;

  System.out.println(title);
  System.out.println(publisher);
  System.out.println(pageSize);
  System.out.println(language);
  System.out.println(isbn);
  System.out.println(authors[0] + "," + authors[1]);
  System.out.println(width);
  System.out.println(thick);
  System.out.println(price);
  System.out.println(dvd);


   }
 }
