
package step04;

 public class Exam041_0 {
   public static void main(String[] args) {

int age = 19;
     // (조건) ? 참일 때 실행할 명령어 : 거짓일 때 실행할 명령어;
        // (조건) ? A : B;
        // A와 B는 결과를 리턴하는 명령어(statement)야 한다. "Expression(식)"
       // 조건이 참으면 a를  실행하고 거짓이면 b를 실행한다.


    // 컴파일 오류 a와 b 자리에 그냥 statement가 왔다. expression이 아니라
    // 결과가 없다는건 그 명령을 실행한 후 그 자리에 값이 놓이지 않는다는 말.
     //(10 < 19) ? System.out.println("10 < 20") : System.out.println("10 >= 20");


    // 조건 연산자는 반드시 그 값을 받아야 한다.
    // (age < 19) ? "미성년" : "성년"; // 컴파일 오류
    String result = (age < 19) ? "미성년" : "성년"; // ok
    System.out.println(result);

 }
}
