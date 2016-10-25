
package step04;

 public class Exam036_2 {
   public static void main(String[] args) {
     int a = 10, b = 7;

//1) 명시적 형 변환 전
float result = a / b;
System.out.println(result); //1.0

//2)명시적 형 변환 후
result = (float)a / (float)b;
// 임시로 float 형으로 바꿔주는
System.out.println(result);

   }
 }


/* 강제로 데이터 종류 바꾸기 - type casting or type conversion
1) 명시적 형 변환
문법 -> (변경할 타입)값
-> 기존 메모리의 종류가 바뀌는 것이 아니다.
-> 변경할 타입의 메모리가 내부적으로 몰래 생성된다.
    그리고 변경한 값이 저장된다.
2) 암시적 형 변환
문법 -> java에서 정한 규칙에 따라 자동으로 형 변환이 일어난다.
*/
