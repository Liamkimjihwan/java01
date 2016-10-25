
package step06;

 public class Exam054_1 {

   static void greeting(String... names) { // [] 배열 넣으면 무조건 [] 넣어야함
     System.out.print("Hello, ");
     for (String name : names) { // varargs 가변 개수 아규먼트의 파라미터는 배열처럼 사용
       System.out.print(name + ",");
     }
     System.out.println();
   }// "Hello, world!" 출력

   public static void main(String[] args) {
     // greeting(new String[]{"홍길동", "임꺽정", "유관순"}); 이렇게 안해도 됨
     // String... 때문에
    greeting("홍길동");
    greeting("홍길동", "임꺽정");
    greeting("홍길동", "임꺽정", "유관순");
    greeting("홍길동", "임꺽정", "유관순","안중근");
   }
 }





/*
메서드 정의 문법





*/
