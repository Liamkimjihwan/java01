
package step04;

 public class Exam036_1 {
   public static void main(String[] args) {
     int a = 10, b = 7;   // 이미 여기서 int로 결과값 나온상태..이기에 결과는 '1'
     int result = a / b;


     System.out.println(result);

   float result2 = a / b; //연산 결과는 int 값이다 (= 1.0만 나옴)
   System.out.println(result2);


   float a2 = 10, b2 = 7; //float로 결과값 나오게끔 해야함.
   result2 = a2 / b2;

   System.out.prinln(result2);

   }
 }
