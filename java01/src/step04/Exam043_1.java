
package step04;

 public class Exam043_1 {
   public static void main(String[] args) {

int a = 0b1100; // 12
                            // 1100 기준 12
System.out.println(a >> 1); // 110|0 6
System.out.println(a >> 2); // 11|00 3
System.out.println(a >> 3); // 1|100 1


int b = -12;
System.out.println(b >> 1); //
System.out.println(b >> 2); //
System.out.println(b >> 3); //
 }
}



/*
오른쪽 이동
- 2를 나눈것과 같다.
- 앞의 빈 자리가 부호비트로 채워진다.

- 양수일 때 (빈 자리는 0으로 채운다.)
빈자리는 0으로 채운다.
비트 이동 후 부호가 바뀌지 않는다.
- 음수일 때 빈자리는 1로 채워진다. 부호는 바뀌지않음




*/
