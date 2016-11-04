
package step05;

 public class Exam045_7 {
   static int a = 20;
   public static void main(String[] args) {
 int a = 100; // 로컬 변수에서 a라는 이름이 없기 때문에 클래스에서 찾음
 m1(a); // 메서드 실행 + 되돌아오다 = 메서드 호출(콜)
 System.out.printf("main-->%d\n", a);

 m1(a);
 System.out.printf("main-->%d\n", a);

 m1(a);
 System.out.printf("main-->%d\n", a);
}

static void m1(int a) {
  System.out.printf("m1-->%d\n", a); // 호출이 이미 끝났기에 a = 300으로 바꿔도 상관 x
  a = 300;
} // 이블록이 끝나면 다시 m1(a)로 돌아가라 라는 뜻

}
