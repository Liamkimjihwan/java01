/* 주제 : 멤버의 접근 제어 - private, (deault), protected, public
private => 같은 클래스에 소속된 멤버만 접근 가능.
           즉 클래스 안에서만 접근 가능.
(default) => 같은 패키지에 소속된 클래스는 접근 가능
protected = > 같은 패키지에 소속된 클래스 + 자손 클래스(다른 패키지라도 상관없음.)
public => 모두 공개


=> 접근 제어 명령은 변수, 메서드, 생성자, 이너 클래스에 붙일 수 있다.
  "static 블록"이나 "인스턴스 블록"은 접근 제어를 붙일 수 없다.

*/
package step16.ex4;

public class Exam087_0 {
  // public static // xxxxxxxxxxx
 private int v1;
 int v2;
 protected int v3;
 public int v4;
 

 public void m1() {
   this.v1 = 100; // 인스턴스 변수라는 걸 보여주기 위해 this 붙임.
   this.v2 = 200;
   this.v3 = 300;
   this.v4 = 400;
 }
 
  }


/*
#








*/
