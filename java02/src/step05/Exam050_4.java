
package step05;

 public class Exam050_4 {
   public static void main(String[] args) {
String[] names = {"홍길동", "임꺽정", "유관순". "안중근", "윤봉길"};
    for (int i = 0, i < names.length; i++) //  길이만큼 반복
     System.out.printf("%d:%s\n", i, names[i]); // %s 는 문자와 숫자 출력할때


  }
}






/*
for 반복문
= 인덱스를 가지고 반복할 때 자주 사용
특히 배열을 다룰 때 사용
문법은
for (변수선언부; 조건; 값 증가) 문장;
for (변수선언부; 조건; 값 증가) {문장1; 문장2; ...}


실행 순서
1) 변수 선언부 실행
2)조건 실행
3)문장 실행
4)값증가 실행
5) 2번으로 다시

*/
