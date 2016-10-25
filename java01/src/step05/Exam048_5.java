
package step05;

 public class Exam048_5 {
   public static void main(String[] args) {
   int count = 0;
   int count2 = 0;  // 0 부터
   ohora: while (count++ < 5) { // 무한루프 안나오게 현재값 후위연산자
     while (count2++ < 3) {
       System.out.println("*****");
       if (count > 2)
       break ohora;
     }
     count2 = 0; // 위 while count2가 출력되고 되돌아갈 때 이미 3이기 때문에 더이상 출력 불가능
     //             따라서 다시 0으로 리셋 시켜줘야 함.  System.out.println("*****"); 반복 가능
     System.out.println("---------------");
   }

}


}




/*

현재 while 블록을 나가는 것이 아니라 바깥쪽 while 블록을 나가고 싶을 때
- 바깥 쪽 while 블록에 라벨을 붙여라.
그리고 break 다음 라벨명을 적으면 됨



*/
