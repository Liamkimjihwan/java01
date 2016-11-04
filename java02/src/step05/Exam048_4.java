
package step05;

 public class Exam048_4 {
   public static void main(String[] args) {
   int count = 0;
   int count2 = 0;  // 0 부터
   while (count++ < 5) { // {} 안에 while 있는거까지 5번 반복
     while (count2++ < 3) {
       System.out.println("*****");
       if (count > 2) // 카운트가 2보다 클 때 별을 그만두고 "---" 출력
       break;
     }
     count2 = 0; // 위 while count2가 출력되고 되돌아갈 때 이미 3이기 때문에 더이상 출력 불가능
     //             따라서 다시 0으로 리셋 시켜줘야 함.  System.out.println("*****"); 반복 가능
     System.out.println("---------------");
   }



}
 }



/*

break 명령어는 현재 실행하는 while 블록을 나간다.



*/
