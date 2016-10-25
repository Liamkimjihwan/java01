
package step04;

 public class Exam042_0 {
   public static void main(String[] args) {

int a = 0b0110_1100;
int b = 0b0011_0001; // 두 비트 모두 1일 때만 1이다. 그외는 0이다.

//int c = a && b;  // && 이것은 논리 연산자이기 때문에 오류가 뜸
int c = a & b; // 피연산자가 정수 값이라면 &는 비트 연산자로 동작한다.

System.out.println(c);
System.out.println(Integer.toString(c, 2));


c = a | b;
System.out.println(c);
System.out.println(Integer.toString(c, 2));


c = a ^ b; // AND의 반대 두 비트
System.out.println(c);
System.out.println(Integer.toString(c, 2));

long c2 = ~a;
System.out.println(c2);
System.out.println(Integer.toString(c2, 2));
 }
}


/*
 비트 연산자
 - 비트 단위로 연산을 수행한다.
 - 보통 이미지 처리 프로그램에서 많이 사용한다.

1) AND(&) 비트 연산자
- 두 비트 모두 1일 때만 1이다. 그외는 0이다.
- 기존 값을 줄이는 효과가 있다.
2) OR(|) 비트 연산
- 두 비트 중 하나라도 1이면 1, 둘 다 0일때만 0이다.
- 기존 값을 높이는 효과가 있다.
3) XOR(^) 비트 연산자
- 두 비트가 다를 경우 결과는 1이다. 같으면 0이다.
- 두 값이 같은지 다른지 알아낼 때 ( 특정 색상 지울 때 사용가능)
- 특정 값을 제거할 때 많이 사용 (크로마키 영상)
4)NOT(~) 비트 연산자
- 대상 비트를 모두 반대 값으로 바꾼다.
1은 0으로 0은 1로 바꾼다.
(색상 반전 시킬 때)
*/
