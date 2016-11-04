
package step06;

 public class Exam054_2 {

   static int sum(int[] values) { // [] 배열 넣으면 무조건 [] 넣어야함
// int 값 리턴 합계이기에 sum, sum은 int값으로 구하기 때문에 int, value는 값
     int result = 0;
     for (int value : values) {
       result += value;
     }
     return result;
   }
   static int sum2(int... values) {
     int result = 0;
     for (int value : values) {
       result += value;
     }
     return result;
   }


   public static void main(String[] args) {
     int result = sum(new int[]{100, 100, 100});
     System.out.println(result);
     System.out.println(sum(new int[]{90,90,90,90,90}));
     System.out.println("---------------------------");

    System.out.println(sum2(100,100,100));
    System.out.println(sum2(90,90,90,90,90));
    System.out.println("---------------------------");


    // 가변 개수 아규먼트인 경우 배열을 넘겨도 된다.
    System.out.println(sum2(new int[]{90,90,90,90,90}));

   }
 }






/*
int[]와 int...의 차이점





*/
