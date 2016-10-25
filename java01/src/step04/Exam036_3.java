
package step04;

 public class Exam036_3 {
   public static void main(String[] args) {
     int a = 10, b = 7;

//1) 암시적 형 변환
float result = (float)a / b;  // 암시적으로 b에 대해 float 형 변환을 수행한다.
System.out.println(result); //1.xxxxx


result = a / (float)b;
// 임시로 float 형으로 바꿔주는
System.out.println(result); //1.xxx


//2) 암시적 형 변환 확인

int v1 - 100;
long v2 - 200;
// int result2 = v1 + v2; // v1 값에 대해 long으로 암시적 형 변환이 일어난다.
                      // 따라서 결과 값의 종류는 long 이다.
                      // 그래서 int 메모리 result2에 저장할 수 없는 것이다.
                      // 컴파일 단계에서 오류 발생!
   }
 }
