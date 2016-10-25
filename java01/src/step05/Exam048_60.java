
package step05;

 public class Exam048_60 {
   public static void main(String[] args) {
   int count = 5;
   int count2 = 0;

   while(count-- > 0) {
     while(count2++ <= count) {
     System.out.print("*");
   }
   System.out.println();
   count2 = 0;

}
}

}




/*

코딩순서
1) 1 ~ 5까지 반복하는 while 문을 작성하라.
   반복할 때마다 현재의 숫자를 출력하라.
2) * 문자를 찍는 반복


*/
