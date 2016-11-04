package step16.ex5;

public class Customer {
 private String name;
 private int age;
 private boolean gender;


 // 변수의 값을 설정하는 메서드 : setter
 // 1) 셋터 (setter)
// => 접근이 제한된 변수에 값을 넣을 수 있도록 중재해주는 공개 메서드 = setter
// => 메서드 명은 set 으로 시작한다.
// set 다음의 이름은 단어 별로 첫 알파벳은 대문자로 한다.
// 예) setName, setFirstName, setLastName
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if (age < 0 || age > 130) { 
      throw new RuntimeException("나이가 유효하지 않습니다."); // 오류 메세지
    } // 메서드를 통해 값을 넣는 이유 = 오류 값을 넣지 않기 위해

    this.age = age; // 정상이라면 에이지 값에 에이지 넣어라
  }


  public void setGender(boolean gender) {
    this.gender = gender;
  }

/* // 값을 꺼내는 메서드 : getter
 // 2) 겟터
 접근이 제한된 변수의 값을 꺼낼 수 있도록 중재해주는 공개 메서드
 => 메서드 명은 get 으로 시작한다.
   단, 리턴 타입이 boolean인 경우 get도 사용할 수 있지만 주로 is 로 시작하는게 좋다.
 => get 다음의 이름은 단어 별로 첫 알파벳은 대문자로 한다.
// 예) getName, getFirstName, getLastName
 */
 public String getName() {return this.name;}
 public int getAge() {return this.age;}
 public boolean isGender() {return this.gender;}
}