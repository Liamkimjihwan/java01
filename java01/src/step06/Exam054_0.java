
package step06;

 public class Exam054_0 {

   static void greeting(String[] names) { // [] 배열
     System.out.print("Hello, ");
     for (String name : names) {
       System.out.print(name + ",");
     }
     System.out.println();
   }// "Hello, world!" 출력

   public static void main(String[] args) {
    greeting(new String[]{"홍길동", "임꺽정", "유관순"});
    //greeting("홍길동"); //컴파일 오류. 배열을 넣어줘야함 new String[] 넣어야한다.
  }
 }





/*
메서드 정의 문법





*/
