
package step05;

 public class Exam048_2 {
   public static void main(String[] args) {
   int a = Integer.parseInt(args[0]);


   int b = 0;
    while (true) {// 무한으로 반복하라.
    if (b > a)  // 내가 입력한거보다 크다면 멈춰라 라는 뜻
       break;
     System.out.printf("%d: 하하하\n", b++);
}


}
 }



/*

while 과 break

- while 블록 안에서 break를 사용하면 즉시 반복 멈추고 while 블록 나간다.



*/
