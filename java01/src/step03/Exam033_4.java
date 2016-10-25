package step03;

 public class Exam033_4 {
   public static void main(String[] args) {

   System.out.println(args.length);
   for (String value : args) {
     System.out.println(value + ",");
   }
System.out.println();  // 공백넣어두면 줄바꿈으로 인식
   }
 }

/*
main() 메서드에 선언된 String 배열의 용도
=> 자바 프로그램 실행할 때 넘겨준 값을 받는 배열
ex)
> java -cp bin Exam033_4 aaa bbb ccc 1234 라고 쓴다면

=> 자바 클래스 이름 뒤에 작업한 값을 공백을 기준으로 잘라서 배열에 남아 줌
args[0] = "aaa"
args[1] = "bbb"
args[2] = "ccc"

=> 이렇게 main() 메서드의 파라미터 변수로 넘어오는 값을 프로그램 아규먼트라 부름
=> 참고
java 명령 다음에 오는 -cp bin 과 같은 것을
"jvm 아규먼트 or 파라미터"라 부른다.



*/
