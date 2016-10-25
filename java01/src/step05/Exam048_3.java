
package step05;

 public class Exam048_3 {
   public static void main(String[] args) {
   int count = 0;
   int count2 = 0;  // 0 부터
   while (count++ < 5) { // 무한루프 안나오게 현재값 후위연산자
     while (count2++ < 3) {
       System.out.println("*****");
     }
     count2 = 0; // 위 while count2가 출력되고 되돌아갈 때 이미 3이기 때문에 더이상 출력 불가능
     //             따라서 다시 0으로 리셋 시켜줘야 함.  System.out.println("*****"); 반복 가능
     System.out.println("---------------");
   }



}
 }



/*

while 과 break

- while 블록 안에서 break를 사용하면 즉시 반복 멈추고 while 블록 나간다.



*/
