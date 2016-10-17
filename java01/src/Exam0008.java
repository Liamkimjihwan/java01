
public class Exam0008 {
  public static void main(String[] args) {
      m1("홍길동");
      m2("정봉준");
 }

static void m1(String name) {
 System.out.print(name);
 System.out.print("님 안녕하세요.\n");
 }

 private static void m2(String name) {
  System.out.print("Hello, ");
  System.out.print(name + "\n");
 }
}
