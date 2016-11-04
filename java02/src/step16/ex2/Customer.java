package step16.ex2;

public class Customer {
 private String name;
 private int age;
 private boolean gender;


 // 변수의 값을 설정하는 메서드 : setter
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

 // 값을 꺼내는 메서드 : getter
 public String getName() {return this.name;}
 public int getAge() {return this.age;}
 public boolean getGender() {return this.gender;}
}