
package step04;

 public class Exam043_0 {
   public static void main(String[] args) {

int a = 0b1100; // 12
                            // 1100 기준 12
System.out.println(a << 1); // a값을 왼쪽으로 1비트 이동 0b11000 24
System.out.println(a << 2); // 110000 48
System.out.println(a << 3); // 1100000 96
System.out.println(a << 4); // 11000000 192

 }
}



/*
왼쪽 이동
- 2를 곱하기한것과 같다.
- 2를 곱하는 연산보다 속도가 빠르다. 비트 이동이기에
*/
