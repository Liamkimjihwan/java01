package step17;

public class Exam083_2 {

    static int plus(int a, int b) {return a + b;}
    static int minus(int a, int b) {return a - b;}
    static int multiple(int a, int b) {return a * b;}
    static int divide(int a, int b) {return a / b;}
static class Student {
   String name;
    String email;
    String tel;
    int age;
    boolean working;
// 인스턴스 메서드
// => ↓ 생성자인데 인스턴스의 값을 다루는 모든 메서드는 그 데이터 타입의 '연산자'라 할 수 있다.
// 인스턴스 생성할 때 최초로 자동으로 호출되는 메서드를 '생성자'라 한다.
Student(String name, String email, String tel, int age, boolean working) { // ★
  this.name = name;
 this.email = email;
 this.tel = tel;
 this.age = age;
 this.working = working;
}

void printStudent() { // ★                    ★★ = 연산자
 System.out.printf("%s,%s,%s,%d,%b\n",
   this.name, this.email, this.tel, this.age, this.working);
}
}

static class Calculator {
  static int sum = 0;
  static void plus(int a) {sum += a;}
  static void minus(int a) {sum -= a;}
  static void multiple(int a) {sum *= a;}
  static void divide(int a) {sum /= a;}
}
  public static void main(String[] args) {
    int sum = 0;
    sum = plus(3, 2);
    sum = multiple(sum, 3);
    sum = minus(sum, 1);
    System.out.println(sum);
     int sum2 = 0;
    sum2 = plus(2, 3);
    sum2 = multiple(sum2, 4);
    sum2 = minus(sum2, 3);
    System.out.println(sum2);

    // 인스턴스를 생성할 때 값을 넘겨주면
  Student[] arr = new Student[3];
   
  arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);// 생성자 호출명
  arr[1] = new Student("임꺽정", "leem@test.com", "111-1112", 30, false);
  arr[2] = new Student("유관순", "yoo@test.com", "111-1113", 40, true);
    // 그 값을 받을수 있는 생성자를 호출한다.
    // 만약 그 값을 받을 수 있는 생성자를 못 찾으면 컴파일 오류

//생성자는 다음과 같이 나중에 따로 호출할 수 없다.
// arr[0] Student("홍길동", "hong@test.com", "111-1111", 20, true); // 오류


for (Student student : arr) {
  student.printStudent();
}

Calculator.plus(3);
Calculator.plus(2);
Calculator.multiple(3);
Calculator.minus(1);

System.out.println(Calculator.sum);

}



  }

