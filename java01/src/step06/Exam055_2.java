
package step06;

 public class Exam055_2 {

   static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): %d, %d\n", a, b);
   }
// 위에서 설정된 메모리는 아래로 움직일 수 없고 값만 이동 가능.
   public static void main(String[] args) {
    int a = 10, b = 20;
    swap(a, b);

  System.out.printf("main():%d, %d\n", a, b);
  }
 }





/*
call by value
-메서드를 호출할 때 넘겨주는 것이 일반 값일 경우





*/
