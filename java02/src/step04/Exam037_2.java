
package step04;

 public class Exam037_2 {
   public static void main(String[] args) {
    // 전위 연산자 사용 전
    int a = 10;
    System.out.println(a);

    //2) 후위 연산자 사용 후

    int b = 10;

    System.out.println(b++);  // () 안에 실행이 완료가 되어야 ++ 값 1이 더해짐
    System.out.println(b);



   }
 }
