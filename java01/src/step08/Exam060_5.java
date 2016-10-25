// 오버로딩의 규칙
package step08;

 public class Exam060_5 {
static class Book {
  String title;
  String author;
  String press;
  int price;
  int pages;

//
  Book() {}
  Book(String title) {
    System.out.println("Book(String) 호출");
  }

  Book(String title, String author) {
    System.out.println("Book(String,String) 호출");
    this.title = title;
    this.author = author;
  }


// 컴파일 오류
// 메서드를 찾을 때 넘겨주는 값의 타입과 개수로 찾기 때문에
// 파라미터의 이름이 다르더라도 타입이 같으면
// 같은 메서드이기에 중복 선언 불가!
  Book(String title, String press) { // 컴파일 오류, 위의 생성자의 파라미터 타입이 같아서
    System.out.println("Book(String,String) 호출");
    this.title = title;
    this.author = press;
  }

  Book(String title, String press, int price) {
    System.out.println("Book(String,String,int) 호출");
    this.title = title;
    this.press = press;
    this.price = price;
  }
}

   public static void main(String[] args) {
     // 두 명령 모두 같은 타입의 값을 생성자에게 전달하기 때문에 메서드 구분 안된다.
Book b1 = new Book("자바 프로그래밍", "홍길동");
Book b2 = new Book("자바 프로그래밍", "비트출판사");


}

}





/*
#
*/
